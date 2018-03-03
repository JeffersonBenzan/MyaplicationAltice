package com.example.elyec.myaplicationaltice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        LinearLayout layout = (LinearLayout) findViewById(R.id.scrollLayout);

        for (int i =0; i<=15; i++){
            Button button = new Button(this);
            button.setText("Button " + i );
            layout.addView(button);

        }


        //TextView textView = (TextView) findViewById(R.id.name);
        //TextView textView2 = (TextView) findViewById(R.id.institucion);
        //TextView textView3 = (TextView) findViewById(R.id.frase);
        //textView.setText(getString(R.string.tex_name));
        //textView2.setText((getString(R.string.institucion)));
        //textView3.setText(getString(R.string.frase));
        //Button linearLayoutVertiicalButton = (Button) findViewById(R.id.linearLayoutVertical);
        //linearLayoutVertiicalButton.setOnClickListener(this);

        //Button linearLayoutHorizontallButton = (Button) findViewById(R.id.linearLayoutHorizontal);
        //linearLayoutHorizontallButton.setOnClickListener(this);

        //Button relativeLayoutButton = (Button) findViewById(R.id.relativeLayout);
        //relativeLayoutButton.setOnClickListener(this);

        //Button frameveLayoutButton = (Button) findViewById(R.id.frameLayout);
        //frameveLayoutButton.setOnClickListener(this);

        //Button tableLayoutButton = (Button) findViewById(R.id.tableLayout);
        //tableLayoutButton.setOnClickListener(this);

        //Button listViewButton = (Button) findViewById(R.id.listView);
        //listViewButton.setOnClickListener(this);

        //Button gridViewButton = (Button) findViewById(R.id.gridView);
        //listViewButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.linearLayoutVertical:
                intent = new Intent(MainActivity.this, LinearLayoutVerticalActivity.class);
                startActivity(intent);
                break;
            case R.id.linearLayoutHorizontal:
                intent = new Intent(MainActivity.this, LinearLayoutHorizontal.class);
                startActivity(intent);
                break;
            case R.id.relativeLayout:
                intent = new Intent(MainActivity.this, RalativeLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.frameLayout:
                intent = new Intent(MainActivity.this, FrmaLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.tableLayout:
                intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.listView:
                intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
                break;
            case R.id.gridView:
                intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
