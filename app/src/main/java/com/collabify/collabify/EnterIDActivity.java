package com.collabify.collabify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class EnterIDActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.tralg.collabify.MESSAGE";
    public static final String SONG_ARRAY = "com.tralg.collabify.SONGS";

    Button joinRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_id);

        joinRoom = (Button) findViewById(R.id.join);



    }

    public void joinRoom(View view){
        Intent intent = new Intent(this, QueueActivity.class);
        EditText roomID = (EditText) findViewById(R.id.enterID);
        String message = roomID.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }

}
