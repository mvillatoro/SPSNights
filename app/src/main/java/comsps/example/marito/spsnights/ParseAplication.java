package comsps.example.marito.spsnights;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Marito on 05/02/2015.
 */
public class ParseAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        Parse.initialize(this, "2Chww6BKjr5Daq3uqpQgLzCm4lkJOeMcauVBkzbd", "HzO9VNvdHNPYYn9Q7JU5iarRdE9HkYwLYebbsvhs");


    }
}
