package com.example.ds_cubed.homelessdescision;
//POINTLESS
import android.app.Activity;

/**
 * Created by p16206069 on 28/02/2017.
 */

public class ResultNode extends Node {
    private String text;
    private StoryNode storyNode;

    public ResultNode(String text, StoryNode storyNode) {
        this.text = text;
        this.storyNode = storyNode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public StoryNode getStoryNode() {
        return storyNode;
    }

    public void setStoryNode(StoryNode storyNode) {
        this.storyNode = storyNode;
    }


}
