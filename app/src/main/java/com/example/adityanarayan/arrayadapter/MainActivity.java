package com.example.adityanarayan.arrayadapter;

import android.app.ListActivity;
import android.inputmethodservice.Keyboard;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1. string array with list of animals.Each element is 1 row
        String[] animals = new String[]{"Dog", "Cat", "Camel", "Snake", "Rat", "Horse", "Monkey", "Pig", "Tiger", "Lion"};
        //defining new arayAdapter-which helpd map an array to a list on the screen
         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main, animals);
        //3 tell the list about arrayAdapter. This list will show array data is rows.

        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
       final String item=getListAdapter().getItem(position).toString();

        Toast.makeText(this,item+ " selected, position # "+ position,Toast.LENGTH_LONG).show();

            }
}











