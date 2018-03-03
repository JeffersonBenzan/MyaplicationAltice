package com.example.elyec.myaplicationaltice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        findViewById(R.id.my_imageView).setOnClickListener(this);
        findViewById(R.id.my_imageButton).setOnClickListener(this);
        checkBox = (CheckBox) findViewById(R.id.my_checkBox);
        checkBox.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //passImportantData(v,mEditText.getText().toString());
        Toast.makeText(this, checkBox.isChecked()? "Checked" : "Not checked",Toast.LENGTH_SHORT ).show();

        AlertDialog alert = new AlertDialog.Builder(this)
                .setTitle("Titulo")
                .setMessage("Messaje")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ImageButtonActivity.this,"Positive Messaje",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ImageButtonActivity.this,"Negative Messaje",Toast.LENGTH_SHORT).show();

                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ImageButtonActivity.this,"Neutral Messaje",Toast.LENGTH_SHORT).show();

                    }
                }).create();

        alert.show();
    }
}
