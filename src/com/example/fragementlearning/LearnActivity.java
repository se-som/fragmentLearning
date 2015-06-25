package com.example.fragementlearning;

import com.example.view.astuetz.PagerSlidingTabStrip;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;



public class LearnActivity extends BaseFragmentActivity implements OnClickListener {
	
	private PagerSlidingTabStrip pagerSlidingTabStrip;
	private OutletPagerAdapter outletPagerAdapter;
	private ViewPager viewPager;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learn);
		init();	
	}

	private void init() {
		// Initialize view
		pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.slidingTab);
		pagerSlidingTabStrip.setTextColor(getResources().getColor(android.R.color.black));
		viewPager = (ViewPager) findViewById(R.id.viewpagerOutlet);
		outletPagerAdapter = new OutletPagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(outletPagerAdapter);
		pagerSlidingTabStrip.setViewPager(viewPager);
		pagerSlidingTabStrip.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	private class OutletPagerAdapter extends FragmentPagerAdapter {
		private String[] items;

		public OutletPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			Fragment fragment = null;
			if (position == 0) {
				fragment = new LearnFragment1();
			} else if (position == 1) {
				fragment = new LearnFragment2();
			}
			return fragment;
		}

		@Override
		public int getCount() {
			return 2;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			items = getApplicationContext().getResources().getStringArray(R.array.tab_outlet_status);
			return items[position];
		}

	}
}
