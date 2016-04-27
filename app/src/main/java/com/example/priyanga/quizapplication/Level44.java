package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level44 extends AppCompatActivity implements View.OnClickListener{

    Button l44a,l44b,l44c,l44d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level44);
        l44a=(Button)findViewById(R.id.button65);
        l44b=(Button)findViewById(R.id.button66);
        l44c=(Button)findViewById(R.id.button67);
        l44d=(Button)findViewById(R.id.button68);
        l44a.setOnClickListener(this);
        l44b.setOnClickListener(this);
        l44c.setOnClickListener(this);
        l44d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level44, menu);
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
            case R.id.button65:
                Toast.makeText(getBaseContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Last.class);
                Toast.makeText(getBaseContext(), "Level 4 completed!!-Intelligent", Toast.LENGTH_LONG).show();
                startActivity(i1);
                break;
            case R.id.button66:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Last.class);
                Toast.makeText(getBaseContext(), "Level 4 completed!!-Intelligent", Toast.LENGTH_LONG).show();
                startActivity(i2);
                break;
            case R.id.button67:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Last.class);
                Toast.makeText(getBaseContext(), "Level 4 completed!!-Intelligent", Toast.LENGTH_LONG).show();
                startActivity(i3);
                break;
            case R.id.button68:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Last.class);
                Toast.makeText(getBaseContext(), "Level 4 completed!!-Intelligent", Toast.LENGTH_LONG).show();
                startActivity(i4);
                break;
        }
    }
}
