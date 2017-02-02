package com.example.onasu.lamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.io.DataInput;

public class MainActivity extends AppCompatActivity {
  //  private FirebaseAnalytics mFirebaseAnalytics;
  //  mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //** Announce x and y
      //  double x = 0 , y = 0;

        //** sum x

        //x = x + 1;

        //** GraphView

        GraphView graphView = (GraphView) findViewById(R.id.graphView);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                //** Line
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)//,
               // new DataPoint(x,y)
        });

        graphView.addSeries(series);


    }
}
