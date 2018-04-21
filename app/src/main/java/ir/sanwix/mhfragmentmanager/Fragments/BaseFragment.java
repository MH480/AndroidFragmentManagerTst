package ir.sanwix.mhfragmentmanager.Fragments;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.sanwix.mhfragmentmanager.Interfaces.IBaseFragment;
import ir.sanwix.mhfragmentmanager.Utils.MHFragmentManager;

/**
 * Created by m.hoseini on 4/21/2018.
 */

public abstract class BaseFragment extends Fragment implements IBaseFragment
{
    protected MHFragmentManager fm
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        fm = new MHFragmentManager(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName();
    }

    @Override
    public void initializeMap()
    {

    }

    @Override
    public Location getCurrentLocation()
    {
        return null;
    }

    @Nullable
    @Override
    public Location getSelectedLocation()
    {
        return null;
    }

    @Override
    public void ShowOnMap(Location location)
    {

    }

    @Override
    public void ShowOnMap_Get_Address(Location location)
    {

    }

    @Override
    public void getAddressFromLocation(Location location)
    {

    }

    @Override
    public void getLocationFromAddress(String address)
    {

    }

    @Override
    public int[] getTelephony()
    {
        return new int[0];
    }

    @Override
    public String get_Address()
    {
        return null;
    }

    @Override
    public void set_province(String _provinceName)
    {

    }

    @Override
    public void set_province(int _provinceId)
    {

    }

    @NonNull
    @Override
    public Location get_location()
    {
        return null;
    }

    @Override
    public void setLocationAndReturnAddressToOnSendData(@NonNull Location location)
    {

    }

    @Override
    public void remove_location()
    {

    }

    @Override
    public boolean isRtl()
    {
        return false;
    }

    @Override
    public boolean isNullOrEmpty(Object obj)
    {
        return false;
    }

    @NonNull
    @Override
    public Context getAppContext()
    {
        return null;
    }

    @Override
    public int getFragmentContainerID()
    {
        return 0;
    }
}
