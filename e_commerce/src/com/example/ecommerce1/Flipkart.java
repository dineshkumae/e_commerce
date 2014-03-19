package com.example.ecommerce1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Flipkart extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flipkart);
		WebView flip=(WebView) findViewById(R.id.flipkart);
		flip.loadUrl("http://www.flipkart.com");
		flip.setWebViewClient(new WebViewClient());
	}

}
