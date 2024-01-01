package com.example.tourisminkhasab;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviHolder extends RecyclerView.ViewHolder {

    TextView name;
    public myviHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.tex1);

    }


}
