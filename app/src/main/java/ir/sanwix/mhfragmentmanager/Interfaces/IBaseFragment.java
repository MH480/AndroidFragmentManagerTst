package ir.sanwix.mhfragmentmanager.Interfaces;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;

/**
 * Created by m.hoseini on 3/15/2018.
 */

public interface IBaseFragment extends IBase
{
    @NonNull
    Context getAppContext();

    @IdRes
    int getFragmentContainerID();
}
