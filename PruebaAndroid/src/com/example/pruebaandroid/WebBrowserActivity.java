package com.example.pruebaandroid;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WebBrowserActivity extends Activity {
	
	int request_code = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_browser);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_browser, menu);
		return true;
	}

	public void onClickWebBrowser(View view){
		Intent i = new Intent( android.content.Intent.ACTION_VIEW, Uri.parse("http://www.google.es") );
		startActivity(i);
	}
	
	public void onClickMakeCalls(View view){
		Intent i = new  Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+34627449893"));
		startActivity(i);
	}
	
	public void onClickShowMap (View view){
		Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:37.827500,-122.481670"));
		startActivity(i);
	}
}
