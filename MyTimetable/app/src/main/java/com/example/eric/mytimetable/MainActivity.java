package com.example.eric.mytimetable;
/*The following program was built by Eric Strong */

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    public HashMap<Integer, String> mapMonday = new HashMap<Integer, String>();
    public HashMap<Integer, String> mapTuesday = new HashMap<Integer, String>();
    public HashMap<Integer, String> mapWednesday = new HashMap<Integer, String>();
    public HashMap<Integer, String> mapThursday = new HashMap<Integer, String>();
    public HashMap<Integer, String> mapFriday = new HashMap<Integer, String>();
    public String[] namesOfDays =
            { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    Button mButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mButton = (Button)findViewById(R.id.main_click);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonDisplay=null;

                int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
                Date today = new Date();
                int hour = (int) today.getHours();
                int min = (int) today.getMinutes();
                int week = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);


                day = day - 1;

                switch (day)
                {
                    case 1:
                    {
                        // monday
                        // call mondayMap

                        if (hour < 9 || hour >= 18)
                        {
                            buttonDisplay = "no classes";
                            break;
                        }
                        buttonDisplay = populateTimeTable(day, hour,min,week);


                    }
                    break;

                    case 2:
                    {
                        // tuesday
                        // call tueMap

                        if (hour < 9 || hour >= 18)
                        {

                            buttonDisplay = "no classes";
                            break;
                        }
                        buttonDisplay =  populateTimeTable(day, hour,min,week);

                    }
                    break;

                    case 3:
                    {
                        // wedneday
                        // call wedMap

                        if (hour < 9 || hour >= 18)
                        {
                            buttonDisplay = "no classes";

                            break;
                        }
                        buttonDisplay =  populateTimeTable(day, hour,min,week);

                    }
                    break;

                    case 4:
                    {
                        // thursday
                        // call thurMap

                        if (hour < 9 || hour >= 18)
                        {
                            buttonDisplay = "no classes";

                            break;
                        }
                        buttonDisplay = populateTimeTable(day, hour,min,week);

                    }
                    break;

                    case 5:
                    {
                        // friday
                        // call friMap

                        if (hour < 9 || hour >= 18)
                        {
                            buttonDisplay = "no classes";

                            break;
                        }
                        buttonDisplay = populateTimeTable(day, hour,min,week);

                    }
                    break;

                    default:
                    {
                        // no classes

                        buttonDisplay = "No Classes";
                    }
                    break;

                }// end switch

            /*
            * MAIN PART TO BE DISPLAYED
            * */

                mButton.setText(buttonDisplay);


            }//end onclick

            public String populateTimeTable(int flag, int key, int min,int week)
            {

                //to get the remaining minutes per class
                min = Math.abs(min - 60);
                // off set of week 4, we start back in 4th week of the year
                week = week - 4;


                if (flag == 1)
                {
                    mapMonday.put(9, "9.00-10.00. Free");
                    mapMonday.put(10, "10.00-11.00. Networking - Annex 3022");
                    mapMonday.put(11, "11.00-12.00. Free");
                    mapMonday.put(12, "12.00-13.00. Free");
                    mapMonday.put(13, "13.00-14.00. Networking - Annex 3010");
                    mapMonday.put(14, "14.00-15.00. Free");
                    mapMonday.put(15, "15.00-16.00. Maths - Annex 3020");
                    mapMonday.put(16, "16.00-17.00. Networking - Lab AU1005");
                    mapMonday.put(17, "17.00-18.00. Networking - Lab AU1005");

                    //System.out.println("You are now in:  " + mapMonday.get(key));
                    //System.out.println("Your next class is: " + mapMonday.get(key + 1));

                    return "class:  " + mapMonday.get(key) + "\nYour next class is: " + mapMonday.get(key + 1)
                            + "\nRemaining minutes:" + min + "\nWeek: " + week;
                }

                else if (flag == 2)
                {
                    mapTuesday.put(9, "9.00-10.00. DataBases - Annex 3011");
                    mapTuesday.put(10, "10.00-11.00. Java - Annex G025");
                    mapTuesday.put(11, "11.00-12.00. Java - Annex 3021");
                    mapTuesday.put(12, "12.00-13.00. Free");
                    mapTuesday.put(13, "13.00-14.00. DataBases - Annex 3021");
                    mapTuesday.put(14, "14.00-15.00. Free");
                    mapTuesday.put(15, "15.00-16.00. HCI - Main B034");
                    mapTuesday.put(16, "16.00-17.00. HCI - Lab Annex 3005");
                    mapTuesday.put(17, "17.00-18.00. HCI - Lab Annex 3005");

                    System.out.println("You are now in:  " + mapTuesday.get(key));
                    System.out.println("Your next class is: " + mapTuesday.get(key + 1));
                    return "class:  " + mapTuesday.get(key) + "\nYour next class is: " + mapTuesday.get(key + 1)
                            + "\nRemaining minutes:" + min + "\nWeek: " + week;

                }

                else if (flag == 3)
                {
                    mapWednesday.put(9, "9.00-10.00. Free");
                    mapWednesday.put(10, "10.00-11.00. Maths - Annex G028");
                    mapWednesday.put(11, "11.00-12.00. Web Development - Annex 3020");
                    mapWednesday.put(12, "12.00-13.00. Web Development - Annex 3020");
                    mapWednesday.put(13, "13.00-14.00. Free");
                    mapWednesday.put(14, "14.00-15. Free");
                    mapWednesday.put(15, "15.00-16.00. Free");
                    mapWednesday.put(16, "16.00-17.00. Free");
                    mapWednesday.put(17, "17.00-18.00. Free");

                    //System.out.println("You are now in:  " + mapWednesday.get(key));
                    //System.out.println("Your next class is: " + mapWednesday.get(key + 1));
                    return "Class:  " + mapWednesday.get(key) + "\nYour next class is: " + mapWednesday.get(key + 1)
                            + "\nRemaining minutes:" + min + "\nWeek: " + week;

                }

                else if (flag == 4)
                {
                    mapThursday.put(9, "9.00-10.00. Free");
                    mapThursday.put(10, "10.00-11.00. Java - Annex  G027");
                    mapThursday.put(11, "11.00-12.00. Java - Lab Annex 3005");
                    mapThursday.put(12, "12.00-13.00. Java - Lab Annex 3005");
                    mapThursday.put(13, "13.00-14.00. Internship Main G007");
                    mapThursday.put(14, "14.00-15.00. Web Development - Lab Annex 3005");
                    mapThursday.put(15, "15.00-16.00. Web Development - Lab Annex 3005");
                    mapThursday.put(16, "16.00-17.00. HCI - Annex 3023");
                    mapThursday.put(17, "17.00-18.00. Free");

                    //System.out.println("You are now in:" + mapThursday.get(key));
                    //System.out.println("Your next class is: " + mapThursday.get(key + 1));

                    return "Class:  " + mapThursday.get(key) + "\nYour next class is: " + mapThursday.get(key + 1)
                            + "\nRemaining minutes:" + min + "\nWeek: " + week;

                }

                else if (flag == 5)
                {
                    mapFriday.put(9, "9.00-10.00. Free");
                    mapFriday.put(10, "10.00-11.00. Maths - Annex 3022");
                    mapFriday.put(11, "11.00-12.00. DataBases - Lab Annex 3008");
                    mapFriday.put(12, "12.00-13.00. DataBases - Lab Annex 3008");
                    mapFriday.put(13, "13.00-14.00. Free");
                    mapFriday.put(14, "14.00-15.00. Free");
                    mapFriday.put(15, "15.00-16.00. Free");
                    mapFriday.put(16, "16.00-17.00. Free");
                    mapFriday.put(17, "17.00-18.00. Free");

                    //System.out.println("You are now in:  " + mapFriday.get(key));
                    //System.out.println("Your next class is: " + mapFriday.get(key + 1));

                    return "Class:  " + mapFriday.get(key) + "\nYour next class is: " + mapFriday.get(key + 1)
                            + "\nRemaining minutes:" + min + "\nWeek: " + week;

                }

                else
                {
                   // System.out.println("No Classes");
                    return "No Classes";
                }
            }// end


        });

    }//end oncreate
}//end main
