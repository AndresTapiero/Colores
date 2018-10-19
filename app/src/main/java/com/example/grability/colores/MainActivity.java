package com.example.grability.colores;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int mA = 0, mB = 0, mC = 0;
    private ImageView imageV;
    private CheckBox bAmarillo, bAzul, bRojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageV = (ImageView) findViewById(R.id.Ccolor);
        bAmarillo = (CheckBox) findViewById(R.id.checkBoxAmarillo);
        bAzul = (CheckBox) findViewById(R.id.checkBoxAzul);
        bRojo = (CheckBox) findViewById(R.id.checkBoxRojo);
    }

    public void Onclick(View view) {

        switch (view.getId()) {

            case R.id.checkBoxAmarillo:
                if (bAmarillo.isChecked()) {
                    imageV.setBackgroundResource(R.color.colorAmarillo);
                    mA++;
                } else {
                    imageV.invalidate();
                    mA--;
                }

                break;

            case R.id.checkBoxAzul:
                if (bAzul.isChecked()) {
                    imageV.setBackgroundResource(R.color.colorAzul);
                    mB++;
                } else {
                    imageV.invalidate();
                    mB--;
                }
                break;

            case R.id.checkBoxRojo:
                if (bRojo.isChecked()) {
                    imageV.setBackgroundResource(R.color.colorRojo);
                    mC++;
                } else {
                    imageV.invalidate();
                    mC--;
                }

            default:

                break;
        }

        if (mA == 0 && mB == 0 && mC == 0) {
            imageV.setBackgroundColor(Color.TRANSPARENT);
        } else if (mA == 1 && mB == 1 && mC == 1) {
            imageV.setBackgroundResource(R.color.colorBlack);
        } else if (mA == 1 && mB == 1) {

            imageV.setBackgroundResource(R.color.colorGreen);
        } else if (mA == 1 && mC == 1) {
            imageV.setBackgroundResource(R.color.colorOrange);
        } else if (mB == 1 && mC == 1) {
            imageV.setBackgroundResource(R.color.colorMagenta);
        } else if (mA == 1) {
            imageV.setBackgroundResource(R.color.colorAmarillo);
        } else if (mB == 1) {
            imageV.setBackgroundResource(R.color.colorAzul);
        } else if (mC == 1) {
            imageV.setBackgroundResource(R.color.colorRojo);
        }
    }
}
