package com.example.a19488521_vithevinh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FullName extends Fragment {
    private TextView txtFullName;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fullname, container, false);

        txtFullName = (TextView) view.findViewById(R.id.txtFullN);

        return view;
    }
    public void showText(String firstName, String lastName) {
        txtFullName.setText(firstName + " " + lastName);
    }
}
