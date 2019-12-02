package com.kang.layout_02;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;




import java.util.ArrayList;

public class DataProcess {

    public static ArrayList<JSONObject> jsonArrayToArrayList(JSONArray jsArray) {
        ArrayList<JSONObject> list = new ArrayList<JSONObject>();
        if (jsArray != null) {
            for (int i = 0; i < jsArray.size(); i++) {
                try {
                    list.add(jsArray.getJSONObject(i));
                } catch (JSONException ex) {

                }
            }
        }
        return list;
    }
}
