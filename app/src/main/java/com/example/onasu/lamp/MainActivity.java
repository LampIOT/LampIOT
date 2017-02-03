package com.example.onasu.lamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;




public class MainActivity extends AppCompatActivity {
    private ToggleButton mToggle;
    private TextView mText;

    //กำหนดค่าให้เชื่อมต่อกับ FirebaseDatabase
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Lamp");




    //  private FirebaseAnalytics mFirebaseAnalytics;
  //  mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////ปุ่มกด off-on
        mToggle=(ToggleButton)findViewById(R.id.toggleButton);
        mText=(TextView)findViewById(R.id.textView2);


        //คลิกเพื่อส่งข้อมูลไปยัง FirebaseDatabase
        mToggle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mToggle.isChecked()){
                    myRef.setValue("0");
                    mText.setText("On");
                }
                else
                {
                    myRef.setValue("1");
                    mText.setText("Off");
                }
            }
        });
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
