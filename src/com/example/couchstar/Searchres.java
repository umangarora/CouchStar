package com.example.couchstar;	

//import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Searchres extends Activity {

	ListView lv1;
	ImageView imv1;
	TextView tv2;

	String [] mainItems={"Item 1","Item 2","Item 3","Item 4","Item 5"};

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main, menu);

	    return true;
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_searchres);
		
		lv1=(ListView)findViewById(R.id.listView1);
		imv1=(ImageView)findViewById(R.id.imageView1);
		tv2=(TextView)findViewById(R.id.textView2);
		
		imv1.setBackgroundColor(Color.GREEN);
		tv2.setText("Item 1 rating 8");
		lv1.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				//arg1.setSelected(true);
				String clickeditem=mainItems[arg2];
				
				if(clickeditem.equals("Item 1"))
				{
					imv1.setBackgroundColor(Color.GREEN);
					tv2.setText("Item 1 rating 8");
				}
				else
					if(clickeditem.equals("Item 2"))
					{
						imv1.setBackgroundColor(Color.BLUE);
						tv2.setText("Item 2 rating 7");
					}
					else
						if(clickeditem.equals("Item 3"))
						{
							imv1.setBackgroundColor(Color.CYAN);
							tv2.setText("Item 3 rating 6");
						}
						else
							if(clickeditem.equals("Item 4"))
							{
								imv1.setBackgroundColor(Color.MAGENTA);
								tv2.setText("Item 4 rating 5");
							}
							else
								if(clickeditem.equals("Item 5"))
								{
									imv1.setBackgroundColor(Color.YELLOW);
									tv2.setText("Item 5 rating 4");
								}
				
			}	
		});
		
	}

	

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.searchres, menu);
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
	}*/
}
