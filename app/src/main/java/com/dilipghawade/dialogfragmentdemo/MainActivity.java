package com.dilipghawade.dialogfragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView = findViewById(R.id.txt_sd);
    textView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        showDialog();
      }
    });
  }

  public void showDialog()
  {
    FragmentManager fm = getSupportFragmentManager();
    CustomDialog cd = new CustomDialog();
    cd.show(fm,"My Custom Dialog");
  }
}
