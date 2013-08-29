package com.example.pruebaandroid.views.basic;

import com.example.pruebaandroid.R;
import com.example.pruebaandroid.R.layout;
import com.example.pruebaandroid.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProgressBarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress_bar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.progress_bar, menu);
		return true;
	}

}
