package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListView extends AppCompatActivity {
ListView flist;
String foodnames[]={"Apple","Apricot","Cherry","Mango","Kiwi","watermelon","Strawberry"};
int foodimages[]={R.drawable.Apple,R.drawable.Apricot,R.drawable.Cherry,R.drawable.Mango,R.drawable.kiwi,R.drawable.watermelon,R.drawable.strawberry};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        flist=(ListView) findViewById(R.id.foodlist);


        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),foodimages,foodnames);

flist.setAdapter(customAdapter);
flist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
});
    }
}