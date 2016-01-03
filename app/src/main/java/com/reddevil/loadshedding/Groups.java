package com.reddevil.loadshedding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reddevil.loadshedding.adapter.ScheduleListAdapter;

/**
 * Created by Sherlock on 12/22/2015.
 */


public class Groups extends Fragment {

    String[] dataForList = {"1","2","3","4","5","6","7"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Bundle dataBundle = this.getArguments();
        int groupId = dataBundle.getInt("GROUP");


        View view =  inflater.inflate(R.layout.layout_group,container,false);

        RecyclerView scheduleView = (RecyclerView) view.findViewById(R.id.scheduleList);
        scheduleView.hasFixedSize();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        scheduleView.setLayoutManager(layoutManager);

        ScheduleListAdapter adapter = new ScheduleListAdapter(dataForList);
        scheduleView.setAdapter(adapter);

        return view;

    }
}
