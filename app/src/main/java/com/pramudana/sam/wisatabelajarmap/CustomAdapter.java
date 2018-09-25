package com.pramudana.sam.wisatabelajarmap;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pramudana.sam.wisatabelajarmap.Model.Wisata;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.pramudana.sam.wisatabelajarmap.DetailActivity.exGambar;
import static com.pramudana.sam.wisatabelajarmap.DetailActivity.exLat;
import static com.pramudana.sam.wisatabelajarmap.DetailActivity.exLong;
import static com.pramudana.sam.wisatabelajarmap.DetailActivity.exNama;

/**
 * Created by sampramudana on 9/24/18.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<Wisata> tourism;
    private Context context;

    public CustomAdapter(ArrayList<Wisata> tourism, Context context) {
        this.tourism = tourism;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.txtNama.setText(tourism.get(position).getNama());
        Picasso.with(context)
                .load(tourism.get(position).getGambar())
                .fit()
                .into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(exNama, tourism.get(position).getNama());
                intent.putExtra(exLat, tourism.get(position).getLati());
                intent.putExtra(exGambar, tourism.get(position).getGambar());
                intent.putExtra(exLong, tourism.get(position).getLongi());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tourism.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtWilayah, txtNama;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            txtNama = itemView.findViewById(R.id.txtNama);
            txtWilayah = itemView.findViewById(R.id.txtWilayah);
        }
    }
}
