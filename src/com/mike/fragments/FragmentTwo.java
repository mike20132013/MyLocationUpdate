package com.mike.fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mike.mylocationupdate.R;

@SuppressLint("NewApi") public class FragmentTwo extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.frags, container, false);

		//v.setBackgroundColor(Color.YELLOW);
		TextView tv = (TextView) v.findViewById(R.id.textView);
		tv.setText("Pane Two");

		return v;
	}

}
