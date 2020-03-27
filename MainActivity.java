package com.example.fixit2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("C:\\Rinky\\RINKY2\\laxmi\\folders\\WhatsApp Images\\IMG_20161126_201223","laptop" ));
        slideModels.add(new SlideModel( "C:\\Rinky\\RINKY2\\laxmi\\folders\\WhatsApp Images\\IMG-20161223-WA0025","be alone"));
        slideModels.add(new SlideModel( "C:\\Rinky\\RINKY2\\laxmi\\folders\\WhatsApp Images\\IMG-20161223-WA0031","cute" ));
        imageSlider.setImageList(slideModels,true);
    }
}
