package com.example.elyec.myaplicationaltice;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity implements OnClickListener{

    private EditText mEditText;

    public static final int MY_REQUEST_CODE=999;
    public static final String NAME_PARAM="algo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mEditText = (EditText) findViewById(R.id.editText);
        findViewById(R.id.button2).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this,mEditText.getText(),Toast.LENGTH_SHORT).show();
        //passImportantData(v,mEditText.getText().toString());

        AlertDialog alert = new AlertDialog.Builder(this)
                .setTitle("Titulo")
                .setMessage("Messaje")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(EditTextActivity.this,"Positive Messaje",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(EditTextActivity.this,"Negative Messaje",Toast.LENGTH_SHORT).show();

                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(EditTextActivity.this,"Neutral Messaje",Toast.LENGTH_SHORT).show();

                    }
                }).create();

        alert.show();
    }

    public void passImportantData(View view, String tex){
        Intent newIntent = new Intent(this, AutoCompleteTextViewActivity.class);
        newIntent.putExtra("hint",tex);
        newIntent.putExtra("boolVal", false);
        newIntent.putExtra("stringVal","este es el hint");
        Bundle b = new Bundle();
        b.putString("name","texto");

        newIntent.putExtra("bVal",b);
        //startActivity(newIntent);
        startActivityForResult(newIntent,MY_REQUEST_CODE);
    }

   // @Override
    //protected void OnActivityResult(int requestCode,int resultCode, Intent data){

    //}

}
