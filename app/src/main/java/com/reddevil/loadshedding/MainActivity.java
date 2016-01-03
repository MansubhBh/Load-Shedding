package com.reddevil.loadshedding;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.reddevil.loadshedding.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    ViewPager pager;
    ViewPagerAdapter adapter;

    String viewPagerTitles[] = {"Group 1","Group 2","Group 3","Group 4","Group 5","Group 6","Group 7"};
    int numberOfPages = 7;
    TextView groupNameVew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface customFonts = Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Light.ttf");
        TextView timeRemaining = (TextView) findViewById(R.id.time_remaining_label);
        TextView hours = (TextView) findViewById(R.id.hours);
        TextView minutes = (TextView) findViewById(R.id.minutes);
        TextView seconds = (TextView) findViewById(R.id.seconds);
        groupNameVew = (TextView) findViewById(R.id.groupName);

        timeRemaining.setTypeface(customFonts);
        hours.setTypeface(customFonts);
        minutes.setTypeface(customFonts);
        seconds.setTypeface(customFonts);

        //creating viewpager adapter

        adapter = new ViewPagerAdapter(getSupportFragmentManager(),numberOfPages,this);
        //assingning view pager view and setting the adapter
        pager =(ViewPager)findViewById(R.id.pager);
        pager.addOnPageChangeListener(this);
        pager.setAdapter(adapter);



        //assiging the sliding tab layout view
        //tabs = (SlidingTabLayout)findViewById(R.id.tabs);
        //tabs.setDistributeEvenly(true);          // this makes the tabs space evenly in available width


        //setting Custom Color for the Scroll bar indicator of the Tab View
//        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
//            @Override
//            public int getIndicatorColor(int position) {
//                return getResources().getColorStateList(R.color.selector);
//            }
//        });

        //setting the view pager for the slidingtabslayout
        //tabs.setViewPager(pager);


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        groupNameVew.setText(viewPagerTitles[position]);



    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

