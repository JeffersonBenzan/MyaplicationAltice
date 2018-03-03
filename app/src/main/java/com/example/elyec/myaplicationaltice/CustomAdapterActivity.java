package com.example.elyec.myaplicationaltice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elyec on 24/02/2018.
 */

public class CustomAdapterActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        // Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        // Populate the data source
        for (int i = 0 ; i < 20 ; i++){
            arrayOfUsers.add(new User("Jose"+i,"En su casa"));
        }
        // ....
        // Create the adapter to convert the array to views
        UserAdapter adapter = new UserAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.listViewComponent);
        listView.setAdapter(adapter);
    }

}
