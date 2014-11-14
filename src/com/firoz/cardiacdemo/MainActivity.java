package com.firoz.cardiacdemo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;



@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity {
	
	AutoCompleteTextView textView;
	TextView tvOutput;
	String tvAutoValue;
	private static final String[] diseases = new String[] {
		
		"Pneumonia", "Migraine", "UTI", "Hypertension", "Liver abscess", "Asthma", "Diabetes Mallitus", "Rheumatoid Arthritis"
	};
	//Spinner droplist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, diseases);
        
        //Hiding actionbar title
        
        textView = (AutoCompleteTextView)findViewById(R.id.textViewAuto);    
        textView.setAdapter(adapter);
        tvAutoValue = textView.getText().toString();
        
        
        textView.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,int after) {
                // TODO Auto-generated method stub

            }

            
            
            //Auto complete edit text code starts here
            
            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
                if (textView.getText().toString().equalsIgnoreCase("Pneumonia")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.pneumonia)));
                	textView.clearFocus();

                }
                
                else if (textView.getText().toString().equalsIgnoreCase("Migraine")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.NotYet)));
                	textView.clearFocus();

                }
                
                else if (textView.getText().toString().equalsIgnoreCase("UTI")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.NotYet)));
                	textView.clearFocus();

                }
                
                else if (textView.getText().toString().equalsIgnoreCase("Hypertension")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.NotYet)));
                	textView.clearFocus();

                }
                
                else if (textView.getText().toString().equalsIgnoreCase("Liver abscess")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.NotYet)));
                	textView.clearFocus();

                }
                
                else if (textView.getText().toString().equalsIgnoreCase("Asthma")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.NotYet)));
                	textView.clearFocus();

                }
                
                else if (textView.getText().toString().equalsIgnoreCase("Diabetes Mallitus")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.NotYet)));
                	textView.clearFocus();
                	
                }
                
                else if (textView.getText().toString().equalsIgnoreCase("Rheumatoid Arthritis")){

                    // here textview.setText(edtText.getText());
                	tvOutput.setText("");
                	tvOutput.setText(Html.fromHtml(getString(R.string.NotYet)));
                	textView.clearFocus();

                }
            }
        });
    


        
        tvOutput = (TextView)findViewById(R.id.textViewOutput);
        
    }
    
   
    
    /*public void clickEvent(View v){
    	
    	String dropListValue = droplist.getSelectedItem().toString();
    	
    	if(dropListValue.equals("Disease1")){
    		
    		tvOutput.setText("Description of Disease 1 will be provided throughout the whole page from here.");
    	}
    	
    	else if(dropListValue.equals("Disease2")){
    		
    		tvOutput.setText("Description of Disease 2 will be provided throughout the whole page from here.");
    	}
    	
    	else if(dropListValue.equals("Disease3")){
    		
    		tvOutput.setText("Description of Disease 3 will be provided throughout the whole page from here.");
    	}
    	
    	else if(dropListValue.equals("Select Your Disease")){
    		
    		tvOutput.setText(null);
    		Toast t = Toast.makeText(getApplicationContext(), "Select disease name first", Toast.LENGTH_LONG);
    		t.show();
    	}
    	
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
