package com.rongxianren.annotationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
