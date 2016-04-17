package com.niks.roboguice;

import android.os.Bundle;
import android.widget.TextView;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class MainActivity extends RoboActivity {


	  @InjectView(R.id.text)
	  TextView name;

//	  @InjectView(R.id.imageView1)
//	  ImageView thumbnail;

//	  @InjectResource(R.drawable.ic_launcher)
//	  Drawable icon;

//	  @InjectResource(R.string.app_name)
//	  String myName;

//	  // system service
//	  @Inject
//	  LocationManager loc;

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    name.setText("Niks is here!!!!!");
	  }
}
