package com.example.practica3_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;


    private String nombres [] = {"Samuel","Josefina","Rebeca","Teresa","Manuel", "Federico", "Luis",
            "Donaldo","Colosio","Salinas"};
    private String edades []  = {"15","35","56","70","10","27","62","43",
            "90","112"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1  = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_persons, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La edad de "+ lv1.getItemAtPosition(position) + " es "+ edades[(int) id] + " años." );
            }
        });
    }
}