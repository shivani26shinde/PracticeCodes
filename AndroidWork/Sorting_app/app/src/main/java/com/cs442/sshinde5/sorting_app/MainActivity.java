package com.cs442.sshinde5.sorting_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Integer> number =new ArrayList<Integer>();
    EditText value;
    ListView LView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LView = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<Integer> adpt=new ArrayAdapter<Integer>(this,
                android.R.layout.simple_list_item_1, number);
        LView.setAdapter(adpt);
        LView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        value = (EditText) findViewById(R.id.editText);
        Button ascend = (Button) findViewById(R.id.button);
        Button descend = (Button) findViewById(R.id.button2);
        ascend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String val= value.getText().toString();
                int num =Integer.parseInt(val);
                number.add(num);
                value.getText().clear();
                Collections.sort(number);
                adpt.setNotifyOnChange(true);
                LView.setAdapter(adpt);
            }
        });
        descend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String val= value.getText().toString();
                int num =Integer.parseInt(val);
                number.add(num);
                value.getText().clear();
                Comparator cmp = Collections.reverseOrder();
                Collections.sort(number, cmp);
                adpt.setNotifyOnChange(true);
                LView.setAdapter(adpt);
            }
        });
    }
}
