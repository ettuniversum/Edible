package info.edible.listview.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chris.edible.R;

import java.util.ArrayList;

import info.edible.listview.RestListItem;

public class RestListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<RestListItem> RestListItem;

    public RestListAdapter(Context context, ArrayList<RestListItem> RestListItem){
        this.context = context;
        this.RestListItem = RestListItem;
    }

    @Override
    public int getCount() {
        return RestListItem.size();
    }

    @Override
    public Object getItem(int position) {
        return RestListItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.rest_list_item, null);
        }

        // Possible Error
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.restIcon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.restaurant);

        imgIcon.setImageResource(RestListItem.get(position).getIcon());
        txtTitle.setText(RestListItem.get(position).getTitle());

        return convertView;
    }

}