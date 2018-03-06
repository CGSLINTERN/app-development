package com.cgsl.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static TextView Appointment,Doctor,Document,Prescription,Pharmacy,Family,Chat,Feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Appointment=(TextView)findViewById(R.id.Appointment);
        Doctor=(TextView) findViewById(R.id.Doctor);
        Document=(TextView) findViewById(R.id.Document);
        Prescription=(TextView) findViewById(R.id.Prescription);
        Pharmacy=(TextView) findViewById(R.id.Pharmacy);
        Family=(TextView) findViewById(R.id.Family);
        Chat=(TextView) findViewById(R.id.Chat);
        Feedback=(TextView) findViewById(R.id.Feedback);

}
