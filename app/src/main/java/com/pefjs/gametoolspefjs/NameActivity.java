package com.pefjs.gametoolspefjs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    public static final String NAME = "com.pefjs.gametoolspefjs.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Button button = (Button) findViewById(R.id.button_submitName);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                passName();
            }
        });
    }

    //Sends the name to the next screen
    public void passName(){
        EditText nameText = (EditText) findViewById(R.id.editText_name);
        String stringName = nameText.getText().toString();

        Intent roomActivity = new Intent(this, RoomActivity.class);
        roomActivity.putExtra(NAME, stringName);

        startActivity(roomActivity);
    }
}
