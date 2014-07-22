package com.mike.mylocationupdate;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

	private ArrayList<String> mArrayList = new ArrayList<String>();
	private Context context;

	public CustomAdapter(ArrayList<String> mArrayList, Context context) {
		super();
		this.mArrayList = mArrayList;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mArrayList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mArrayList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View view = convertView;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

		if (view == null) {

			view = inflater.inflate(R.layout.drawer_list_item, null);

			TextView mTextView = (TextView) view.findViewById(R.id.textView);

			mTextView.setText(mArrayList.get(position));

		}

		return view;
	}

}
