package info.edible.slidingmenu.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.chris.edible.R;
import com.fitrax.nutritionix4j.client.NutritionixClientBuilder;
import com.fitrax.nutritionix4j.client.NutritionixClientImpl;
import com.fitrax.nutritionix4j.client.dto.Brand;
import com.fitrax.nutritionix4j.client.dto.Item;

import info.edible.listview.*;
import info.edible.listview.adapter.RestListAdapter;


import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private RestListAdapter adapter;
    private String[] restaurantList;
    private TypedArray restaurantIcons;
    private ArrayList<RestListItem> restaurantArray;
    private FragmentActivity listener;

    public HomeFragment(){
        // Constructor
    }

    // This event fires 1st, before creation of fragment or any views
    // The onAttach method is called when the Fragment instance is associated with an Activity.
    // This does not mean the Activity is fully initialized.
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    // This event fires 2nd, before views are created for the fragment
    // The onCreate method is called when the Fragment instance is being created, or re-created.
    // Use onCreate for any standard setup that does not require the activity to be fully created
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.listView);

        return rootView;
    }

    // This fires 4th, and this is the first time the Activity is fully created.
    // Accessing the view hierarchy of the parent activity must be done in the onActivityCreated
    // At this point, it is safe to search for activity View objects by their ID, for example.
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}