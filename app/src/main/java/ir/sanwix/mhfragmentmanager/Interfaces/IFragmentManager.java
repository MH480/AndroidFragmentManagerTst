package ir.sanwix.mhfragmentmanager.Interfaces;

import ir.sanwix.mhfragmentmanager.Fragments.BaseFragment;

/**
 * Created by m.hoseini on 3/18/2018.
 */

public interface IFragmentManager
{
    void startFragment(BaseFragment fragment);
    void startFragment(BaseFragment fragment,boolean setAsRoot);

    void pop(BaseFragment fragment);
    void popTo(BaseFragment fragment);
    void popTo(BaseFragment fragment,boolean isSelfInclude);


    void replaceFragment(BaseFragment fragment,BaseFragment fragment2);
    void replaceChildFragment(BaseFragment fragment,BaseFragment fragment2);

    void startChildFragment(BaseFragment fragment);
    void startChildFragment(BaseFragment fragment,boolean setAsRoot);

    void popChild(BaseFragment fragment);
    void popChildTo(BaseFragment fragment);
    void popChildTo(BaseFragment fragment,boolean isSelfInclude);


}
