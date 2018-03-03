package com.example.elyec.myaplicationaltice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        String [] data = {"cat", "Dog", "Mouse"};
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.my_autoCompleteTextView);
        autoCompleteTextView.setAdapter( new ArrayAdapter<>(this, android.R.layout.select_dialog_item,data));
        autoCompleteTextView.setThreshold(1);


        //Reciviendo datos del anterior activity
        Intent receivedIntent = getIntent();
        String value = receivedIntent.getStringExtra("stringVal");
        String hint = receivedIntent.getStringExtra("hint");
        Bundle bundle = receivedIntent.getBundleExtra("bVal");

        Intent in = new Intent();
        in.putExtra("recivido","Desde otro");
       // autoCompleteTextView.setHint(bundle.getString("name"));
        autoCompleteTextView.setHint(hint);
        setResult(999,in);
    }
}
