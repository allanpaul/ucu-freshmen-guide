package edu.ucuccs.ucufreshmenguide;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ChartViewing extends Activity {
	ImageView imgChart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chart_viewing);
		// Change the color of ActionBar
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#2DCC70")));
		actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#2DCC70")));

		int index;
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		if (bundle != null) {
			index = bundle.getInt("index_key");

			if (index == 0) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.academiccouncil));

			}
			if (index == 1) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.administrativeservices));
			}
			if (index == 2) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.osa));
			}
			if (index == 3) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.developmentcenter));
			}
			if (index == 4) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.hrmo));
			}
			if (index == 5) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.boardofregents));
			}
			if (index == 6) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.accounting));
			}
			if (index == 7) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.cashier));
			}
			if (index == 8) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.research));
			}
			if (index == 9) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.alumni));
			}
			if (index == 10) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.clinic));
			}
			if (index == 11) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.graduateschool));
			}
			if (index == 12) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.sportculturearts));
			}
			if (index == 13) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.ccs));
			}
			if (index == 14) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.blis));
			}
			if (index == 15) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.caba));
			}
			if (index == 16) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.artsandlanguages));
			}
			if (index == 17) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.nursing));
			}
			if (index == 18) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.pharmacy));
			}
			if (index == 19) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.scienceandmathematics));
			}
			if (index == 20) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.socialwork));
			}
			if (index == 21) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.criminology));
			}
			if (index == 22) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.education));
			}
			if (index == 23) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.engg));
			}
			if (index == 24) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.midwifery));
			}
			if (index == 25) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.polsci));
			}
			if (index == 26) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.psychology));
			}
			if (index == 27) {
				ImageView imgChart = (ImageView) findViewById(R.id.imgChart);
				imgChart.setImageDrawable(getResources().getDrawable(
						R.drawable.tourism));
			}

		}

	}

}
