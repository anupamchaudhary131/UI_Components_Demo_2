package com.example.ui_components_demo_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton employeeRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        radioGroup = (RadioGroup)findViewById(R.id.employeeChoiceGroup);
    }

    public void onclickRadioButton(View v)
    {
        int selectedEmployeeChoice = radioGroup.getCheckedRadioButtonId();
        employeeRadioButton = (RadioButton)findViewById(selectedEmployeeChoice);

        if(selectedEmployeeChoice == -1)
        {
            Toast.makeText(SecondActivity.this, "Nothing Is Selected, Please Select Any Option", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(SecondActivity.this, employeeRadioButton.getText().toString(), Toast.LENGTH_LONG).show();
            Intent intentBtn = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intentBtn);

        }
    }

}