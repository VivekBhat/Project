package com.vivek.projectvivek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adding extends Activity {

	int counter = 0;
	Button add, sub;
	TextView disp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);

		add = (Button) findViewById(R.id.button1);
		sub = (Button) findViewById(R.id.button2);
		disp = (TextView) findViewById(R.id.textView1);

		add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
				disp.setText("Your Sum is " + counter);

			}
		});
		
		sub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter--;
				disp.setText("Your Sum is " + counter);

			}
		});
	}

}