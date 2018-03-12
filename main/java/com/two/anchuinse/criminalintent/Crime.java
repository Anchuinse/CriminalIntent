package com.two.anchuinse.criminalintent;

import android.util.Log;

import java.text.DateFormat;
import java.util.UUID;
import java.util.Date;

/**
 * Created by Matt on 3/11/18.
 */

public class Crime {

    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mFormattedDate;

    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }

    public void setID(UUID ID) {
        mID = ID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getFormattedDate() {
        mFormattedDate = DateFormat.getDateInstance().format(mDate);
        return mFormattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        mFormattedDate = formattedDate;
    }
}
