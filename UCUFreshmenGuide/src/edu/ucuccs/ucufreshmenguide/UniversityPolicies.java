package edu.ucuccs.ucufreshmenguide;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;



public class UniversityPolicies extends SherlockFragment implements SearchView.OnQueryTextListener {
	SearchView searchView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.university_policies,
				container, false);
		setHasOptionsMenu(true);
		return rootView;
	}
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.searchview, menu);

		SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
		searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
		searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
		searchView.setQueryHint("Search by Policy Title");
		searchView.setOnQueryTextListener(this);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// Take appropriate action for each action item click
		switch (item.getItemId()) {
		case R.id.action_search:

			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	@Override
	public boolean onQueryTextChange(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onQueryTextSubmit(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}