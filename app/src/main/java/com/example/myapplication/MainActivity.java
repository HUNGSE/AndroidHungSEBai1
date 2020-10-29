package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private final LinkedList<String> mListHungSE=new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListHungSE.add("HgungSE");
        mListHungSE.add("HungSE");
        mListHungSE.add("HungSE");
        mListHungSE.add("HungSE");
        mListHungSE.add("HungSE");

        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this, mListHungSE);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}