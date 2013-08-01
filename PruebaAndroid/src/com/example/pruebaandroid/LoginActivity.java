package com.example.pruebaandroid;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.Window;
import android.widget.Toast;

public class LoginActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	@Override
	protected Dialog onCreateDialog(int id) {
		
		Builder builder = new AlertDialog.Builder(this);
		
		builder.setIcon(R.drawable.ic_launcher);
		builder.setTitle("Título de un dialog ...");
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(getBaseContext(), "OK clicked!", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(getBaseContext(), "CANCEL clicked!", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		return builder.create();
		

	}

}
