package edu.ucuccs.ucufreshmenguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.ui.IconGenerator;

public class CampusMap extends SherlockFragment {

	public CampusMap() {
	}

	private static final LatLng UCU = new LatLng(15.9802657, 120.5608399);
	private GoogleMap map;
	MapView mapView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Get the view from tab_normal_map.xml
		View view = inflater.inflate(R.layout.campus_map, container,
				false);

		// Gets the MapView from the XML layout and creates it
		mapView = (MapView) view.findViewById(R.id.mapview);
		mapView.onCreate(savedInstanceState);

		// Gets to GoogleMap from the MapView and does initialization stuff
		map = mapView.getMap();
		map.getUiSettings().setMyLocationButtonEnabled(false);
		map.setMyLocationEnabled(true);

		MapsInitializer.initialize(this.getActivity());

		// Updates the location and zoom of the MapView
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(UCU, 19.0f));

		// Set the map type to Satellite
		map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

		IconGenerator iconFactory = new IconGenerator(getActivity());

		iconFactory.setStyle(IconGenerator.STYLE_GREEN);
		addIcon(iconFactory, "Gymnasium", new LatLng(15.9786106, 120.5608737));

		iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
		addIcon(iconFactory, "Orata Building", new LatLng(15.9803493,
				120.5603938));

		iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
		addIcon(iconFactory, "New Building",
				new LatLng(15.9799419, 120.5607604));

		iconFactory.setStyle(IconGenerator.STYLE_BLUE);
		addIcon(iconFactory, "Engineering Building", new LatLng(15.9801533,
				120.5602726));

		iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
		addIcon(iconFactory, "Orata Building 2", new LatLng(15.979417,
				120.560476));

		iconFactory.setStyle(IconGenerator.STYLE_GREEN);
		addIcon(iconFactory, "Quadrangle", new LatLng(15.9799959, 120.5610247));

		iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
		addIcon(iconFactory, "AVR", new LatLng(15.9802868, 120.5617505));

		iconFactory.setStyle(IconGenerator.STYLE_GREEN);
		addIcon(iconFactory, "Accounting, Cashier and President Office",
				new LatLng(15.9803681, 120.5615921));

		iconFactory.setStyle(IconGenerator.STYLE_GREEN);
		addIcon(iconFactory, "Green Home", new LatLng(15.9796589, 120.5607035));

		iconFactory.setStyle(IconGenerator.STYLE_GREEN);
		addIcon(iconFactory, "Green Home 2", new LatLng(15.979793, 120.5603709));

		iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
		addIcon(iconFactory, "MAPEH Office",
				new LatLng(15.9782706, 120.5608631));

		iconFactory.setStyle(IconGenerator.STYLE_BLUE);
		addIcon(iconFactory, "Comfort Rooom", new LatLng(15.9784087,
				120.5609801));

		iconFactory.setStyle(IconGenerator.STYLE_BLUE);
		addIcon(iconFactory, "Comfort Rooom", new LatLng(15.9794789,
				120.5607565));

		iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
		addIcon(iconFactory, "Canteen", new LatLng(15.9797863, 120.561579));

		iconFactory.setStyle(IconGenerator.STYLE_GREEN);
		addIcon(iconFactory, "Orata Park", new LatLng(15.9799288, 120.5615552));

		iconFactory.setStyle(IconGenerator.STYLE_BLUE);
		addIcon(iconFactory, "Registrar Office", new LatLng(15.9800837,
				120.5616952));

		iconFactory.setStyle(IconGenerator.STYLE_BLUE);
		addIcon(iconFactory, "DBC Room", new LatLng(15.9805233, 120.561192));

		iconFactory.setStyle(IconGenerator.STYLE_GREEN);
		addIcon(iconFactory, "Honasan Hall",
				new LatLng(15.9804238, 120.5610754));

		iconFactory.setStyle(IconGenerator.STYLE_PURPLE);
		addIcon(iconFactory, "Badar", new LatLng(15.9805181, 120.56098));

		iconFactory.setStyle(IconGenerator.STYLE_ORANGE);
		addIcon(iconFactory, "Square Garden",
				new LatLng(15.9804696, 120.560826));

		return view;
	}

	private void addIcon(IconGenerator iconFactory, String text, LatLng position) {

		MarkerOptions markerOptions = new MarkerOptions()
				.icon(BitmapDescriptorFactory.fromBitmap(iconFactory
						.makeIcon(text))).position(position)
				.anchor(iconFactory.getAnchorU(), iconFactory.getAnchorV());

		map.addMarker(markerOptions);

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