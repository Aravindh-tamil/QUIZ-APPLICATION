package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level21 extends AppCompatActivity implements View.OnClickListener {

    Button l21a,l21b,l21c,l21d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level21);
        l21a=(Button)findViewById(R.id.button21);
        l21b=(Button)findViewById(R.id.button22);
        l21c=(Button)findViewById(R.id.button23);
        l21d=(Button)findViewById(R.id.button24);
        l21a.setOnClickListener(this);
        l21b.setOnClickListener(this);
        l21c.setOnClickListener(this);
        l21d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level21, menu);
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
            case R.id.button21:
                Toast.makeText(getBaseContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level22.class);
                startActivity(i1);
                break;
            case R.id.button2:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level22.class);
                startActivity(i2);

                break;
            case R.id.button23:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level22.class);
                startActivity(i3);

                break;
            case R.id.button24:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level22.class);
                startActivity(i4);
                break;
        }
    }
}
