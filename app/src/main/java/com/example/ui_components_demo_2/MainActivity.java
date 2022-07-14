package com.example.ui_components_demo_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView logoImage;
    ToggleButton button;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImage = (ImageView)findViewById(R.id.logoImage);
        button = (ToggleButton)findViewById(R.id.toggleButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button.getText().toString().contains(getResources().getString(R.string.off)))
                {
                    logoImage.setVisibility(View.GONE);
                }
                else
                {
                    logoImage.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void onClickButton(View v)
    {
        Toast.makeText(MainActivity.this, "Successfully Reached To Employees Corner", Toast.LENGTH_LONG).show();
        Intent intentButton = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intentButton);

    }
}