package com.example.ecommerce1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Homeshop18 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homeshop18); 
		WebView home=(WebView) findViewById(R.id.homeshop);
		home.loadUrl("http://www.homeshop18.com");
		home.setWebViewClient(new WebViewClient());
	}

}
