package com.example.kidzzworld;

import com.example.kidzzworld.SimpleGestureFilter.SimpleGestureListener;

import android.R.raw;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements SimpleGestureListener{
	private SimpleGestureFilter detector;
	TextView v1;
	MediaPlayer mp;
	Button b1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(MainActivity.this,R.raw.baby);
        mp.setLooping(false);
        mp.start();
        /*b1=(Button)findViewById(R.id.n1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i=new Intent(MainActivity.this,MainActivity1.class);
                startActivity(i);
            }
        });
        */// Detect touched area
        detector = new SimpleGestureFilter(this,this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent me){
        // Call onTouchEvent of SimpleGestureFilter class
        this.detector.onTouchEvent(me);
        return super.dispatchTouchEvent(me);
    }
    @Override
    public void onSwipe(int direction) {
        Intent intent;
        switch (direction) {

            case SimpleGestureFilter.SWIPE_RIGHT :
                //Toast.makeText(this, "right swipe", Toast.LENGTH_SHORT).show();

                    intent=new Intent(this,MainActivity.class);
                       startActivity(intent);
                break;
            case SimpleGestureFilter.SWIPE_LEFT :

                //Toast.makeText(this, "left swipe", Toast.LENGTH_SHORT).show();

                intent=new Intent(this,MainActivity1.class);
                startActivity(intent);
                break;

        }
    }
public void onDestroy()
{
    mp.stop();
    mp.release();

}
    @Override
    public void onDoubleTap() {
    }

}