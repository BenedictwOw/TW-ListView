package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvDisplayYear;
    ArrayAdapter aa;
    ArrayList<Module> module;
    String name[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lv2);
        tvDisplayYear = (TextView) findViewById(R.id.tvYear);

        //Getting the intent so as to get the data inside the intent
        Intent i =getIntent();
        //Get the String array named info we passed in
        String[] info = i.getStringArrayExtra("info");

        tvDisplayYear.setText(info[0]);


        module = new ArrayList<Module>();

        module.add(new Module("C208", true));
        module.add(new Module("C200", false));
        module.add(new Module("C346", true));

        aa = new ModuleAdapter(this,R.layout.row2,module);
        lv.setAdapter(aa);


    }
}
