package com.mooduplabs.taigaopensource.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mooduplabs.taigaopensource.R;
import com.mooduplabs.taigaopensource.viewmodels.ListItemsViewModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class ListItemsAdapter extends BaseAdapter {

    Context cntx;
    ListItemsViewModel listViewModel;

    public ListItemsAdapter(Context cntx, ListItemsViewModel listViewModel) {

    }

    @Override
    public int getCount() {
        return listViewModel.listItemViewModels.size();
    }

    @Override
    public Object getItem(int i) {
        return listViewModel.listItemViewModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null) {
            view = LayoutInflater.from(cntx).inflate(R.layout.list_item,viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }
        else
            holder = (ViewHolder) view.getTag();

        Picasso.with(cntx).load(listViewModel.listItemViewModels.get(i).getImageUrl());
        holder.title.setText(listViewModel.listItemViewModels.get(i).getTitle());
        holder.subtitle.setText(listViewModel.listItemViewModels.get(i).getSubtitle());

        return view;
    }

    class ViewHolder {

        ImageView image;
        TextView title;
        TextView subtitle;

        ViewHolder(View v) {
            image = (ImageView) v.findViewById(R.id.list_item_image);
            title = (TextView) v.findViewById(R.id.list_item_title);
            subtitle = (TextView) v.findViewById(R.id.list_item_subtitle);
        }
    }
}
