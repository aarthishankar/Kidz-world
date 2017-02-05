package com.example.kidzzworld;
import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity6 extends Activity implements OnClickListener{
	
	
	
	private MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity6);	
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		ImageButton button1=(ImageButton)findViewById(R.id.imageButton1);
		ImageButton button2=(ImageButton)findViewById(R.id.imageButton2);
		ImageButton button3=(ImageButton)findViewById(R.id.imageButton3);
		ImageButton button4=(ImageButton)findViewById(R.id.imageButton4);
		ImageButton button5=(ImageButton)findViewById(R.id.imageButton5);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
	}

	public void onClick(View v) {
		int resId = 0;
		switch (v.getId()) {
		case R.id.imageButton1:
			resId = R.raw.cuckoo;
			break;
		case R.id.imageButton2:
			resId = R.raw.cock;
			break;
		case R.id.imageButton3:
			resId = R.raw.parrot;
			break;
		case R.id.imageButton4:
			resId = R.raw.sparraow;
			break;
		case R.id.imageButton5:
			resId = R.raw.peacock;
			break;
		
		
		default:
			resId = R.raw.cock;
			break;
		}
		// Release any resources from previous MediaPlayer
		if (mp != null) {
			mp.release();
		}
		// Create a new MediaPlayer to play this sound
		
		
		mp = MediaPlayer.create(this, resId);
		mp.start();
	}

//	@Override
	/*public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	*/
	

	@Override
	protected void onDestroy() {
		if(null!=mp){
			mp.release();
		}
		super.onDestroy();
	}
}
