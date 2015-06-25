package com.example.view.astuetz;
//darith



import com.example.fragementlearning.R;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

public class BadgeView extends TextView {

	public BadgeView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		int padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources().getDisplayMetrics());
		setPadding(padding, 0, padding, 0);
		// int size = (int)
		// TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10,
		// getResources().getDisplayMetrics());
		// setLayoutParams(new LayoutParams(size, size));
		setBackgroundResource(R.drawable.badge_background);
		setTextColor(getResources().getColor(R.color.indigo_500));
		setGravity(Gravity.CENTER);
	}

	public BadgeView(Context context, AttributeSet attrs) {
		super(context, attrs);
		int padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources().getDisplayMetrics());
		setPadding(padding, 0, padding, 0);
		// int size = (int)
		// TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10,
		// getResources().getDisplayMetrics());
		// setLayoutParams(new LayoutParams(size, size));
		setBackgroundResource(R.drawable.badge_background);
		setTextColor(getResources().getColor(R.color.indigo_500));
		setGravity(Gravity.CENTER);
	}

	public BadgeView(Context context) {
		super(context);
		int padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources().getDisplayMetrics());
		setPadding(padding, 0, padding, 0);
		// int size = (int)
		// TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10,
		// getResources().getDisplayMetrics());
		// setLayoutParams(new LayoutParams(size, size));
		setBackgroundResource(R.drawable.badge_background);
		setTextColor(getResources().getColor(R.color.indigo_500));
		setGravity(Gravity.CENTER);
	}

}
