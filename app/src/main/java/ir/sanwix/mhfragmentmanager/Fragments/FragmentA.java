package ir.sanwix.mhfragmentmanager.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;

/**
 * Created by m.hoseini on 4/21/2018.
 */

public class FragmentA extends BaseFragment
{
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        getChildFragmentManager().popBackStack("", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
