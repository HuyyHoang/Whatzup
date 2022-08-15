package com.corona.whatzup.Models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.corona.whatzup.R;
import com.corona.whatzup.databinding.ItemStatusBinding;

import java.util.ArrayList;

public class TopStatusAdapters extends RecyclerView.Adapter<TopStatusAdapters.TopStatusViewHolder>{

    Context context;
    ArrayList<UserStatus> userStatuses;

    public TopStatusAdapters(Context context, ArrayList<UserStatus> userStatuses) {
        this.context = context;
        this.userStatuses = userStatuses;
    }

    @NonNull
    @Override
    public TopStatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_status, parent, false);
        return new TopStatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopStatusViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return userStatuses.size();
    }

    public class TopStatusViewHolder extends RecyclerView.ViewHolder {

        ItemStatusBinding binding;

        public TopStatusViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemStatusBinding.bind(itemView);
        }
    }
}
