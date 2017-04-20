package com.tyu.adtextview.view;

import com.tyu.adtextview.entity.AdData;

/**
 * Created by guiya on 2017/4/20.
 * 广告被点击时回调
 */
public interface OnAdConetentClickListener {
    abstract void OnAdConetentClickListener(int index, AdData data);
}
