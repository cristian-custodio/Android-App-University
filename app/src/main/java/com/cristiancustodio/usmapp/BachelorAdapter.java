package com.cristiancustodio.usmapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class BachelorAdapter extends RecyclerView.Adapter<BachelorAdapter.ViewHolder> {
//use alt + enter


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bachelors_course_list, parent, false);
        return  new ViewHolder(v);
    }


    @Override
    public int getItemCount() {
        return bachelorListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    public TextView textViewHead;
        public TextView textViewDesc;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead2);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc2);
        }
    }

    private List<BachelorListItem> bachelorListItems;
    private Context context;


    public BachelorAdapter(List<BachelorListItem> bachelorListItems, Context context) {
        this.bachelorListItems = bachelorListItems;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BachelorListItem bachelorListItem = bachelorListItems.get(position);
        holder.textViewDesc.setText(bachelorListItem.getDesc());
        holder.textViewHead.setText(bachelorListItem.getHead());
    }
}
