package com.example.pruebaandroid.views.basic;

import com.example.pruebaandroid.R;
import com.example.pruebaandroid.R.layout;
import com.example.pruebaandroid.R.menu;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;

public class ProgressBarActivity extends Activity {
	
	//clase Runnable que permite lanzar threads en segundo plano para hacer tareas desatendidas.
	private final class ProgressThread implements Runnable {
		
		public void run() {
			
			//Aquí se hacen las tareas correspondientes
			while(progressStatus < 10){
				progressStatus = doSomeWork();
			}
			
			//Esto esconde la barra de progreso
			handler.post(new Runnable() {
				
				@Override
				public void run() {
					progressBar.setVisibility(View.GONE);
					
				}
			});
			
		}

		//método donde se implementa la tarea de larga duración.
		private int doSomeWork() {

			try {
				//con esto simulamos hacer algo
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			return ++progress;
			
		}
	}

	static int progress;
	ProgressBar progressBar;
	int progressStatus = 0;
	Handler handler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress_bar);
		
		progress = 0;
		progressBar = (ProgressBar) findViewById(R.id.progressBar1);
		
		//Con este Thread se hace la tarea que corresponda en segundo plano.
		Thread progressThread = new Thread( new ProgressThread() );
		progressThread.start();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.progress_bar, menu);
		return true;
	}

}
