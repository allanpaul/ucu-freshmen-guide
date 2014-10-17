package edu.ucuccs.ucufreshmenguide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.SearchView;

import com.actionbarsherlock.app.SherlockFragment;

public class CampusOrganizations extends SherlockFragment {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	SearchView searchView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.campus_organizations,
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

		/*// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				
				listDataHeader.get(groupPosition);
				listDataChild.get(childPosition);

				switch (groupPosition) {
				case 0:
					switch (childPosition) {
					case 0: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 0;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 1: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 1;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 2: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 2;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 3: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 3;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 4: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 4;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 5: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 5;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 6: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 6;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 7: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 7;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 8: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 8;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 9: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 9;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 10: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 10;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}

					}
					break;
				case 1:
					switch (childPosition) {
					case 0: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 11;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 1: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 12;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 2: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 13;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 3: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 14;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 4: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 15;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 5: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 16;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 6: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 17;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					}
					break;
				case 2: {
					switch (childPosition) {
					case 0: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 18;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 1: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 19;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}

					}
					break;
				}

				case 3: {
					switch (childPosition) {
					case 0: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 20;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 1: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 21;
						i.putExtra("index_key", index);
						startActivity(i);
						break;

					}
					case 2: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 22;
						i.putExtra("index_key", index);
						startActivity(i);
						break;

					}
					}
					break;
				}

				case 4: {
					switch (childPosition) {
					case 0: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 23;
						i.putExtra("index_key", index);
						startActivity(i);
						break;
					}
					case 1: {
						Intent i = new Intent(getActivity(),
								PolicyViewing.class);
						int index = 24;
						i.putExtra("index_key", index);
						startActivity(i);
						break;

					}

					}
					break;
				}

				}

				return false;
			}
			
		});*/

		// Automatically Expand ListView in the part of Graduate and Post
		// Graduate Courses
		expListView.expandGroup(0);
		return rootView;
	}

	// Preparing the list data
	private void prepareListData() {
		// TODO Auto-generated method stub
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("ACADEMIC ORGANIZATION");
		listDataHeader.add("SPORTS ORGANIZATION");
		listDataHeader.add("CULTURAL ORGANIZATION");
		listDataHeader.add("SOCIO-CIVIC ORGANIZATION");
		listDataHeader.add("SPIRITUAL ORGANIZATION");

		// Adding child data for Academic Organizations
		List<String> s1 = new ArrayList<String>();
		s1.add("SUPREME STUDENT GOVERNMENT");
		s1.add("GRADUATE SCHOOL STUDENT GOVERNMENT");
		s1.add("UNIVERSITY SCRIBE");
		s1.add("HONORS SOCIETY");
		s1.add("JUNIOR PHILIPPINE INSTITUTE OF ACCOUNTANCY (JPIA)");
		s1.add("UNITED MANAGEMENT ACCOUNTING AND FINANCE LEAGUE (UNIMAFIL)");
		s1.add("JUNIOR INFORMATION TECHNOLOGY SOCIETY (JITS)");
		s1.add("ASSOCIATION OF COMPUTER TECHNOLOGY STUDENTS (ACTS)");
		s1.add("HOTEL AND RESTAURANT MANAGEMENT ORGANIZATION (HRMO)");
		s1.add("HOTEL AND RESTAURANT SERVICES ORGANIZATION (HRSO)");
		s1.add("CIRCLE OF STUDENT ASSISTANTS (COSA)");

		// Adding child data for SPORTS ORGANIZATION
		List<String> s2 = new ArrayList<String>();
		s2.add("CHESS CLUB");
		s2.add("TABLE TENNIS CLUB");
		s2.add("DART CLUB");
		s2.add("VOLLEYBALL CLUB");
		s2.add("BADMINTON CLUB");
		s2.add("TRACK AND FIELD CLUB");
		s2.add("BASKETBALL CLUB");

		// Adding child data for CULTURAL ORGANIZATION
		List<String> s3 = new ArrayList<String>();
		s3.add("BAGUNTAO THEATER GUILD");
		s3.add("MUSIC ENSEMBLE");

		// Adding child data for SOCIO-CIVIC ORGANIZATION
		List<String> s4 = new ArrayList<String>();
		s4.add("EVERY NATION CAMPUS MINISTRY (ENCM)");
		s4.add("JUNIOR CIRCLE RESPONSIBLE OWNERS OF MOTORCYCLE (JCROM)");
		s4.add("YOGA SCIENCE CLUB");

		// Adding child data for ORGANIZATION
		List<String> s5 = new ArrayList<String>();
		s5.add("KRISTIANONG KABATAAN PARA SA BAYAN (KKB)");

		listDataChild.put(listDataHeader.get(0), s1);
		listDataChild.put(listDataHeader.get(1), s2);
		listDataChild.put(listDataHeader.get(2), s3);
		listDataChild.put(listDataHeader.get(3), s4);
		listDataChild.put(listDataHeader.get(4), s5);

	}

}
