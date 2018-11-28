package com.pefjs.gametoolspefjs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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
                hostActivity();
                break;
            case R.id.button_join:

                break;
        }
    }

    public void hostActivity(){
        Intent intent = new Intent(this, NameScreenActivity.class);
        startActivity(intent);
    }
}
