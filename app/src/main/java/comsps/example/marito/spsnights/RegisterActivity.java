package comsps.example.marito.spsnights;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.Parse;
import com.parse.ParseObject;


public class RegisterActivity extends ActionBarActivity {

    private EditText nombre, correo, password, confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nombre= (EditText) findViewById(R.id.Nombre);
        correo= (EditText) findViewById(R.id.correo);
        password= (EditText) findViewById(R.id.pass1);
        confirm= (EditText) findViewById(R.id.pass2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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


    public void registerUser(View view) {

        String Name = nombre.getText().toString();
        String Mail = correo.getText().toString();
        String Pass = password.getText().toString();
        String Pass2 = confirm.getText().toString();

        if(Pass.equals(Pass2.toString()))
        {
            Parse.initialize(this, "2Chww6BKjr5Daq3uqpQgLzCm4lkJOeMcauVBkzbd", "HzO9VNvdHNPYYn9Q7JU5iarRdE9HkYwLYebbsvhs");
            ParseObject User = new ParseObject("Users");
            User.put("Name", Name);
            User.put("Mail", Mail);
            User.put("Password", Pass);
            User.saveInBackground();
            Intent logInActivity = new Intent(this, LogInActivity.class);
            startActivity(logInActivity);
        }



    }

}

