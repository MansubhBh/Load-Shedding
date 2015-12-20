package com.reddevil.loadshedding;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mansubh on 12/20/15.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];   //title of the tab
    int NumbOfTabs;            //store the number of the tab

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabs){
        super(fm);
        this.Titles=mTitles;
        this.NumbOfTabs=mNumbOfTabs;
    }


    //returns the fragment for every postion in the view pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Group1 tab1 = new Group1();
                return tab1;
            case 1:
                Group2 tab2 = new Group2();
                return tab2;
            case 2:
                Group3 tab3 = new Group3();
                return tab3;
            case 3:
                Group4 tab4 = new Group4();
                return tab4;
            case 4:
                Group5 tab5 = new Group5();
                return tab5;
            case 5:
                Group6 tab6 = new Group6();
                return tab6;
            case 6:
                Group7 tab7 = new Group7();
                return tab7;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
