package comsps.example.marito.spsnights;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;


public class LogInActivity extends ActionBarActivity {

    private EditText contraseña, correo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Parse.initialize(this, "2Chww6BKjr5Daq3uqpQgLzCm4lkJOeMcauVBkzbd", "HzO9VNvdHNPYYn9Q7JU5iarRdE9HkYwLYebbsvhs");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        contraseña = (EditText) findViewById(R.id.contraseña);
        correo = (EditText) findViewById(R.id.correo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToRegister(View view) {

        Intent registro = new Intent(this,RegisterActivity.class);
        startActivity(registro);

    }

    public void checkLogin(View view) {



        String mail = correo.getText().toString();
        String pass = contraseña.getText().toString();

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Users");


        if(mail.equals("admin@gmail.com"))
        {
            if(pass.equals("12345"))
            {
                Intent eventFeed = new Intent(this, EventFeed.class);
                startActivity(eventFeed);
            }
        }

    }
}
