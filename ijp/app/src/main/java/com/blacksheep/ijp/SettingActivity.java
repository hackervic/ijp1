package com.blacksheep.ijp;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import at.markushi.ui.CircleButton;
import petrov.kristiyan.colorpicker.ColorPicker;

public class SettingActivity extends AppCompatActivity {
    private CircleButton btm1, btn2;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settting);


        relativeLayout = findViewById(R.id.main_layout);
        btm1 = findViewById(R.id.color_btn_1);
        btn2 = findViewById(R.id.color_btn_2);
        btm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker2();
            }
        });


    }

    private void openColorPicker1() {
        final ColorPicker colorPicker = new ColorPicker(this);
        final ArrayList<String> color = new ArrayList<>();
        color.add("#ef1010");
        color.add("#103def");
        color.add("#10ef4f");
        color.add("#04efef");
        color.add("#ffffff");
        color.add("#000000");
        color.add("#fc8a00");
        color.add("#ff4b4b");
        color.add("#0c304a");
        color.add("#9e74e1");
        color.add("#8be5e5");
        color.add("#22b20c");

        colorPicker.setColors(color).setColumns(5).setRoundColorButton(true).setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
            @Override
            public void onChooseColor(int position, int color) {
                btm1.setColor(color);
                Toast.makeText(SettingActivity.this, "Color Changed", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {

            }
        }).show();

    }

    private void openColorPicker2() {
        final ColorPicker colorPicker = new ColorPicker(this);
        final ArrayList<String> color = new ArrayList<>();
        color.add("#ef1010");
        color.add("#103def");
        color.add("#10ef4f");
        color.add("#04efef");
        color.add("#ffffff");
        color.add("#000000");
        color.add("#fc8a00");
        color.add("#ff4b4b");
        color.add("#0c304a");
        color.add("#9e74e1");
        color.add("#8be5e5");
        color.add("#22b20c");

        colorPicker.setColors(color).setColumns(5).setRoundColorButton(true).setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
            @Override
            public void onChooseColor(int position, int color) {
                btn2.setColor(color);
                Toast.makeText(SettingActivity.this, "Color Changed", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {

            }
        }).show();

    }

}