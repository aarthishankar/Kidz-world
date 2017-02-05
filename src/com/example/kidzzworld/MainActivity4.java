package com.example.kidzzworld;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity4);
		VideoView videoView =(VideoView)findViewById(R.id.videoView1);  
        //Creating MediaController  
MediaController mediaController= new MediaController(this);  


    mediaController.setAnchorView(videoView);          
 
      //specify the location of media file  
   Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.video);      
   videoView.setMediaController(mediaController);  
   videoView.setVideoURI(uri); 
   videoView.requestFocus();  
     videoView.start(); 

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_activity4, menu);
		return true;
	}

}
