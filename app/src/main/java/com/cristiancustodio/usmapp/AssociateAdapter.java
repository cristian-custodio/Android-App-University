package com.cristiancustodio.usmapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class AssociateAdapter extends RecyclerView.Adapter<AssociateAdapter.ViewHolder> {
//use alt + enter


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.associates_course_list, parent, false);
        return  new ViewHolder(v);
    }


    @Override
    public int getItemCount() {
        return associateListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    public TextView textViewHead;
        public TextView textViewDesc;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
        }
    }

    private List<AssociateListItem> associateListItems;
    private Context context;


    public AssociateAdapter(List<AssociateListItem> associateListItems, Context context) {
        this.associateListItems = associateListItems;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AssociateListItem associateListItem = associateListItems.get(position);
        holder.textViewDesc.setText(associateListItem.getDesc());
        holder.textViewHead.setText(associateListItem.getHead());
    }
}
