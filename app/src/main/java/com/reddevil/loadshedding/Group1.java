package com.reddevil.loadshedding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.concurrent.ScheduledFuture;

/**
 * Created by mansubh on 12/20/15.
 */
public class Group1 extends Fragment {

    String[] dataForList = {"1","2","3","4","5","6","7"};




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_group1, container, false);

        RecyclerView scheduleView = (RecyclerView) view.findViewById(R.id.scheduleList);
        scheduleView.hasFixedSize();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        scheduleView.setLayoutManager(layoutManager);

        ScheduleListAdapter adapter = new ScheduleListAdapter(dataForList);
        scheduleView.setAdapter(adapter);



        return view;


    }


}
