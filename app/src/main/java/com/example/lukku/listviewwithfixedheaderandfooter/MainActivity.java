package com.example.lukku.listviewwithfixedheaderandfooter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myListView);

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("AAAAAAA AAAAA");
        myArrayList.add("BBBBBBB BBBBB");
        myArrayList.add("CCCCCCC CCCCC");
        myArrayList.add("DDDDDDD DDDDD");
        myArrayList.add("EEEEEEE EEEEE");
        myArrayList.add("FFFFFFF FFFFF");
        myArrayList.add("GGGGGGG GGGGG");
        myArrayList.add("HHHHHHH HHHHH");
        myArrayList.add("IIIIIII IIIII");
        myArrayList.add("JJJJJJJ JJJJJ");
        myArrayList.add("KKKKKKK KKKKK");
        myArrayList.add("LLLLLLL LLLLL");
        myArrayList.add("MMMMMMM MMMMM");
        myArrayList.add("NNNNNNN NNNNN");
        myArrayList.add("OOOOOOO OOOOO");
        myArrayList.add("PPPPPPP OOOOO");
        myArrayList.add("QQQQQQQ QQQQQ");
        myArrayList.add("RRRRRRR RRRRR");
        myArrayList.add("SSSSSSS SSSSS");
        myArrayList.add("TTTTTTT TTTTT");
        myArrayList.add("UUUUUUU UUUUU");
        myArrayList.add("VVVVVVV VVVVV");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myArrayList);
        listView.setAdapter(arrayAdapter);
    }
}
