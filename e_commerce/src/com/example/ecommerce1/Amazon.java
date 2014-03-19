package com.example.ecommerce1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Amazon extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.amazon);
		WebView amaz=(WebView) findViewById(R.id.amazon);
		amaz.loadUrl("http://www.amazon.com");
		amaz.setWebViewClient(new WebViewClient());
	}

}
