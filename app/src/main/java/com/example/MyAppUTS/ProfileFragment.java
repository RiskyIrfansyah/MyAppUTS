package com.example.MyAppUTS;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class ProfileFragment extends Fragment {
    /*
    NIM                 : 10118085
    Nama                : Risky Irfansyah
    Kelas               : IF2
    Matakuliah          : Aplikasi Komputasi Bergerak
    Tanggal pengerjaan  : 03 Juni 2021
    */

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
