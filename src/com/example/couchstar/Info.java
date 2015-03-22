package com.example.couchstar;

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SearchView;

public class Info extends Activity implements OnClickListener {

	Button b2,b3;
	
	
	
	
	public class SearchResultsActivity extends Activity {

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	       // ...
	        handleIntent(getIntent());
	        System.out.println("Wrong Input Format");
	    }

	    @Override
	    protected void onNewIntent(Intent intent) {
	        //...
	    	System.out.println("Wrong Input Format");
	        handleIntent(intent);
	        System.out.println("Wrong Input Format");
	    }

	    private void handleIntent(Intent intent) {

	        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
	            String query = intent.getStringExtra(SearchManager.QUERY);
	            //use the query to search your data somehow
	        }
	    }
	  //  ...
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main, menu);

	    // Associate searchable configuration with the SearchView
	    SearchManager searchManager =
	           (SearchManager) getSystemService(Context.SEARCH_SERVICE);
	    SearchView searchView =
	            (SearchView) menu.findItem(R.id.search).getActionView();
	    searchView.setSearchableInfo(
	            searchManager.getSearchableInfo(getComponentName()));

	    return true;
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		
	}
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.info, menu);
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
	}  */

	@Override
	public void onClick(View arg0) {
		
		if(arg0.getId()==R.id.button2)
		{
			b2.setVisibility(View.INVISIBLE);
			b3.setVisibility(View.VISIBLE);
		}
		else
			if(arg0.getId()==R.id.button3)
			{
				b3.setVisibility(View.INVISIBLE);
				b2.setVisibility(View.VISIBLE);
			}
		// TODO Auto-generated method stub
		
	}
}
