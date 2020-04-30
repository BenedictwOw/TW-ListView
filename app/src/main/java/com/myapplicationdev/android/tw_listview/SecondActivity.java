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
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> module;
    String name[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lv2);
        tvYear = (TextView) findViewById(R.id.tvYear);
        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);


        module = new ArrayList<Module>();

        module.add(new Module("C208", true));
        module.add(new Module("C200", true));
        module.add(new Module("C346", true));

        aa = new ModuleAdapter(this,R.layout.row2,module);
        lv.setAdapter(aa);
        

    }
}
