package com.diego.fragmenttut39;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 3/25/16.
 */
public class FragmentOne extends Fragment {

    ListView list_view;
    ArrayAdapter<String> arrayAdapter;
    String[] versions;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout, container, false);
        list_view = (ListView) view.findViewById(R.id.list_view_android_versions);
        versions = getResources().getStringArray(R.array.android_versions);

        arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_view_layout, R.id.text_view_row_item, versions);

        list_view.setAdapter(arrayAdapter);

        return  view;
    }
}
