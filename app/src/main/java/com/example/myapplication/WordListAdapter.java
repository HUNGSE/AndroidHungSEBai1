package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends  RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<String> mListHungSE;
    private LayoutInflater mInflater;
    public WordListAdapter(Context context,LinkedList<String> mListHungSE) {
        mInflater = LayoutInflater.from(context);
        this.mListHungSE = mListHungSE;

    }
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }
    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent = mListHungSE.get(position);
        holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mListHungSE.size();
    }

    public class WordViewHolder extends  RecyclerView.ViewHolder {
        public final TextView wordItemView;
        final WordListAdapter mListAdapter;

        public WordViewHolder(View itemView, WordListAdapter mListAdapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mListAdapter = mListAdapter;
        }
    }
}
