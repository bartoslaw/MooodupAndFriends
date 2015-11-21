package com.mooduplabs.taigaopensource.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mooduplabs.taigaopensource.viewmodels.ListItemsViewModel;

import java.util.ArrayList;


public class ListItemsAdapter extends BaseAdapter {

    Context cntx;
    ListItemsViewModel itemList;

    public ListItemsAdapter(Context cntx, ListItemsViewModel itemsList) {

    }

    @Override
    public int getCount() {
        return itemList.listItemViewModels.size();
    }

    @Override
    public Object getItem(int i) {
        return itemList.listItemViewModels.get(i);
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
