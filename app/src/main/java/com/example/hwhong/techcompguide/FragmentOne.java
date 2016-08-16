package com.example.hwhong.techcompguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment implements AdapterView.OnItemClickListener {

    private ListView listview;
    private Communicate communicate;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //will work only the main activity has implemented the communicate interface
        communicate = (Communicate) getActivity();
        listview = (ListView) getActivity().findViewById(R.id.listView);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.name, android.R.layout.simple_list_item_1);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //here communicates to fragmentTwo, but first goes into the MainActivity where it will
        //then be passed
        communicate.respond(i);
    }
}
