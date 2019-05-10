package sg.edu.rp.c346.reservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnconfirmation;
    TextView tvDisplay;
    Button btnReset;
    CheckBox cbEnabled;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        btnDisplayTime=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnReset=findViewById(R.id.btnReset);
        cbEnabled=findViewById(R.id.checkBoxsmoke);
        cbEnabled=findViewById(R.id.checkBoxnosmoke);
        btnconfirmation=findViewById(R.id.btnConfirmation);
        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();
                String time = hour + ":" + minute;


                tvDisplay.setText("Time is " + time);


            }


        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"reservation information", Toast.LENGTH_SHORT).show();

                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();
                String date = day + "/" + month + "/" + year;

                tvDisplay.setText("Date is  " + date);

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(5);
                dp.updateDate(2019, 6, 1);


            }
        });



    }
}
