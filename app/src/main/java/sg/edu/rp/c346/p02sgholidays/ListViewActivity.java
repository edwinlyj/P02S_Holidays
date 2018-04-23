package sg.edu.rp.c346.p02sgholidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {


    ListView lv;
    ArrayAdapter aa;
    ArrayList<Day> day;

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();

        int option = i.getIntExtra("position",0);



        lv = (ListView) this.findViewById(R.id.lvHoliday);
        tv = (TextView)this.findViewById(R.id.tvHoliday);

        // Create a few food objects in Food array
        day = new ArrayList<Day>();


        if(option == 0){
            tv.setText("Secular");
            day.add(new Day("New Year's Day", "1 January 2018"));
            day.add(new Day("Labour Day", "1 May 2018"));
        }else{
            tv.setText("Ethnic & Religion");
            day.add(new Day("Chinese New Year", "16 February 2018 and 17 February 2018"));
            day.add(new Day("Good Friday", "30 March 2018"));
        }







        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new DayAapter(this, R.layout.row, day);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Day selectedDay = day.get(position);

                Toast.makeText(ListViewActivity.this, selectedDay.getName()
                                + " Date: " + selectedDay.getDate(),
                        Toast.LENGTH_SHORT).show();
            }
        });




    }

}
