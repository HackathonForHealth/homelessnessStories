package com.example.ds_cubed.homelessdescision;
//POINTLESS
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by p16206069 on 28/02/2017.
 */

public class StoryNode extends Node {
    private String text;
    private ChoiceNode choiceNode;

    public StoryNode(Activity activity, String text, ChoiceNode choice){
        this.text = text;
        this.choiceNode = choiceNode;
    }

//    public void buildLayout(final Activity activity){
//        Context context = activity.getApplicationContext();
//        RelativeLayout layout = new RelativeLayout(context);
//        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
//        ImageView imageView = new ImageView(context);
////        imageView.setImageResource(R.drawable);
//        layout.addView(imageView, lp);
//
//        TextView textView = new TextView(context);
//        lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        lp.addRule(RelativeLayout.BELOW, imageView.getId());
//        textView.setText(text);
//        layout.addView(textView);
//
//        Button nextButton = new Button(context);
//        nextButton.setText("Next");
//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                choiceNode.buildLayout(activity);
//            }
//        });
//        lp =  new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
//        activity.setContentView(layout, lp);
//    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ChoiceNode getChoiceNode() {
        return choiceNode;
    }

    public void setChoiceNode(ChoiceNode choiceNode) {
        this.choiceNode = choiceNode;
    }
}
