package com.kang.layout_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;


public class RvtActivity extends AppCompatActivity {


   private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<JSONObject> myDataset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvt);

        mRecyclerView = (RecyclerView) findViewById(R.id.poket_point_redeem_option_recycler_view);
      //  mRecyclerView.setNestedScrollingEnabled(false);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        myDataset = new ArrayList<JSONObject>();
        init();
        mAdapter = new RedeemOptionAdapter(myDataset, RvtActivity.this, RvtActivity.this);
        mRecyclerView.setAdapter(mAdapter);


    }

    public void init(){
      /*  ArrayList list=new ArrayList();
        Fruit f=new Fruit("apple","a");
        list.add(f);
        Fruit f2=new Fruit("apple1","a1");
        list.add(f2);
        myDataset=list;*/


     String data="[{\"text1\":\"a\",\"text2\":\"b\"},{\"text1\":\"c\",\"text2\":\"d\"}]";
      //  String data="{\"data\":[{\"text1\":\"gg\",\"text2\":\"aa\"},{\"text1\":\"gaa\",\"text2\":\"adda\"}]}";
        Log.d("json:",data);
//        JSONObject json=JSONObject.parseObject(data);
//       myDataset.add(json);
        JSONArray array=JSONObject.parseArray(data);

        myDataset.addAll(DataProcess.jsonArrayToArrayList(array));
    }
}
