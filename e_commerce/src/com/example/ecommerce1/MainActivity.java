package com.example.ecommerce1;


import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	protected static final int RESULT_SPEECH = 1;
	 ImageButton btnSpeak;
    
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnSpeak=(ImageButton) findViewById(R.id.iz);
		
		btnSpeak.setOnClickListener(new View.OnClickListener() {
       	 
            @Override
            public void onClick(View v) {
 
                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
 
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");
 
                try {
                    startActivityForResult(intent, RESULT_SPEECH);
                    
              } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
		
	}

	
	@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
 
        switch (requestCode) {
        case RESULT_SPEECH: {
            if (resultCode == RESULT_OK && null != data) {
 
                ArrayList<String> text = data
                        .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
 
                if(text.contains("flipkart")){
                	Intent flipkarti=new Intent("com.example.ecommerce1.FLIPKART");
                	startActivity(flipkarti);
                	
                }else if(text.contains("amazon")){
                	Intent amazoni=new Intent("com.example.ecommerce1.AMAZON");
                	startActivity(amazoni);
                }else if(text.contains("homeshop18")){
                	Intent homeshopi=new Intent("com.example.ecommerce1.HOMESHOP18");
                	startActivity(homeshopi);
                }else if(text.contains("ebay")){
                	Intent ebayi=new Intent("com.example.ecommerce1.EBAY");
                	startActivity(ebayi);
                }else if(text.contains("infibeam")){
                	Intent infibeami=new Intent("com.example.ecommerce1.INFIBEAM");
                	startActivity(infibeami);
                }else if(text.contains("snapdeal")){
                	Intent snapdeali=new Intent("com.example.ecommerce1.SNAPDEAL");
                	startActivity(snapdeali);
                } 
            }
            break;
        }
 
        }

}

}
