package edu.ucuccs.ucufreshmenguide;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.ui.IconGenerator;

public class CampusMap extends SherlockFragment {

	public CampusMap() {
	}

	private static final LatLng UCU = new LatLng(15.9802657, 120.5608399);
	private GoogleMap map;
	MapView mapView;
	Marker marker1, marker2, marker3, marker4, marker5, marker6, marker7,
			marker8, marker9, marker10, marker11, marker12, marker13, marker14,
			marker15, marker16, marker17, marker18, marker19, marker20,
			marker21, marker22;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Get the view from tab_normal_map.xml
		View view = inflater.inflate(R.layout.campus_map, container, false);

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

		IconGenerator icon = new IconGenerator(getActivity());

		// Gymnasium
		icon.setStyle(IconGenerator.STYLE_BLUE);
		Bitmap iconBitmap = icon.makeIcon("Gymnasium");

		marker1 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9786106, 120.5608737)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap)));

		// Orata Building
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap2 = icon.makeIcon("Orata Building");

		marker2 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9803493, 120.5603938)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap2)));

		// New Building
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap3 = icon.makeIcon("New Building");

		marker3 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9799419, 120.5607604)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap3)));

		// Engineering Building
		icon.setStyle(IconGenerator.STYLE_PURPLE);
		Bitmap iconBitmap4 = icon.makeIcon("Engineering Building");

		marker4 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9801533, 120.5602726)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap4)));

		// Orata Building 2
		icon.setStyle(IconGenerator.STYLE_BLUE);
		Bitmap iconBitmap5 = icon.makeIcon("Orata Building 2");

		marker5 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.979417, 120.560476)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap5)));

		// Quadrangle
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap6 = icon.makeIcon("Quadrangle");

		marker6 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9799959, 120.5610247)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap6)));

		// AVR
		icon.setStyle(IconGenerator.STYLE_PURPLE);
		Bitmap iconBitmap7 = icon.makeIcon("AVR");

		marker7 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9803453, 120.5617596)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap7)));

		// Accounting
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap8 = icon.makeIcon("Accounting");

		marker8 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9803681, 120.5615921)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap8)));

		// Green Home
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap9 = icon.makeIcon("Green Home");

		marker9 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9796589, 120.5607035)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap9)));

		// Green Home 2
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap10 = icon.makeIcon("Green Home 2");

		marker10 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.979793, 120.5603709)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap10)));

		// MAPEH Office
		icon.setStyle(IconGenerator.STYLE_ORANGE);
		Bitmap iconBitmap11 = icon.makeIcon("MAPEH Office");

		marker11 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9782706, 120.5608631)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap11)));

		// Comfort Rooom
		icon.setStyle(IconGenerator.STYLE_ORANGE);
		Bitmap iconBitmap12 = icon.makeIcon("Comfort Rooom");

		marker12 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9784087, 120.5609801)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap12)));

		// Comfort Rooom
		icon.setStyle(IconGenerator.STYLE_BLUE);
		Bitmap iconBitmap13 = icon.makeIcon("Comfort Rooom");

		marker13 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9794789, 120.5607565)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap13)));

		// Canteen
		icon.setStyle(IconGenerator.STYLE_PURPLE);
		Bitmap iconBitmap14 = icon.makeIcon("Canteen");

		marker14 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9797863, 120.561579)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap14)));

		// Orata Park
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap15 = icon.makeIcon("Orata Park");

		marker15 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9799288, 120.5615552)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap15)));

		// Registrar Office
		icon.setStyle(IconGenerator.STYLE_BLUE);
		Bitmap iconBitmap16 = icon.makeIcon("Registrar Office");

		marker16 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9800837, 120.56169522)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap16)));

		// DBC Room
		icon.setStyle(IconGenerator.STYLE_BLUE);
		Bitmap iconBitmap17 = icon.makeIcon("DBC Room");

		marker17 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9805233, 120.561192)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap17)));

		// Honasan Hall
		icon.setStyle(IconGenerator.STYLE_GREEN);
		Bitmap iconBitmap18 = icon.makeIcon("Honasan Hall");

		marker18 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9804238, 120.5610754)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap18)));

		// Badar
		icon.setStyle(IconGenerator.STYLE_PURPLE);
		Bitmap iconBitmap19 = icon.makeIcon("Badar");

		marker19 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9805181, 120.56098)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap19)));

		// Square Garden
		icon.setStyle(IconGenerator.STYLE_ORANGE);
		Bitmap iconBitmap20 = icon.makeIcon("Square Garden");

		marker20 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9804696, 120.560826)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap20)));

		// President Office
		icon.setStyle(IconGenerator.STYLE_BLUE);
		Bitmap iconBitmap21 = icon.makeIcon("President Office");

		marker21 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.980277, 120.5616515)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap21)));

		// Cashier
		icon.setStyle(IconGenerator.STYLE_ORANGE);
		Bitmap iconBitmap22 = icon.makeIcon("Cashier");

		marker22 = map.addMarker(new MarkerOptions().position(
				new LatLng(15.9803064, 120.5615745)).icon(
				BitmapDescriptorFactory.fromBitmap(iconBitmap22)));

		map.setOnMarkerClickListener(new OnMarkerClickListener() {
			@Override
			public boolean onMarkerClick(Marker marker) {
				if (marker.equals(marker1)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.ucu_gymn);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker2)) {

					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										// Show Image of The Building
										Toast toast2 = new Toast(getActivity());
										ImageView view2 = new ImageView(
												getActivity());

										view2.setImageResource(R.drawable.orata);
										toast2.setDuration(Toast.LENGTH_LONG);
										toast2.setView(view2);
										toast2.show();
										;
										break;

									case 1:
										// Report Emergency Through Call

										Intent reportCall = new Intent(
												Intent.ACTION_CALL,
												Uri.parse("tel: 09163177477"));
										startActivity(reportCall);

										break;

									case 2:
										// Report Emergency Through Text

										Intent reportText = new Intent(
												android.content.Intent.ACTION_VIEW);
										reportText.putExtra("address",
												"09163177477;");
										reportText
												.putExtra("sms_body",
														"Emergenccy Case Here at Orata Building");
										reportText
												.setType("vnd.android-dir/mms-sms");
										startActivity(reportText);

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker3)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.new_building);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker4)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.engg_buiding);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker5)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.ucu_ob2);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker6)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.quadrangle);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker7)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.avr);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker8)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.accounting_building);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker9)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.green_home);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker10)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.green_home2);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker11)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.pehm);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker12)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.crone);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker13)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										/*
										 * Toast toast = new
										 * Toast(getActivity()); ImageView view1
										 * = new ImageView( getActivity());
										 * view1
										 * .setImageResource(R.drawable.ucu_gymn
										 * );
										 * toast.setDuration(Toast.LENGTH_LONG);
										 * toast.setView(view1); toast.show(); ;
										 */
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker14)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.canteen);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker15)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.orata_park);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker16)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.registrar);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker17)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.dbc);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker18)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.honasan);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker19)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:
										/*
										 * Toast toast = new
										 * Toast(getActivity()); ImageView view1
										 * = new ImageView( getActivity());
										 * view1
										 * .setImageResource(R.drawable.ucu_gymn
										 * );
										 * toast.setDuration(Toast.LENGTH_LONG);
										 * toast.setView(view1); toast.show(); ;
										 */
										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker20)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.square_garden);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker21)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.president_office);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}
				if (marker.equals(marker22)) {
					// handle click here
					CharSequence options[] = new CharSequence[] {
							"View Building", "Report Emergency Via Call",
							"Report Emergency Via Text", };

					AlertDialog.Builder builder = new AlertDialog.Builder(
							getActivity());
					builder.setTitle("Options");
					builder.setItems(options,
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int options) {
									// the user clicked on options[options]
									switch (options) {
									case 0:

										Toast toast = new Toast(getActivity());
										ImageView view1 = new ImageView(
												getActivity());
										view1.setImageResource(R.drawable.cashier_building);
										toast.setDuration(Toast.LENGTH_LONG);
										toast.setView(view1);
										toast.show();
										;

										break;

									case 1:

										break;

									case 2:

										break;

									}
								}
							});
					builder.show();

				}

				return true;
			}
		});

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