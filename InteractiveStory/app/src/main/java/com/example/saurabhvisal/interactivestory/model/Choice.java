package com.example.saurabhvisal.interactivestory.model;

/**
 * Created by saurabhvisal on 28/10/15.
 */
public class Choice {
    private String mText;
    private int mNextPath;

    public Choice(String text, int nextPath){
        mText = text;
        mNextPath = nextPath;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPath() {
        return mNextPath;
    }

    public void setNextPath(int nextPath) {
        mNextPath = nextPath;
    }
}
