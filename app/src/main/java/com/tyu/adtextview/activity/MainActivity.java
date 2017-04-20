package com.tyu.adtextview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.tyu.adtextview.R;
import com.tyu.adtextview.entity.AdData;
import com.tyu.adtextview.view.ADTextView;
import com.tyu.adtextview.view.OnAdConetentClickListener;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {
    private ADTextView ad_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ad_textview= (ADTextView) findViewById(R.id.ad_textview);
        ArrayList<AdData> data=new ArrayList<>();
        for (int i=0;i<3;i++){
            AdData mdata=new AdData();
            mdata.head="劲爆！";
            mdata.content="降价了！！！！"+i;
            data.add(mdata);
        }
        ad_textview.setData(data);
        ad_textview.setMode(ADTextView.RunMode.DONW);
        ad_textview.setOnAdConetentClickListener(new OnAdConetentClickListener() {
            @Override
            public void OnAdConetentClickListener(int index, AdData data) {
                Toast.makeText(MainActivity.this,data.content,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
