package com.example.grability.colores;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageV = (ImageView) findViewById(R.id.Ccolor);
    }

    public void Onclick(View view) {

        switch (view.getId()) {

            case R.id.checkBoxAmarillo:
                imageV.setBackgroundColor(Color.YELLOW);

                break;

            case R.id.checkBoxAzul:
                imageV.setBackgroundColor(Color.BLUE);
                break;

            case R.id.checkBoxRojo:
                imageV.setBackgroundColor(Color.RED);
                break;

            default:
                imageV.setBackgroundColor(Color.GREEN);
                break;
        }
    }
}
