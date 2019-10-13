package com.anuj.thejobberapp.ui.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anuj.thejobberapp.R;
import com.anuj.thejobberapp.item.Job;
import com.anuj.thejobberapp.ui.home.JobViewAdapter;

import java.util.ArrayList;

public class HistoryFragment extends Fragment implements JobViewAdapter.ItemClickListener {

    private JobHistoryAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_history,container,false);
        RecyclerView recyclerView = rootView.findViewById(R.id.dashboardView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<Job> Completed= new ArrayList<>();
        Job j1 = new Job("Completed",1000);
        Completed.add(j1);
        adapter = new JobHistoryAdapter(Completed);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return rootView;
    }
    @Override
    public void onItemClick(View view, int position) {

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}