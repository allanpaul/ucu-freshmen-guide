package edu.ucuccs.ucufreshmenguide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.actionbarsherlock.app.SherlockFragment;

public class CoursesOffered extends SherlockFragment {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.courses_offered, container,
				false);

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
		gs.add("Doctor in Public Administration (DPA)");
		gs.add("Master of Arts in Education (MaEd)");
		gs.add("Master in Early Childhood Education (MAECEd)");
		gs.add("Master in Special Education (MaSped)");
		gs.add("Master in Physical Education & Sports (MPES)");
		gs.add("Master in Business Administration (MBA)");
		gs.add("Master of Arts in Nursing (MAN)");
		gs.add("Master in Public Health (MPH)");
		gs.add("Master in Public Administration (MPA) Major in Local Governance (MPALG)");
		gs.add("Graduate Certificate in Local Governance");
		gs.add("Certificate in Local Governance");

		List<String> underGraduate = new ArrayList<String>();

		underGraduate.add("Bachelor in Elementary Education");
		underGraduate.add("Bachelor in Secondary Education");
		underGraduate.add("Bachelor of Science in Accountancy");
		underGraduate.add("Bachelor of Science in Business Administration");
		underGraduate.add("Bachelor of Science in Office Administration");
		underGraduate.add("Bachelor of Science in Psychology");
		underGraduate.add("Bachelor of Science in Criminology");
		underGraduate.add("Bachelor of Arts in Political Science");
		underGraduate.add("Bachelor of Arts in Communication");
		underGraduate
				.add("Bachelor of Science in Hotel & Restaurant Management");
		underGraduate.add("Bachelor of Science in Tourism Management");
		underGraduate.add("Bachelor of Science in Information Technology");
		underGraduate.add("Bachelor in Library & Information Science");
		underGraduate.add("Bachelor of Science in Architecture");
		underGraduate.add("Bachelor of Science in Computer Engineering");
		underGraduate.add("Bachelor of Science in Electronics Engineering");
		underGraduate.add("Bachelor of Science in Mechanical Engineering");
		underGraduate.add("Bachelor of Science in Electrical Engineering");
		underGraduate.add("Bachelor of Science in Civil Engineering");
		underGraduate.add("Bachelor of Science in Social Work");
		underGraduate.add("Bachelor of Science in Nursing");
		underGraduate.add("Bachelor of Science in Pharmacy");
		underGraduate
				.add("Bachelor of Science in Complimentary Alternative Medicine");
		underGraduate.add("Associate in Computer Technology (ACT)");
		underGraduate.add("Diploma in Midwifery");
		underGraduate.add("Diploma in Computer Secretarial (Comp Sec)");
		underGraduate.add("Health Care Services NC II");
		underGraduate.add("Diploma in Hotel & Restaurant Services");
		underGraduate.add("Caregiving NC II");

		List<String> cpd = new ArrayList<String>();
		cpd.add("Certificate in Guidance and Counseling");
		cpd.add("Certificate in Physical Education and Sports Management");
		cpd.add("Certificate in Special Education");
		cpd.add("Certificate in Early Childhood Education");
		cpd.add("Certificate in Community Health Education");
		cpd.add("Certificate in Science Teaching");
		cpd.add("Certificate in Mathematics Teaching");
		cpd.add("Certificate in Filipino Teaching");
		cpd.add("Certificate in English Teaching");
		cpd.add("Certificate in Values Education");
		cpd.add("Certificate in Language Teaching");
		cpd.add("Certificate in TLE Teaching");
		cpd.add("Certificate in Social Science Teaching");
		cpd.add("Certificate in Rural Health Services");
		cpd.add("Certificate in Information and Communications Technology");
		cpd.add("Certificate in Security Management");
		cpd.add("Certificate in Law Enforcement Administration");
		cpd.add("Certificate in Hospitality Management and Public Relation");
		cpd.add("Certificate in Environmental Studies");
		cpd.add("Certificate in Alternative Learning System");
		cpd.add("Certificate in Alternative Medicine");
		cpd.add("Certificate in Barangay Governance");
		cpd.add("Certificate in Educational Management");
		cpd.add("Certificate in Public Administration");
		cpd.add("Certificate in Business Administration");
		cpd.add("Certificate in Social Work");
		cpd.add("Certificate in Agribusiness");
		cpd.add("Executive Course in Legal Management");
		cpd.add("Executive Course in Leadership and Organizational Management");
		cpd.add("Executive Course in Human Relation and Values Formation");
		cpd.add("Executive Course in Fiscal Management");
		cpd.add("Executive Course in Program/Project Management");
		cpd.add("Executive Course in Teaching Methodology");
		cpd.add("Executive Course in Office Management");
		cpd.add("Executive Course in Cooperative Management");
		cpd.add("Executive Course in Building Electrical Installation and Management");
		cpd.add("Executive Course in Records Management");
		cpd.add("Executive Course in Resource Development and Management");
		cpd.add("Executive Course in Public Speaking");
		cpd.add("Executive Course in Business Correspondence");
		cpd.add("Executive Course in Research Education");

		listDataChild.put(listDataHeader.get(0), gs);
		listDataChild.put(listDataHeader.get(1), underGraduate);
		listDataChild.put(listDataHeader.get(2), cpd);

	}
}