package com.example.couchstar;

//import android.support.v7.app.ActionBarActivity;
//import com.example.couchstar.AccessoriesListActivity;
//import com.cyrilmottier.android.listviewtipsandtricks.R;
//import com.cyrilmottier.android.listviewtipsandtricks.AccessoriesListActivity.AccessoriesAdapter;
//import com.cyrilmottier.android.listviewtipsandtricks.AccessoriesListActivity.AccessoriesViewHolder;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import static com.example.couchstar.Cheeses.CHEESES;

public class MyShows extends ListActivity {
	
	
	
	private static final String STAR_STATES = "listviewtipsandtricks:star_states";

    private AccessoriesAdapter mAdapter;
    private boolean[] mStarStates;

    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        return true;
    }
    
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
				
		if (savedInstanceState != null) {
            mStarStates = savedInstanceState.getBooleanArray(STAR_STATES);
        } else {
            mStarStates = new boolean[CHEESES.length];
        }
        
		
	//	LayoutInflater inflater = getLayoutInflater();
      //  ViewGroup header = (ViewGroup) inflater.inflate(R.layout.myshowheader, listview,
      //          false);
    //    listview.addHeaderView(header, null, false);

        mAdapter = new AccessoriesAdapter();
        setListAdapter(mAdapter);
		//setContentView(R.layout.activity_my_shows);
	}
	
	@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBooleanArray(STAR_STATES, mStarStates);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //showMessage(getString(R.string.you_want_info_about_format, CHEESES[position]));
    }

    /**
     * A pretty basic ViewHolder used to keep references on children
     * {@link View}s.
     * 
     * @author Cyril Mottier
     */
    private static class AccessoriesViewHolder {
        public CheckBox star;
        public TextView content;
    }

    /**
     * The Adapter used in the demonstration.
     * 
     * @author Cyril Mottier
     */
    private class AccessoriesAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return CHEESES.length;
        }

        @Override
        public String getItem(int position) {
            return CHEESES[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            AccessoriesViewHolder holder = null;

            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.activity_my_shows, parent, false);
                
                

                holder = new AccessoriesViewHolder();
                //holder.star = (CheckBox) convertView.findViewById(R.id.btn_star);
                holder.content = (TextView) convertView.findViewById(R.id.content);

                ((Button) convertView.findViewById(R.id.btn_buy)).setOnClickListener(mBuyButtonClickListener);
                ((Button) convertView.findViewById(R.id.btn_buy2)).setOnClickListener(mBuyButtonClickListener);
                ((Button) convertView.findViewById(R.id.btn_buy3)).setOnClickListener(mBuyButtonClickListener);

                convertView.setTag(holder);
            } else {
                holder = (AccessoriesViewHolder) convertView.getTag();
            }

            /*
             * The Android API provides the OnCheckedChangeListener interface
             * and its onCheckedChanged(CompoundButton buttonView, boolean
             * isChecked) method. Unfortunately, this implementation suffers
             * from a big problem: you can't determine whether the checking
             * state changed from code or because of a user action. As a result
             * the only way we have is to prevent the CheckBox from callbacking
             * our listener by temporary removing the listener.
             */
         //   holder.star.setOnCheckedChangeListener(null);
           // holder.star.setChecked(mStarStates[position]);
            //holder.star.setOnCheckedChangeListener(mStarCheckedChanceChangeListener);

            holder.content.setText(CHEESES[position]);
            
            return convertView;
        }
    }

    /**
     * Quickly shows a message to the user using a {@link Toast}.
     * 
     * @param message The message to show
     */
    private void showMessage(String message) {
       // Toast.makeText(AccessoriesListActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    private OnClickListener mBuyButtonClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            final int position = getListView().getPositionForView(v);
            if (position != ListView.INVALID_POSITION) {
         //       showMessage(getString(R.string.you_want_to_buy_format, CHEESES[position]));
            }
            if(v.getId()==R.id.btn_buy2)
            {
            	//v.setVisibility(View.INVISIBLE);
            }
            else
            	if(v.getId()==R.id.btn_buy3)
            	{
            	//v.setVisibility(View.INVISIBLE);
            	}
        }
    };

    /*private OnCheckedChangeListener mStarCheckedChanceChangeListener = new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            final int position = getListView().getPositionForView(buttonView);
            if (position != ListView.INVALID_POSITION) {
                mStarStates[position] = isChecked;
            }
        }
    };*/

	
/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_shows, menu);
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
