package com.example.ds_cubed.homelessdescision;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.HashMap;
import java.util.Map;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void onClickReadStory(View v) {
        Intent mainToStory = new Intent(this, ActivityStory.class);
        startActivity(mainToStory);
    }

}
