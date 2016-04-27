package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level33 extends AppCompatActivity implements View.OnClickListener{

    Button l33a,l33b,l33c,l33d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level33);
        l33a=(Button)findViewById(R.id.button45);
        l33b=(Button)findViewById(R.id.button46);
        l33c=(Button)findViewById(R.id.button47);
        l33d=(Button)findViewById(R.id.button48);
        l33a.setOnClickListener(this);
        l33b.setOnClickListener(this);
        l33c.setOnClickListener(this);
        l33d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level33, menu);
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
            case R.id.button45:
                Toast.makeText(getBaseContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level34.class);
                startActivity(i1);
                break;
            case R.id.button46:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level34.class);
                startActivity(i2);

                break;
            case R.id.button47:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level34.class);
                startActivity(i3);

                break;
            case R.id.button48:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level34.class);
                startActivity(i4);
                break;
        }
    }
}
