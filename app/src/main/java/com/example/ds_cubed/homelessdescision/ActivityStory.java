package com.example.ds_cubed.homelessdescision;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by root on 01/03/17.
 */

public class ActivityStory extends Activity implements
        GestureDetector.OnGestureListener{

    private GestureDetectorCompat detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_story);

        detector = new GestureDetectorCompat(this,this);

        addStoryText("This is the first page of an unfinished story");
        addStoryText("This is the second");
        addStoryImage(R.drawable.field);
        addStoryText("This is the final page");
    }

    private void addStoryText(String text) {
        ViewFlipper storyLayout = (ViewFlipper) findViewById(R.id.storyFlipper);

        TextView valueTV = new TextView(this);
        valueTV.setText(text);
        valueTV.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        valueTV.setTextColor(getResources().getColor(R.color.storyText));

        storyLayout.addView(valueTV);
    }

    private void addStoryImage(int img) {
        ViewFlipper storyLayout = (ViewFlipper) findViewById(R.id.storyFlipper);

        ImageView valueIV = new ImageView(this);
        valueIV.setImageResource(img);
        valueIV.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));

        storyLayout.addView(valueIV);
    }

    public void onClickStoryFlipperNext(View v) {
        ViewFlipper storyLayout = (ViewFlipper) findViewById(R.id.storyFlipper);
        storyLayout.setInAnimation(this,R.anim.in_from_right);
        storyLayout.setOutAnimation(this,R.anim.out_to_left);
        storyLayout.showNext();
    }

    public void onClickStoryFlipperPrev(View v) {
        ViewFlipper storyLayout = (ViewFlipper) findViewById(R.id.storyFlipper);
        storyLayout.setInAnimation(this,R.anim.in_from_left);
        storyLayout.setOutAnimation(this,R.anim.out_to_right);
        storyLayout.showPrevious();
    }

    public void onSwipeStoryFlipperNext() {
        ViewFlipper storyLayout = (ViewFlipper) findViewById(R.id.storyFlipper);
        if (storyLayout.getCurrentView() != storyLayout.getChildAt(storyLayout.getChildCount()-1)){
            storyLayout.setInAnimation(this, R.anim.in_from_right);
            storyLayout.setOutAnimation(this, R.anim.out_to_left);
            storyLayout.showNext();
        }
        else {
            Intent returnToMenu = new Intent(this, Main.class);
            startActivity(returnToMenu);
        }
    }

    public void onSwipeStoryFlipperPrev() {
        ViewFlipper storyLayout = (ViewFlipper) findViewById(R.id.storyFlipper);
        if (storyLayout.getCurrentView() != storyLayout.getChildAt(0)) {
            storyLayout.setInAnimation(this, R.anim.in_from_left);
            storyLayout.setOutAnimation(this, R.anim.out_to_right);
            storyLayout.showPrevious();
        }
        else {
            Intent returnToMenu = new Intent(this, Main.class);
            startActivity(returnToMenu);
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.detector.onTouchEvent(event);
        // Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {

        if (velocityX > 0)
            onSwipeStoryFlipperPrev();
        else if (velocityX < 0)
            onSwipeStoryFlipperNext();
        return true;
    }

    //Unused motion events

    @Override
    public boolean onDown(MotionEvent event) {
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
                            float distanceY) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        return true;
    }



}