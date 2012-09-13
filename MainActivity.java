package com.example.athloneapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int counter;
	Button home, search, time, fav, options;
	TextView display;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index);
		counter =0;
		
		home =(Button) findViewById(R.id.bhome);
		search =(Button) findViewById(R.id.bsearch);
		time=(Button) findViewById(R.id.btimeline);
		fav =(Button) findViewById(R.id.bfavourites);
		options =(Button) findViewById(R.id.boptions);
		
		display =(TextView) findViewById(R.id.tvDisplay);

		// set up on clock listener
		home.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("this is the home page");
				// set up the home page
			}
		});

		search.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("this is the search page : " + counter);
				// set up search page
				//setContentView(R.layout.login);
			}
		});

		time.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("this is the timeline page");
				// set up time line page
			}
		});

		fav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("this is the favourites page");
				// set up time line page
			}
		});
		options.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("this is the options page");
				// set up the options page
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
