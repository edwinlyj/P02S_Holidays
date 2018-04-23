package sg.edu.rp.c346.p02sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DayAapter extends ArrayAdapter {

    private ArrayList<Day> day;
    private Context context;
    private TextView tvHoliday,tvDate;
    private ImageView image;

    public DayAapter(Context context, int resource, ArrayList<Day> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        day = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvHoliday = (TextView) rowView.findViewById(R.id.holiday);

        // Get the TextView object
        tvDate = (TextView) rowView.findViewById(R.id.date);

        // Get the ImageView object
        image = (ImageView)rowView.findViewById(R.id.image);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Day currentDay = day.get(position);
        // Set the TextView to show the Day

        tvHoliday.setText(currentDay.getName());
        tvDate.setText(currentDay.getDate());


        if(currentDay.getName()=="New Year's Day") {
            image.setImageResource(R.drawable.newyear);
        }
        else if(currentDay.getName()=="Chinese New Year") {
            image.setImageResource(R.drawable.cny);
        }
        else if(currentDay.getName()=="Good Friday") {
            image.setImageResource(R.drawable.goodfriday);
        }
        else if(currentDay.getName()=="Labour Day") {
            image.setImageResource(R.drawable.labourday);
        }
        else if(currentDay.getName()=="Vesak day") {
            image.setImageResource(R.drawable.vesakday);
        }
        else if(currentDay.getName()=="Hari Raya Puasa") {
            image.setImageResource(R.drawable.harirayapuasa);
        }
        else if(currentDay.getName()=="National Day") {
            image.setImageResource(R.drawable.nationalday);
        }
        else if(currentDay.getName()=="Hari Raya Haji") {
            image.setImageResource(R.drawable.harirayahaji);
        }
        else if(currentDay.getName()=="Christmas Day") {
            image.setImageResource(R.drawable.christmas);
        }
        else if(currentDay.getName()=="\tDeepavali") {
            image.setImageResource(R.drawable.deepavali);
        }

        // Return the nicely done up View to the ListView
        return rowView;
    }



}
