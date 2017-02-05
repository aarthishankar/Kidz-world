package com.example.kidzzworld;
import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity7 extends Activity implements OnClickListener{
	
	
	
	private MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity7);	
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		Button button1=(Button)findViewById(R.id.pig);
		Button button2=(Button)findViewById(R.id.leopard);
		Button button3=(Button)findViewById(R.id.cow);
		Button button4=(Button)findViewById(R.id.elephant);
		Button button5=(Button)findViewById(R.id.tiger);
		Button button6=(Button)findViewById(R.id.lion);
		Button button7=(Button)findViewById(R.id.cat);
		Button button8=(Button)findViewById(R.id.dog);
		Button button9=(Button)findViewById(R.id.bear);
		
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);
	}

	public void onClick(View v) {
		int resId = 0;
		switch (v.getId()) {
		case R.id.pig:
			resId = R.raw.pig;
			break;
		case R.id.leopard:
			resId = R.raw.leopard;
			break;
		case R.id.cow:
			resId = R.raw.cowanimal;
			break;
		case R.id.elephant:
			resId = R.raw.elephant;
			break;
		case R.id.tiger:
			resId = R.raw.tiger;
			break;
		case R.id.lion:
			resId = R.raw.lion;
			break;
		case R.id.cat:
			resId = R.raw.cat;
			break;
		case R.id.dog:
			resId = R.raw.dog;
			break;
		case R.id.bear:
			resId = R.raw.bear;
			break;
		
		
		default:
			resId = R.raw.dog;
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
