package com.example.example.model;

public class Data {

    private int mImageResource;
    private String mText;

    public Data(int imageResource,String tv1)
    {
        mImageResource=imageResource;
        mText=tv1;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
