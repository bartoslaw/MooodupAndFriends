package com.mooduplabs.taigaopensource.viewmodels;

import java.util.ArrayList;

public class ListItemsViewModel extends ViewModel {

    public ArrayList<ListItemViewModel> listItemViewModels;

    public ListItemsViewModel() {
        listItemViewModels = new ArrayList<>();
    }

    public void addItem(ListItemViewModel item) {
        listItemViewModels.add(item);
    }

}
