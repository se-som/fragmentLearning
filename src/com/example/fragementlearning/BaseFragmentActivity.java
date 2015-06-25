package com.example.fragementlearning;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;

public class BaseFragmentActivity extends FragmentActivity {
	private ActionBar actionBar;
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
//		actionBar = getActionBar();
//		if (actionBar != null) {
//			actionBar.setDisplayHomeAsUpEnabled(true);
//			actionBar.setDisplayShowHomeEnabled(true);
//		}
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		int id = item.getItemId();
		if (id == android.R.id.home) {
			finish();
		}
		return super.onMenuItemSelected(featureId, item);
	}
}