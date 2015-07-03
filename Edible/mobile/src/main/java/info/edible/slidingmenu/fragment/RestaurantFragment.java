package info.edible.slidingmenu.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.TypedArray;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.chris.edible.R;
import com.fitrax.nutritionix4j.client.NutritionixClientBuilder;
import com.fitrax.nutritionix4j.client.NutritionixClientImpl;
import com.fitrax.nutritionix4j.client.dto.Item;
import com.fitrax.nutritionix4j.client.dto.SearchItem;
import com.fitrax.nutritionix4j.client.dto.SearchResults;

import info.edible.listview.*;
import info.edible.listview.adapter.RestListAdapter;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class RestaurantFragment extends Fragment {

    private RestListAdapter adapter;
    private String[] restaurantList;
    private TypedArray restaurantIcons;
    private ArrayList<RestListItem> restaurantArray;
    private FragmentActivity listener;


    public RestaurantFragment(){
        // Constructor
    }

    public void setRestaurantList(SearchResults results) {

        restaurantList = getResources().getStringArray(R.array.rest_list_items);
        restaurantIcons = getResources().obtainTypedArray(R.array.rest_list_icons);
        restaurantArray = new ArrayList<RestListItem>();
        SearchItem[] items = results.getHits();
        for (int i = 0; i < 3; i++) {
            SearchItem.Fields param = items[i].getFields();
            Map<String, Object> mapParam = param.getAdditionalProperties();
            Collection<Object> restValue = mapParam.values();
            Object[] objectArray = restValue.toArray();

            /*restaurantArray.add(new RestListItem(objectArray[4].toString(), restaurantIcons.getResourceId(3, -1)));*/
            restaurantArray.add(new RestListItem(restaurantList[i], restaurantIcons.getResourceId(3, -1)));
        }
        // setting the nav drawer list adapter
        adapter = new RestListAdapter(getActivity(), restaurantArray);
        adapter.notifyDataSetChanged();
    }

    // This event fires 1st, before creation of fragment or any views
    // The onAttach method is called when the Fragment instance is associated with an Activity.
    // This does not mean the Activity is fully initialized.
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
//        this.listener = (FragmentActivity) activity;
    }

    // This event fires 2nd, before views are created for the fragment
    // The onCreate method is called when the Fragment instance is being created, or re-created.
    // Use onCreate for any standard setup that does not require the activity to be fully created
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects[] objects = null;
        new NutritionixQuery().execute(objects);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.listView);
        lv.setAdapter(adapter);
        lv.setVisibility(rootView.VISIBLE);

        return rootView;
    }

    // This fires 4th, and this is the first time the Activity is fully created.
    // Accessing the view hierarchy of the parent activity must be done in the onActivityCreated
    // At this point, it is safe to search for activity View objects by their ID, for example.
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    private class NutritionixQuery extends AsyncTask<Object, String, SearchResults>{


  /*      @Override
        protected void onPostExecute(Integer results){

        }*/

        @Override
        protected SearchResults doInBackground(Object[] objects) {
            NutritionixClientBuilder nutriBuilder = new NutritionixClientBuilder();
            nutriBuilder.setAppKey("151384ac0ea68057c320e4160932cd9b");
            nutriBuilder.setAppId("2b90296d");
            NutritionixClientImpl nutriImpl = (NutritionixClientImpl) nutriBuilder.build();
            SearchResults results = nutriImpl.search(null, null, 1, -1, -1, null, "*");
            return results;
        }

        protected void onProgressUpdate(String... progress) {
            Log.d("ANDRO_ASYNC", "loading...");
        }


        protected void onPostExecute(SearchResults results) {
            setRestaurantList(results);
        }

    }
}