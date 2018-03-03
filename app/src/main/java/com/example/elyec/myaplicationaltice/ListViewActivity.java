package com.example.elyec.myaplicationaltice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listView = (ListView) findViewById(R.id.listViewComponent);

        List<String> list = new ArrayList<>();
        for (int i =0; i < 100; i++){
            list.add(Integer.toString(i+1));
        }
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        // Populate the data source
        for (int i = 0 ; i < 30 ; i++){
            arrayOfUsers.add(new User("Jose"+i,"En su casa"));
        }

        listView.setAdapter(new UserAdapter(this,arrayOfUsers));
    }
}
