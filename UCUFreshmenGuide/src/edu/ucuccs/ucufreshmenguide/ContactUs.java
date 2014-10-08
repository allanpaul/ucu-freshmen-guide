package edu.ucuccs.ucufreshmenguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;

public class ContactUs extends SherlockFragment {

	public ContactUs() {
	}

	private GoogleMap map;
	private static final LatLng Urdaneta = new LatLng(15.9794533, 120.5647776);
	MapView mapView;
	TextView tell1;
	TextView tell2;
	TextView website;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		
		// Get the view from tab_normal_map.xml
		View view = inflater.inflate(R.layout.contact_us, container, false);
		tell1=(TextView)view.findViewById(R.id.tell1);
		tell2=(TextView)view.findViewById(R.id.tell2);
		website=(TextView)view.findViewById(R.id.website);
		// Gets the MapView from the XML layout and creates it
		mapView = (MapView) view.findViewById(R.id.mapview);
		mapView.onCreate(savedInstanceState);

		// Gets to GoogleMap from the MapView and does initialization stuff
		map = mapView.getMap();
		map.getUiSettings().setMyLocationButtonEnabled(false);
		map.setMyLocationEnabled(true);

		MapsInitializer.initialize(this.getActivity());

		// Updates the location and zoom of the MapView
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(Urdaneta, 15.0f));

		// Set the map type to Satellite
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

		return view;

	}

	public void tell1(View v) {
		Intent callUCU1 = new Intent(Intent.ACTION_CALL,
				Uri.parse("tel: 5687612"));
		startActivity(callUCU1);
	}

	public void tell2(View v) {
		Intent callUCU2 = new Intent(Intent.ACTION_CALL,
				Uri.parse("tel: 5682475"));
		startActivity(callUCU2);
	}

	public void website(View v) {
		String url = "http://ucu.edu.ph";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}

	@Override
	public void onResume() {
		mapView.onResume();
		super.onResume();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		mapView.onDestroy();
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
		mapView.onLowMemory();
	}

}