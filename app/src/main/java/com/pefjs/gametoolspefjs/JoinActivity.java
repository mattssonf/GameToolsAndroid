package com.pefjs.gametoolspefjs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class JoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        final EditText numberfield = findViewById(R.id.numberfield_join);

        // This is supposed to show the keyboard when activity is loaded, but seems to not work atm.
        // Leaving in case it works on some phones.
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null)
            imm.showSoftInput(numberfield, InputMethodManager.SHOW_IMPLICIT);

        numberfield.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN
                        && keyCode == KeyEvent.KEYCODE_ENTER
                        && numberfield.length() == 4) {
                    // TODO: CREATE INTENT TO SWITCH TO THE NAME ACTIVITY
                    return true;
                }
                return false;
            }
        });
    }
}
