package ir.sanwix.mhfragmentmanager.Utils;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import ir.sanwix.mhfragmentmanager.Base.BaseActivty;
import ir.sanwix.mhfragmentmanager.Fragments.BaseFragment;
import ir.sanwix.mhfragmentmanager.Interfaces.IBase;
import ir.sanwix.mhfragmentmanager.Interfaces.IBaseActivity;
import ir.sanwix.mhfragmentmanager.Interfaces.IBaseFragment;
import ir.sanwix.mhfragmentmanager.Interfaces.IFragmentManager;

/**
 * Created by m.hoseini on 4/21/2018.
 */

public class MHFragmentManager implements IFragmentManager
{
    private FragmentManager mFragmentManager;
    private FragmentManager mChildFragmentManager;

    @IdRes
    private int ContainerID;


    public <Entery extends IBase> MHFragmentManager(Entery _host)
    {
        if (_host instanceof IBaseActivity)
        {
            BaseActivty ContainerActivity = ((BaseActivty) _host);
            mFragmentManager = ContainerActivity.getSupportFragmentManager();
            ContainerID = ((BaseActivty) _host).getContainerID();
        }
        else if (_host instanceof IBaseFragment)
        {
            BaseActivty ContainerActivity = ((BaseActivty) ((BaseFragment) _host).getActivity());
            mChildFragmentManager = ((BaseFragment) _host).getChildFragmentManager();
            mFragmentManager = ContainerActivity.getSupportFragmentManager();
            ContainerID = ((BaseFragment) _host).getFragmentContainerID();
        }
    }

    //region Internal Functions
    private boolean checkFM()
    {
        return mFragmentManager != null;
    }

    private boolean checkChildFM()
    {
        return mChildFragmentManager != null;
    }

    private void start(FragmentManager fm, BaseFragment fragment, boolean setAsRoot)
    {
        Fragment f = fm.findFragmentByTag(fragment.toString());
        FragmentTransaction ft = fm.beginTransaction();
        if (f == null)
            ft.add(ContainerID, fragment, fragment.toString());
        else
            ft.attach(f);
        ft.addToBackStack(setAsRoot ? null : fragment.toString())
                .commit();
    }

    private void pop(FragmentManager fm, BaseFragment fragment, boolean isSelfInclude)
    {
        fm.popBackStack(fragment.toString(), isSelfInclude ? FragmentManager.POP_BACK_STACK_INCLUSIVE : 0);
    }
    //endregion

    @Override
    public void startFragment(BaseFragment fragment)
    {
        startFragment(fragment, false);
    }

    @Override
    public void startFragment(BaseFragment fragment, boolean setAsRoot)
    {
        if (checkFM())
        {
            start(mFragmentManager, fragment, setAsRoot);
        }
    }

    @Override
    public void pop(BaseFragment fragment)
    {
        popTo(fragment, true);
    }

    @Override
    public void popTo(BaseFragment fragment)
    {
        popTo(fragment, false);
    }

    @Override
    public void popTo(BaseFragment fragment, boolean isSelfInclude)
    {
        if (checkFM())
        {
            pop(mFragmentManager, fragment, isSelfInclude);
        }
    }

    @Override
    public void startChildFragment(BaseFragment fragment)
    {
        startChildFragment(fragment, false);
    }

    @Override
    public void startChildFragment(BaseFragment fragment, boolean setAsRoot)
    {
        if (checkChildFM())
        {
            start(mChildFragmentManager, fragment, setAsRoot);
        }
    }

    @Override
    public void popChild(BaseFragment fragment)
    {
        popChildTo(fragment, true);
    }

    @Override
    public void popChildTo(BaseFragment fragment)
    {
        popChildTo(fragment, false);
    }

    @Override
    public void popChildTo(BaseFragment fragment, boolean isSelfInclude)
    {
        if (checkChildFM())
        {
            pop(mChildFragmentManager, fragment, isSelfInclude);
        }
    }
}
