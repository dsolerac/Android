package com.example.pruebaandroid;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;

public class ProgressDialogActivity extends Activity {
	
	ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress_dialog);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.progress_dialog, menu);
		return true;
	}
	
	public void onClick2(View v){
		final ProgressDialog dialog = ProgressDialog.show(this, "Doing somethig", 
				"Please wait ... ", true);
		new Thread (new Runnable() {
			
			@Override
			public void run() {
				try{
					Thread.sleep(10000);
					dialog.dismiss();
				}catch(InterruptedException ie){
					ie.printStackTrace();
				}
				
			}
		}).start();
	}
	
	public void onClick3(View v){
		showDialog(1);
		progressDialog.setProgress(0);
		
		new Thread( new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=1; i<=15; i++){

					try{
					Thread.sleep(1000);
					progressDialog.incrementProgressBy( (int) (100/15) );
					}catch(InterruptedException ie){
						ie.printStackTrace();
					}
					
				}
				
			}
		} ).start();
	}

	@Override
	protected Dialog onCreateDialog(int id){
		switch (id){
		case 1:
			progressDialog = new ProgressDialog(this);
			progressDialog.setIcon(R.drawable.ic_launcher);
			progressDialog.setTitle("Dowloading files ...");
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					
					Toast.makeText(getBaseContext(), "OK clicked!", Toast.LENGTH_SHORT).show();
					
					
				}
			});
			progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "CANCEL", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					
					Toast.makeText(getBaseContext(), "CANCEL clicked!", Toast.LENGTH_SHORT).show();
					
				}
			});
			
			return progressDialog;
		}
		
		return null;
		
	}
	
	public void onClick(View v){
		startActivity(new Intent("com.example.pruebaandroid.intents.SecondActivity"));
	}
}
