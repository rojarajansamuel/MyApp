package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    RadioGroup gender;
    RadioButton r1, r2;
    CheckBox c1, c2, c3, c4;
    Spinner sp;
    ArrayAdapter arrayAdapter;
    String states[]={"-select states-","Kerala","Tamilnadu","Karnataka","Goa","Andrapradesh","orissa","Bihar","jharkhand","Rajasthan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
//gender= (RadioGroup)findViewById(R.id.rg);
        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        c1=(CheckBox)findViewById(R.id.checkbox1);
        c2=(CheckBox)findViewById(R.id.checkbox2);
        c3=(CheckBox)findViewById(R.id.checkbox3);
        c4=(CheckBox)findViewById(R.id.checkbox4);
        sp=(Spinner)findViewById(R.id.spinner);

        arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,states);
        sp.setAdapter(arrayAdapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (adapterView.getItemAtPosition(i).equals("-select states-")) {

        } else {
            Toast.makeText(getApplicationContext(), states[i], Toast.LENGTH_LONG).show();
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});
//
//        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//    @Override
//    public void onCheckedChanged(RadioGroup radioGroup, int i) {
//        RadioButton rb=(RadioButton) findViewById(gender.getCheckedRadioButtonId());
//        String value=rb.getText().toString();
//        Toast.makeText(getApplicationContext(),"Gender is"+value,Toast.LENGTH_LONG).show();
//    }
//});
//  r1.setOnClickListener(new View.OnClickListener() {
//       @Override
//       public void onClick(View view) {
//         String value=r1.getText().toString();
//           Toast.makeText(getApplicationContext(),"Gender is"+value,Toast.LENGTH_LONG).show();
//       }
//   });
//        r2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String value=r2.getText().toString();
//                Toast.makeText(getApplicationContext(),"Gender is"+value,Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//}

//    public void click_login(View view) {
//        Intent i = new Intent(getApplicationContext(), LoginPage.class);
//                startActivity(i);
//
//
//    }
    }

    public void show(View view) {
        Boolean CheckedcheckBox = ((CheckBox) view).isChecked();

        String lang = "";

        switch (view.getId()) {
            case R.id.checkbox1:
                lang = CheckedcheckBox ? "English selected" : "English deselected";
                break;
        }
        switch (view.getId()) {
            case R.id.checkbox2:
                lang = CheckedcheckBox ? "Malayalam selected" : "Malayalam deselected";
                break;
        }
        switch (view.getId()) {
            case R.id.checkbox3:
                lang = CheckedcheckBox ? "Hindi selected" : "Hindi deselected";
                break;
        }
        switch (view.getId()) {
            case R.id.checkbox4:
                lang = CheckedcheckBox ? "Tamil selected" : "Tamil deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), "languages known are" + lang, Toast.LENGTH_LONG).show();


    }


    public void display(View view) {
        String langg = "languages are";
        if (c1.isChecked()) {
            langg += "\nEnglish";
        }
        if (c2.isChecked()) {
            langg += "\nMalayalam";
        }
        if (c3.isChecked()) {
            langg += "\nHindi";
        }
        if (c4.isChecked()) {
            langg += "\nTamil";
        }
        Toast.makeText(getApplicationContext(), "languages known are" + langg, Toast.LENGTH_LONG).show();


    }
}

