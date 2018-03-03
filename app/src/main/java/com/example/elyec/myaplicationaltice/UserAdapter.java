package com.example.elyec.myaplicationaltice;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elyec on 24/02/2018.
 */

public class UserAdapter extends ArrayAdapter {
    public UserAdapter(Context context, ArrayList<User> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = (User) getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.text1);
        TextView tvAddress = (TextView) convertView.findViewById(R.id.text2);
        tvName.setText(user.name);
        tvAddress.setText(user.address);
        return convertView;
    }
}
