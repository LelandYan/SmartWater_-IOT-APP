package com.zjxu.hwl.ui.main.equipment
        ;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



import org.jetbrains.annotations.NotNull;



public class Custom_Device extends AppCompatActivity {

    ImageView imgAir, imgFan, imgLight, imgDoor, imgLevel, img_btn_pw_ac, img_btn_fan_ac, img_btn_cold_ac ;
    Switch swLight, swFan, swDoor;

    TextView tvTemp;
    SeekBar seekBar_Temp;
    Boolean stateAir, stateLight, stateFan, stateDoor;
    Boolean stateCold = false;

    private int count = 0;
    private String simpleFileName = "note.txt";
    static Boolean stateAll = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.custom_device);



    }

}