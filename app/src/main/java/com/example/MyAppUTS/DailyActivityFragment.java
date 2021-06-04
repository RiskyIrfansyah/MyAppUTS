package com.example.MyAppUTS;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DailyActivityFragment extends Fragment {

    /*
    NIM             : 10118085
    Nama            : Risky Irfansyah
    Kelas           : IF2
    Matakuliah      : Aplikasi Komputasi Bergerak
    */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily_activity, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_daily1);
        ListAdapter listAdapter = new ListAdapter();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


//        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view_daily2);
        com.example.MyAppUTS.ListAdapter2 listAdapter2 = new com.example.MyAppUTS.ListAdapter2();
        recyclerView2.setAdapter(listAdapter2);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL);

        recyclerView2.setLayoutManager(horizontalLayoutManager);

        return view;
    }
}
