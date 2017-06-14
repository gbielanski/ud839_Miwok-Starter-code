package com.example.android.miwok;

/**
 * Created by Grzegorz on 07.06.2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_SET;
    private static final int NO_IMAGE_SET = -1;
    private int mSoundResourceId;


    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int mImageResourceId, int soundResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = mImageResourceId;
        mSoundResourceId = soundResourceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImageResourceSet(){
        return mImageResourceId != NO_IMAGE_SET;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
