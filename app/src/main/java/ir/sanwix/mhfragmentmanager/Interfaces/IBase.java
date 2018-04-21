package ir.sanwix.mhfragmentmanager.Interfaces;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/**
 * Created by m.hoseini on 3/17/2018.
 */

public interface IBase
{
    void initializeMap();

    Location getCurrentLocation();

    @Nullable
    Location getSelectedLocation();

    void ShowOnMap(Location location);

    void ShowOnMap_Get_Address(Location location);

    void getAddressFromLocation(Location location);

    void getLocationFromAddress(String address);

    int[] getTelephony();

    String get_Address();


    void set_province(String _provinceName);

    void set_province(int _provinceId);

    @NonNull
    Location get_location();

    void setLocationAndReturnAddressToOnSendData(@NonNull Location location);

    void remove_location();

    boolean isRtl();

    boolean isNullOrEmpty(Object obj);

}
