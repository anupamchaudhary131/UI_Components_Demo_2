package com.example.ui_components_demo_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ThirdActivity extends AppCompatActivity{

//public class ThirdActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

//    ProgressDialog individualProgress;
//    int progressStatus, finalProgress = 0;

//    private Handler progressHandler = new Handler();

//    Spinner spinner;

    TimePicker timePicker;
    TextView timeText;
    Calendar calendar;
    String format = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        timePicker = (TimePicker)findViewById(R.id.timePicker);
        timeText = (TextView)findViewById(R.id.timeText);
        calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        showTime(hour, minute);

    }

    public void setTime(View v)
    {
        int hour = timePicker.getCurrentHour();
        int minute = timePicker.getCurrentMinute();
        showTime(hour, minute);
    }

    public void showTime(int hour, int minute)
    {
        if(hour == 0)
        {
            hour += 12;
            format = "AM";
        }
        else if(hour == 12)
        {
            format = "PM";
        }
        else if(hour > 12)
        {
            hour -= 12;
            format = "PM";
        }
        else
        {
            format = "AM";
        }
        timeText.setText(new StringBuilder().append(hour).append(":").append(minute).append(" ").append(format));

    }

        //   Method to implement the Spinner


  /*    spinner = (Spinner)findViewById(R.id.courseSpinner);
        spinner.setOnItemSelectedListener(this);

        List<String> courseCategories = new ArrayList<String>();
        courseCategories.add("Select Course");
        courseCategories.add("Android");
        courseCategories.add("Accounts");
        courseCategories.add("Algebra");
        courseCategories.add("Anatomy");
        courseCategories.add("Advanced Java");
        courseCategories.add("Analytics");
        courseCategories.add("Biology");
        courseCategories.add("Botony");
        courseCategories.add("C");
        courseCategories.add("C++");
        courseCategories.add("Core Java");
        courseCategories.add("Calculus");
        courseCategories.add("Drawing");
        courseCategories.add("Dance");
        courseCategories.add("Design");
        courseCategories.add("Electronics");
        courseCategories.add("Graphics");
        courseCategories.add("GRE");
        courseCategories.add("Java");
        courseCategories.add("Python");
        courseCategories.add("Web Development");

        ArrayAdapter<String> courseAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, courseCategories);
        courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(courseAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String course = adapterView.getItemAtPosition(i).toString();
        TextView courseName = (TextView)findViewById(R.id.textCourse);
        courseName.setText("You Have Selected "+ course);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    } */


        //    Method to implement the progressBar



 /*   public void showMyProgress(View v)
    {
        individualProgress = new ProgressDialog(v.getContext());
        individualProgress.setCancelable(false);
        individualProgress.setMessage("Showing Your Progress File Download.....");
        individualProgress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        individualProgress.setProgress(0);
        individualProgress.setMax(100);
        individualProgress.show();


        progressStatus = 0;
        finalProgress = 0;


        new Thread(new Runnable() {
            @Override
            public void run() {
                while(progressStatus < 100)
                {
                    progressStatus = calculateDownloadSize();

                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    progressHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            individualProgress.setProgress(progressStatus);
                        }
                    });
                }

                if(progressStatus >= 100)
                {
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    individualProgress.dismiss();
                }
            }
        });
    }

    private int calculateDownloadSize()
    {
        while(finalProgress <= 10000)
        {
            finalProgress++;
            if(finalProgress == 1000)
            {
                return 10;
            }
            else if(finalProgress == 2000)
            {
                return 20;
            }
            else if(finalProgress == 4000)
            {
                return 40;
            }
            else if(finalProgress == 8000)
            {
                return 80;
            }
        }

        return 100;
    } */

}