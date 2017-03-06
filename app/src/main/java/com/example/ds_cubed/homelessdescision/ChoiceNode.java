package com.example.ds_cubed.homelessdescision;
//POINTLESS
import android.app.Activity;

import java.util.List;
import java.util.Map;

/**
 * Created by p16206069 on 28/02/2017.
 */

public class ChoiceNode extends Node {
    private String text;
    private Map<String, ResultNode> choices;

    public ChoiceNode(String text, Map<String, ResultNode> choices) {
        this.text = text;
        this.choices = choices;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<String, ResultNode> getChoices() {
        return choices;
    }

    public void setChoices(Map<String, ResultNode> choices) {
        this.choices = choices;
    }


}
