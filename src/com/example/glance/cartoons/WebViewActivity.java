package com.example.glance.cartoons;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewActivity extends Activity {

	WebView mWebView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        
        Intent intent = getIntent();
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.setWebViewClient(new MyWebClient());
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setSupportZoom(true);
		mWebView.getSettings().setBuiltInZoomControls(true);
		// mWebView.loadUrl("http://aetoys.tumblr.com/phone");
		mWebView.loadUrl(intent.getStringExtra("url"));
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	if((keyCode==KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
    		mWebView.goBack();
    		return true;
    	}
    	return super.onKeyDown(keyCode, event);
    }
    
    private class MyWebClient extends WebViewClient {

    	@Override
    	public boolean shouldOverrideUrlLoading(WebView view, String url) {
    		// TODO Auto-generated method stub
    		view.loadUrl(url);
    		return super.shouldOverrideUrlLoading(view, url);
    	}
    }
}
