package co.hackdevmentalists.mvppattern.View;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.hackdevmentalists.mvppattern.ApplicationInterfaces.RequiredViewOps;
import co.hackdevmentalists.mvppattern.R;

public class MainActivity extends AppCompatActivity implements RequiredViewOps {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }

    @Override
    public Context getActivityContext() {
        return this;
    }
}
