package com.pefjs.gametoolspefjs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        switch(view.getId()) {
            case R.id.button_play:

                break;
            case R.id.button_host:

                break;
            case R.id.button_join:

                break;
        }
    }
}
