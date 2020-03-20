package com.adarshpanig.librehealthpoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SearchHospital extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<String> diseaseList;
    public final static String dname="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hospital);

        final SearchView searchView3 = (SearchView) findViewById(R.id.search_bar3);
        ImageView icon = searchView3.findViewById(R.id.search_button);
        icon.setColorFilter(R.color.white);

        diseaseList= new ArrayList<>();

        recyclerView=findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(diseaseList);

       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(recyclerAdapter);

       diseaseList.add("tooth extraction");
       diseaseList.add("diabetes");
       diseaseList.add("heart attack");
       diseaseList.add("asthma");

        EditText editText =(EditText) searchView3.findViewById(R.id.search_src_text);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (
                        actionId == EditorInfo.IME_ACTION_SEARCH ||
                                //Physical keyboard enter key
                                (event != null && KeyEvent.KEYCODE_ENTER == event.getKeyCode()
                                        && event.getAction() == KeyEvent.ACTION_DOWN)) {
                                       Intent ip= new Intent(getApplicationContext(),HospitalsResult.class);
                                       ip.putExtra(dname,searchView3.getQuery().toString());

                    return true;
                }
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent b = new Intent(SearchHospital.this,HomePage.class);
        startActivity(b);
    }
}
