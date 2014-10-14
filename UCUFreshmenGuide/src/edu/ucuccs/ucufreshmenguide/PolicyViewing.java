package edu.ucuccs.ucufreshmenguide;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class PolicyViewing extends Activity {
	TextView txtPolicy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.policy_viewing);
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
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.primir)));
			}
			if (index == 1) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.vmgo)));
			}
			if (index == 2) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.seal)));
			}
			if (index == 3) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.programs)));
			}
			if (index == 4) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.admission)));
			}
			if (index == 5) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.retention)));
			}
			if (index == 6) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.registrationProcedures)));
			}
			if (index == 7) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.curriculumRevisionAndImplementation)));
			}
			if (index == 8) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.classificationOfstudents)));
			}
			if (index == 9) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.scholarshipAndGrants)));
			}
			if (index == 10) {
				TextView txtPolicy = (TextView) findViewById(R.id.txtPolicy);
				txtPolicy.setText(Html.fromHtml(getString(R.string.admission)));
			}

		}

	}

}
