package ir.sanwix.mhfragmentmanager.Base;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ir.sanwix.mhfragmentmanager.Interfaces.IBaseActivity;

/**
 * Created by m.hoseini on 4/21/2018.
 */

public abstract class BaseActivty extends AppCompatActivity implements IBaseActivity
{
    @Override
    public int getContainerID()
    {
        return 0;
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
}
