package com.example.grability.colores;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageV;
    private CheckBox bAmarillo, bAzul, bRojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageV = (ImageView) findViewById(R.id.Ccolor);
        bAmarillo = (CheckBox) findViewById(R.id.checkBoxAmarillo);
        bAzul = (CheckBox)findViewById(R.id.checkBoxAzul);
        bRojo = (CheckBox)findViewById(R.id.checkBoxRojo);
    }

    int mA = 0;
    int mB = 0;
    int mC=0;
    public void Onclick(View view) {

         switch (view.getId()) {

            case R.id.checkBoxAmarillo:
               if(bAmarillo.isChecked()){
                   imageV.setBackgroundColor(Color.YELLOW);
                   mA++;
               }else{
                   imageV.setBackgroundColor(Color.TRANSPARENT);
                   mA--;
               }

                break;

            case R.id.checkBoxAzul:
                if(bAzul.isChecked()){
                    imageV.setBackgroundColor(Color.BLUE);
                    mB++;
                }else{
                    imageV.setBackgroundColor(Color.WHITE);
                    mB--;
                }
                break;

            case R.id.checkBoxRojo:
                if(bRojo.isChecked()){
                    imageV.setBackgroundColor(Color.RED);
                    mC++;
                }else{
                    imageV.setBackgroundColor(Color.TRANSPARENT);
                    mC--;
                }

            default:

                break;
        }

        if (mA==0 && mB==0 && mC==0){
            imageV.setBackgroundColor(Color.TRANSPARENT);
        }else if(mA==1 && mB==1){
            imageV.setBackgroundResource(R.color.colorGreen);
        }else if(mA==1 && mC==1){
            imageV.setBackgroundResource(R.color.colorOrange);
        }else if (mB==1&& mC==1){
            imageV.setBackgroundResource(R.color.colorMagenta);
        }
    }
}
