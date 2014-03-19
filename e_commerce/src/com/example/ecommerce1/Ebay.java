package com.example.ecommerce1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Ebay extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ebay1);
		WebView ebay=(WebView) findViewById(R.id.ebay);
		ebay.loadUrl("http://www.ebay.com");
		ebay.setWebViewClient(new WebViewClient());
	}

}
