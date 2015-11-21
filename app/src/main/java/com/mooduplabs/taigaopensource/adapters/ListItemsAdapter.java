package com.mooduplabs.taigaopensource.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mooduplabs.taigaopensource.viewmodels.ListItemViewModel;

import java.util.ArrayList;


public class ListItemsAdapter extends BaseAdapter {

    Context cntx;
    ArrayList<ListItemViewModel> itemList;

    public ListItemsAdapter(Context cntx, ArrayList<ListItemViewModel> itemList) {

    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return itemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        return null;
    }
}
