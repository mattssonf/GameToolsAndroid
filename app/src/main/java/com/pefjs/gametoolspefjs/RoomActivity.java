package com.pefjs.gametoolspefjs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        Intent intent = getIntent();
        String username = intent.getStringExtra(NameActivity.NAME);

        String room = intent.getStringExtra(JoinActivity.ROOM);

        if(room == null) {
            // TODO: CREATE ROOM

            room = "9857";
        }

        ((TextView) findViewById(R.id.text_username)).setText(username);
        ((TextView) findViewById(R.id.text_room)).append(room);
    }
}
