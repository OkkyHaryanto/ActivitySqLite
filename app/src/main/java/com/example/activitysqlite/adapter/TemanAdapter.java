package com.example.activitysqlite.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitysqlite.R;

import java.util.ArrayList;

import com.example.activitysqlite.database.Teman;

public class TemanAdapter extends RecyclerView.Adapter<TemanAdapter.TemanViewHolder> {
    private ArrayList<Teman> listData;

    public TemanAdapter(ArrayList<Teman> listData) {
        this.listData = listData;
    }

    public TemanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInf = LayoutInflater.from(parent.getContext());
        View view = layoutInf.inflate(R.layout.row_data_teman,parent,false);
        return new TemanViewHolder(view);
    }


    @Override
    public void onBindViewHolder(TemanViewHolder holder, int position) {
        String nm,tlp;

        nm = listData.get(position).getNama();
        tlp = listData.get(position).getTelpon();

        holder.namatxt.setTextColor(Color.RED);
        holder.namatxt.setTextSize(20);
        holder.namatxt.setText(nm);
        holder.telpontxt.setText(tlp);


    }

    @Override
    public int getItemCount() {
        return (listData != null)?listData.size(): 0;
    }

    public class TemanViewHolder extends RecyclerView.ViewHolder {
        private CardView cardku;
        private TextView namatxt,telpontxt;
        public TemanViewHolder(View view) {
            super(view);
            cardku = (CardView) view.findViewById(R.id.kartuku);
            namatxt = (TextView) view.findViewById(R.id.textNama);
            telpontxt = (TextView) view.findViewById(R.id.textTelpon);
        }
    }
}
