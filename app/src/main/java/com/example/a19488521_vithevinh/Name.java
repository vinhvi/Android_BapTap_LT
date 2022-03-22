package com.example.a19488521_vithevinh;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Name extends Fragment {
    private EditText txtFN;
    private EditText txtLN;
    private MainActivity mainAc;
    private Button btnSM;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_name, container, false);
        txtFN = (EditText) view.findViewById(R.id.txtFN);
        txtLN = (EditText) view.findViewById(R.id.txtLN);
        btnSM = (Button) view.findViewById(R.id.button);
        btnSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                applyText();
            }
        });

        return view;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            this.mainAc = (MainActivity) context;
        }
    }

    private void applyText() {
        String firstName = this.txtFN.getText().toString();
        String lastName = this.txtLN.getText().toString();

        this.mainAc.showText(firstName, lastName);
    }
}
