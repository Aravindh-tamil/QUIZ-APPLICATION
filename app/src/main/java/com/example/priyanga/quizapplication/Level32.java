package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level32 extends AppCompatActivity implements View.OnClickListener{

    Button l32a,l32b,l32c,l32d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level32);
        l32a=(Button)findViewById(R.id.button41);
        l32b=(Button)findViewById(R.id.button42);
        l32c=(Button)findViewById(R.id.button43);
        l32d=(Button)findViewById(R.id.button44);
        l32a.setOnClickListener(this);
        l32b.setOnClickListener(this);
        l32c.setOnClickListener(this);
        l32d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level32, menu);
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

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.button41:
                Toast.makeText(getBaseContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level33.class);
                startActivity(i1);
                break;
            case R.id.button42:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level33.class);
                startActivity(i2);

                break;
            case R.id.button43:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level33.class);
                startActivity(i3);

                break;
            case R.id.button44:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level33.class);
                startActivity(i4);
                break;
        }
    }
}
