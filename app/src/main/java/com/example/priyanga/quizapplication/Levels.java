package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Levels extends AppCompatActivity implements View.OnClickListener {

    Button l1,l2,l3,l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        l1=(Button)findViewById(R.id.button);
        l2=(Button)findViewById(R.id.button2);
        l3=(Button)findViewById(R.id.button3);
        l4=(Button)findViewById(R.id.button4);
        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_levels, menu);
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
            case R.id.button:
                Toast.makeText(getBaseContext(), "Have a good start", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level11.class);
                startActivity(i1);
                break;
            case R.id.button2:
                Toast.makeText(getBaseContext(),"Good Improvement",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level21.class);
                startActivity(i2);

                break;
            case R.id.button3:
                Toast.makeText(getBaseContext(),"Great!!",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level31.class);
                startActivity(i3);

                break;
            case R.id.button4:
                Toast.makeText(getBaseContext(),"Intelligent",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level41.class);
                startActivity(i4);
                break;

        }
    }
}
