package com.company.streamsupport_test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java8.util.stream.StreamSupport;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> aList = new ArrayList<>();
        aList.add(new Random().nextInt());
        aList.add(new Random().nextInt());
        aList.add(new Random().nextInt());
        aList.add(new Random().nextInt());
        StreamSupport.stream(aList)
                .map(el -> el.hashCode())
                .forEach(el-> Log.d("SERVICE", String.valueOf(el)));
    }
}
