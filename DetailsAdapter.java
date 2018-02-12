package com.example.venkateshj.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by venkatesh.j on 11-02-2018.
 */

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder> {

    ArrayList<Details> details=new ArrayList<>();

    public DetailsAdapter(ArrayList<Details> details)
    {

        this.details=details;
    }
    @Override
    public DetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        DetailsViewHolder detailsViewHolder=new DetailsViewHolder(view);
        return detailsViewHolder;
    }

    @Override
    public void onBindViewHolder(DetailsViewHolder holder, int position) {
        Details DET=details.get(position);
        holder.cat_image.setImageResource(DET.getImage_id());
        holder.cat_name.setText(DET.getCat_name());

    }

    @Override
    public int getItemCount() {
        return details.size();
    }

    public static class DetailsViewHolder extends RecyclerView.ViewHolder{

        ImageView cat_image;
        TextView cat_name;

        public DetailsViewHolder(View view){

            super(view);
            cat_image=view.findViewById(R.id.cat_image1);
            cat_name=view.findViewById(R.id.cat_name1);
        }
    }
}
