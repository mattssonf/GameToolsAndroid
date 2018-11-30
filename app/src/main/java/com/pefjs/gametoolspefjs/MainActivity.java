package com.pefjs.gametoolspefjs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                Intent intentHost = new Intent(this, NameActivity.class);
                startActivity(intentHost);
                break;
            case R.id.button_join:
                Intent intentJoin = new Intent(this, JoinActivity.class);
                startActivity(intentJoin);
                break;
        }
    }

}
