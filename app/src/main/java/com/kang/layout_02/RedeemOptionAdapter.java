package com.kang.layout_02;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;




import java.util.ArrayList;

public class RedeemOptionAdapter extends RecyclerView.Adapter<RedeemOptionAdapter.RedeemOptionViewHolder> {
    private ArrayList<JSONObject> mDataset;
    private RequestQueue mQueue;
    private Context mContext;
    private Activity mActivity;

    public RedeemOptionAdapter(ArrayList<JSONObject> mDataset, Context mContext, Activity mActivity) {
        this.mDataset = mDataset;
        this.mContext = mContext;
        this.mActivity = mActivity;
    }

    @Override
    public RedeemOptionAdapter.RedeemOptionViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.redeem_option_item, parent, false);
        RedeemOptionViewHolder vh = new RedeemOptionViewHolder(v);
      //  mQueue = Volley.newRequestQueue(mContext);
        return vh;
    }

    @Override
    public void onBindViewHolder( RedeemOptionViewHolder holder, int position) {
        final RedeemOptionViewHolder myHolder = holder;
        String  text1 = "";
        String  text2 = "";

        try {
            text1 = mDataset.get(position).getString("text1");
            text2 = mDataset.get(position).getString("text2");
        } catch (JSONException ex) {

        }
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public  static class RedeemOptionViewHolder extends RecyclerView.ViewHolder{

            public View mRedeemOptionView;

            private TextView text1;
            private TextView text2;

        public RedeemOptionViewHolder(View v) {
            super(v);
            text1 = v.findViewById(R.id.text1);
            text2 = v.findViewById(R.id.text2);
            mRedeemOptionView = v;
        }

    }

}
