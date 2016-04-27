package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level12 extends AppCompatActivity implements View.OnClickListener{

    Button l12a,l12b,l12c,l12d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level12);

        l12a=(Button)findViewById(R.id.button9);
        l12b=(Button)findViewById(R.id.button10);
        l12c=(Button)findViewById(R.id.button11);
        l12d=(Button)findViewById(R.id.button12);
        l12a.setOnClickListener(this);
        l12b.setOnClickListener(this);
        l12c.setOnClickListener(this);
        l12d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level13, menu);
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
            case R.id.button9:
                Toast.makeText(getBaseContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level13.class);
                startActivity(i1);
                break;
            case R.id.button10:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level13.class);
                startActivity(i2);

                break;
            case R.id.button11:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level13.class);
                startActivity(i3);

                break;
            case R.id.button12:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level13.class);
                startActivity(i4);
                break;
        }
    }
}
