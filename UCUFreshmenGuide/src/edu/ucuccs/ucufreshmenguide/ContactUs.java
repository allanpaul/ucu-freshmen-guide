package edu.ucuccs.ucufreshmenguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContactUs extends SherlockFragment {

	public ContactUs() {
	}

	private GoogleMap map;
	private static final LatLng Urdaneta = new LatLng(15.9794533, 120.5647776);
	private static final LatLng UCU = new LatLng(15.9802657, 120.5608399);

	MapView mapView;
	TextView tell1;
	TextView tell2;
	TextView website;
	Button btn_fb;
	Button btn_email;
	Button btn_scribe;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// Get the view from tab_normal_map.xml
		View view = inflater.inflate(R.layout.contact_us, container, false);
		tell1 = (TextView) view.findViewById(R.id.tell1);
		tell2 = (TextView) view.findViewById(R.id.tell2);
		website = (TextView) view.findViewById(R.id.website);
		btn_fb = (Button) view.findViewById(R.id.btn_fb);
		btn_email = (Button) view.findViewById(R.id.btn_email);
		btn_scribe = (Button) view.findViewById(R.id.btn_scribe);

		// Call the tell. number 5687612
		tell1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent callUCU1 = new Intent(Intent.ACTION_CALL, Uri
						.parse("tel: 5687612"));
				startActivity(callUCU1);
			}

		});

		// Call the tell number 5682475
		tell2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent callUCU2 = new Intent(Intent.ACTION_CALL, Uri
						.parse("tel: 5682475"));
				startActivity(callUCU2);
			}

		});

		// Go to website of UCU
		website.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String url = "http://ucu.edu.ph";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}

		});

		// Go to facebook page of UCU
		btn_fb.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String url = "https://www.facebook.com/UrdanetaCityUniversityPage";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}

		});

		// Email UCU
		btn_email.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent email = new Intent(Intent.ACTION_SEND);
				email.putExtra(Intent.EXTRA_EMAIL,
						new String[] { "ucu.main@gmail.com" });
				email.putExtra(Intent.EXTRA_SUBJECT, "UCU Message");
				email.putExtra(
						Intent.EXTRA_TEXT,
						Html.fromHtml(new StringBuilder().append(
								"<p>Good Day!</p>").toString()));
				email.setType("message/rfc822");
				startActivity(Intent.createChooser(email,
						"Choose an Email Client"));
			}

		});

		// Go to Facebook page of Scribe of UCU
		btn_scribe.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String url = "https://www.facebook.com/theucuscribe";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}

		});

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

		map.getUiSettings().setZoomControlsEnabled(false);
		map.getUiSettings().setZoomGesturesEnabled(false);
		map.getUiSettings().setAllGesturesEnabled(false);
		map.getUiSettings().setMyLocationButtonEnabled(false);
		

		map.addMarker(new MarkerOptions().position(UCU).icon(
				BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher)));
		
	

		return view;

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