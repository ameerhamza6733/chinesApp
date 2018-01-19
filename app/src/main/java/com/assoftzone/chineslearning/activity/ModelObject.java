package com.assoftzone.chineslearning.activity;

import com.assoftzone.chineslearning.R;

/**
 * Created by Somia on 1/17/2018.
 */

public enum ModelObject {

    //Selecting Card View of Pinyin and Tones
    SelctPinyin(R.string.pinyin, R.layout.select_pinyin_card),SelectTone(R.string.tone, R.layout.tones_select_card);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
