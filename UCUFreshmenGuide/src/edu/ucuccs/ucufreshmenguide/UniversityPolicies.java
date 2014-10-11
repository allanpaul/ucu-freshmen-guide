package edu.ucuccs.ucufreshmenguide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.SearchView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.actionbarsherlock.app.SherlockFragment;

public class UniversityPolicies extends SherlockFragment {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	SearchView searchView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.university_policies,
				container, false);

		// get the listview
		expListView = (ExpandableListView) rootView.findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader,
				listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);

		// Listview Group click listener
		expListView.setOnGroupClickListener(new OnGroupClickListener() {

			@Override
			public boolean onGroupClick(ExpandableListView arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				return false;
			}

		});

		// Listview Group expanded listener
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {

			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub

				return false;
			}
		});
		/*
		 * Automatically Expand ListView in the part of Graduate and Post
		 * Graduate Courses
		 */
		expListView.expandGroup(0);
		return rootView;
	}

	// Preparing the list data
	private void prepareListData() {
		// TODO Auto-generated method stub
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Graduate and Post Graduate Courses");
		listDataHeader.add("Undergraduate Courses");
		listDataHeader.add("Continuing Professional Development");

		// Adding child data
		List<String> gs = new ArrayList<String>();
		gs.add("Doctor of Education");

		List<String> underGraduate = new ArrayList<String>();

		underGraduate.add("Bachelor in Elementary Education");
		underGraduate.add("Bachelor in Secondary Education");
		underGraduate.add("Bachelor of Science in Accountancy");

		List<String> cpd = new ArrayList<String>();
		cpd.add("Certificate in Guidance and Counseling");
		cpd.add("Certificate in Physical Education and Sports Management");
		cpd.add("Certificate in Special Education");

		listDataChild.put(listDataHeader.get(0), gs);
		listDataChild.put(listDataHeader.get(1), underGraduate);
		listDataChild.put(listDataHeader.get(2), cpd);

	}

}
