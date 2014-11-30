package com.example.glance.cartoons;

import android.support.v7.app.ActionBarActivity;
import android.widget.LinearLayout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
//import com.google.android.gms.ads.*;

public class MainActivity extends Activity {

	//private AdView adView;
	boolean bExit = false;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-1060814147242762/8492306939");
        adView.setAdSize(AdSize.BANNER);
        
        LinearLayout layoutAd = (LinearLayout) findViewById(R.id.llo4_ad);
        layoutAd.addView(adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        */
        Button linkBtn1_1 = (Button) findViewById(R.id.llo2_body1_btn1);
        linkBtn1_1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://aetoys.tumblr.com/phone");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
        
        Button linkBtn1_2 = (Button) findViewById(R.id.llo2_body1_btn2);
        linkBtn1_2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://kiraharu3.tumblr.com/");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
        
        Button linkBtn1_3 = (Button) findViewById(R.id.llo2_body1_btn3);
        linkBtn1_3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://zangsisi.tumblr.com/");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
        
        Button linkBtn1_4 = (Button) findViewById(R.id.llo2_body2_btn1);
        linkBtn1_4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://manadong.tumblr.com/");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
        
        Button linkBtn1_5 = (Button) findViewById(R.id.llo2_body2_btn2);
        linkBtn1_5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://jp2krmanga.tumblr.com/");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
        
        Button linkBtn2_1 = (Button) findViewById(R.id.llo3_body1_btn1);
        linkBtn2_1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://m.comic.naver.com/");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
        
        Button linkBtn2_2 = (Button) findViewById(R.id.llo3_body1_btn2);
        linkBtn2_2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://m.webtoon.daum.net/m/");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
        
        Button linkBtn2_3 = (Button) findViewById(R.id.llo3_body1_btn3);
        linkBtn2_3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Bundle webUrl = new Bundle();
				webUrl.putString("url", "http://m.comics.nate.com/");
				Intent myIntent = new Intent(getApplicationContext(), WebViewActivity.class);
				myIntent.putExtras(webUrl);
				startActivity(myIntent);
			}
		});
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	if(keyCode==KeyEvent.KEYCODE_BACK) {
    		if(!bExit) {
    			Toast.makeText(getBaseContext(), "'뒤로'버튼을 한번 더 누르시면 종료됩니다.", 0).show();
    			bExit = true;
    		} else {
    			finish();
    		}
    		return true;
    	}
    	return super.onKeyDown(keyCode, event);
    }
    /*
    @Override
    public void onPause() {
      adView.pause();
      super.onPause();
    }

    @Override
    public void onResume() {
      super.onResume();
      adView.resume();
    }

    @Override
    public void onDestroy() {
      adView.destroy();
      super.onDestroy();
    }
    */
}
