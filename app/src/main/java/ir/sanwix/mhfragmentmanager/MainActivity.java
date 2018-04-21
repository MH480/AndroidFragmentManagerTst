package ir.sanwix.mhfragmentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.sanwix.mhfragmentmanager.Base.BaseActivty;

public class MainActivity extends BaseActivty
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
