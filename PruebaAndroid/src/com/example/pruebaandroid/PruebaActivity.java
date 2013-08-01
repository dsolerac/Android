package com.example.pruebaandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;

public class PruebaActivity extends Activity {
	
	String tag = "Lifecycle";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prueba);
		Log.d(tag, "onCreate() Event");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prueba, menu);
		Log.d(tag, "onCreateOptionsMenu() Event");
		return true;
	}

}
