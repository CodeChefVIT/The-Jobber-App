package com.anuj.thejobberapp.ui.history;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.anuj.thejobberapp.R;
import com.anuj.thejobberapp.item.Job;

import java.util.List;

public class JobHistoryAdapter extends RecyclerView.Adapter<JobHistoryAdapter.ViewHolder> {
    private List<Job> mData;

    // data is passed into the constructor
    public JobHistoryAdapter(List<Job> data) {
        this.mData = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public JobHistoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_history_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Job item = mData.get(position);
        holder.Desc.setText(item.getDesc());
        holder.Bids.setText(item.getBids()+" Bid(s)");
        String price=String.valueOf(item.getPrice());
        holder.Price.setText(price);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView Desc,Price,Bids;

        ViewHolder(View itemView) {
            super(itemView);
            Desc = itemView.findViewById(R.id.tvDescHist);
            Price = itemView.findViewById(R.id.tvAmountHist);
            Bids = itemView.findViewById(R.id.tvBidsHist);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }

    // convenience method for getting data at click position
    Job getItem(int id) {
        return mData.get(id);
    }

    // allows clicks events to be caught

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
