package com.example.android.mycurrentcity;

public class CityInfo {
    private int mImage;
    private String minfo;
    private String mspeciality;
    private String mTitle;
    private String maddress;


    public CityInfo(int mImage, String mTitle, String minfo, String mspeciality, String maddress) {
        this.mImage = mImage;
        this.minfo = minfo;
        this.mspeciality = mspeciality;
        this.mTitle = mTitle;
        this.maddress = maddress;
    }

    public int getmImage() {
        return mImage;
    }

    public String getMinfo() {
        return minfo;
    }

    public String getMspeciality() {
        return mspeciality;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getMaddress() {
        return maddress;
    }

}
