package sg.edu.rp.c346.p02sgholidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lv;
    ArrayAdapter aa;
    ArrayList<Day> day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        lv = (ListView)findViewById(R.id.listView);

        ArrayList<String>aOptions = new ArrayList<String>();
        ArrayAdapter<String>aaOptions;
        aOptions.add("Secular");
        aOptions.add("Ethnic & Religion");


        //Dynamic ListView Step 3
        aaOptions = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, aOptions);


        lv.setAdapter(aaOptions);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this,ListViewActivity.class);
                i.putExtra("position",position);
                startActivity(i);



            }
        });







    }
}
