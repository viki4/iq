package com.example.venkateshj.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;int count=0;
    ArrayList<Details> list=new ArrayList<>();
    int[] image_id={R.drawable.ee,R.drawable.zz,R.drawable.gg,R.drawable.ss,R.drawable.mo};
    String[] name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=getResources().getStringArray(R.array.categoryname);

        for(String Name:name)
        {

            Details details=new Details(image_id[count],Name);
            count++;
            list.add(details);
        }
        recyclerView =findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter=new DetailsAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
