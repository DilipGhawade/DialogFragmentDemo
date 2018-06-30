package com.dilipghawade.dialogfragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CustomDialog extends DialogFragment implements View.OnClickListener{
  Button btne,btnk;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.customdialog_layout,null);
    return v;
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    btne = view.findViewById(R.id.btn_exit);
    btnk = view.findViewById(R.id.btn_ok);
    btne.setOnClickListener(this);
    btnk.setOnClickListener(this);
    setCancelable(false);
    getDialog().setTitle("Hey its Done!!!!");

  }

  @Override
  public void onClick(View view) {
    if (view .getId()==R.id.btn_exit)
    {
      dismiss();
      getActivity().finish();
      Toast.makeText(getContext(), "Exit", Toast.LENGTH_SHORT).show();


    }
    if (view.getId()==R.id.btn_ok)
    {
        dismiss();
      Toast.makeText(getContext(), "Closinng The", Toast.LENGTH_SHORT).show();
    }
  }
}
