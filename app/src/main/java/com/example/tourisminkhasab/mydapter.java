package com.example.tourisminkhasab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class mydapter extends RecyclerView.Adapter<myviHolder> {
    Context context;
    List<MyItemr> items;

    public mydapter(List<MyItemr> items){
        this.context = context;
        this.items= items;
    }

    @NonNull
    @Override
    public myviHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviHolder(LayoutInflater.from(context).inflate(R.layout.recy_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviHolder holder, int position) {
        holder.name.setText(items.get(position).getItemName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
