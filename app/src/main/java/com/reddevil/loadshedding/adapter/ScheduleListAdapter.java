package com.reddevil.loadshedding.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.reddevil.loadshedding.R;

/**
 * Created by Sherlock on 12/21/2015.
 */
public class ScheduleListAdapter extends RecyclerView.Adapter<ScheduleListAdapter.ScheduleViewHolder> {

    String[] dataList;
    LinearLayout.LayoutParams params1,params2;


    public ScheduleListAdapter(String[] dataList)
    {

        params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,1.5f);

        params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,1f);

        this.dataList = dataList;
    }


    public static class ScheduleViewHolder extends RecyclerView.ViewHolder
    {
        TextView day, firstTiming,secondTiming,thirdTiming;
        public ScheduleViewHolder(View itemView) {
            super(itemView);

            day = (TextView) itemView.findViewById(R.id.day);
            firstTiming = (TextView) itemView.findViewById(R.id.firstTiming);
            secondTiming = (TextView) itemView.findViewById(R.id.secondTiming);
            thirdTiming= (TextView) itemView.findViewById(R.id.thirdTiming);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.length;
    }

    @Override
    public void onBindViewHolder(ScheduleViewHolder holder, int position) {

        holder.thirdTiming.setVisibility(View.GONE);
        holder.day.setText(dataList[position]);
        holder.firstTiming.setLayoutParams(params1);
        holder.firstTiming.setText(dataList[position] + " First Item");
        holder.secondTiming.setText(dataList[position] + " Second Item");
        holder.secondTiming.setLayoutParams(params1);



    }

    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_list_item,parent,false);
        ScheduleViewHolder vh = new ScheduleViewHolder(view);
        return vh;
    }
}
