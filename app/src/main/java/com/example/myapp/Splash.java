package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Splash extends AppCompatActivity {
ListView list;
    ArrayAdapter arrayadapter;
String stars[]={"Sun","Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

list =(ListView)findViewById(R.id.listview);
        arrayadapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,stars);
        list.setAdapter(arrayadapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //String stars=adapterView.getItemAtPosition(i).toString();
                //if(adapterView.getItemAtPosition(i).equals("-select stars-")) {
               // }else{
                Toast.makeText(getApplicationContext(), stars[i], Toast.LENGTH_LONG).show();
            }
        });
//            @Override
//            public void onNothing(AdapterView<?> adapterView) {
//
//            }
//        });







    }
}