package com.example.hardik.menuproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;


public class MainActivity extends Activity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onClick(View v)
    {
        if(v.getId() == R.id.btn)
        {
            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
            smsIntent.setType("vnd.android-dir/mms-sms");
            smsIntent.putExtra("address", "+13043066366");
            smsIntent.putExtra("sms_body","How Are You Hardik Patel?");
            startActivity(smsIntent);
        }

        if(v.getId() == R.id.btn2)
        {
            String phno="tel:+19733421336";

            Intent i=new Intent(Intent.ACTION_DIAL,Uri.parse(phno));
            startActivity(i);
        }
        if(v.getId() == R.id.btn3)
        {
            Uri uri = Uri.parse("http://www.google.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn4)
        {
            String uri = ("geo:21.1702401,72.8310607?q=21.1702401,72.8310607,(My Birth + Place)");
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
            startActivity(intent);

        }
        if(v.getId() == R.id.btn5)
        {
            Window w = getWindow();
            w.setTitle("Share the Love");
            w.getContainer();


        }

        if(v.getId()==R.id.btn6)
        {
            Intent intent = new Intent(MainActivity.this, NewActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }

    public void MessageBox(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_help) {
            Intent help = new Intent(MainActivity.this,HelpActivity.class);
            startActivity(help);

        }


        return super.onOptionsItemSelected(item);
    }
}
