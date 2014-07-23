package com.vivek.projectvivek;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	MediaPlayer song;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
	
		Thread timer = new Thread()
		{
			public void run(){
				try {
					sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					Intent open = new Intent("com.vivek.adding.MENU");
					startActivity(open);
				}
			}
			
		};

		timer.start();
	
	}
@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	song.release();
	finish();

}
}
