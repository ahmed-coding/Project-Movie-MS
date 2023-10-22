package com.example.movieproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {
    private ArrayList<Movies> items;
    Context context;

    public AdapterList(ArrayList<Movies> items) {
        this.items = items;
    }

    public ArrayList<Movies> getItems() {
        return items;
    }

    public void setItems(ArrayList<Movies> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_film,parent,false);
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtScore.setText(items.get(position).getRating());
        holder.txtTitle.setText(items.get(position).getTitle());
        holder.pic.setImageResource(items.get(position).getPosterNormalImage());
        int positin2 = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                intent.putExtra("id", items.get(positin2).getId());
                intent.putExtra("title", items.get(positin2).getTitle());
                intent.putExtra("date", items.get(positin2).getDate());

                intent.putExtra("object", items.get(positin2));

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle,txtScore;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.titleText);
            txtScore = (TextView) itemView.findViewById(R.id.scoreTxt);
            pic = (ImageView) itemView.findViewById(R.id.pic);

        }
    }
}
