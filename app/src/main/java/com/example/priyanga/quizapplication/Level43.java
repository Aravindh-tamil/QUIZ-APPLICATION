package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level43 extends AppCompatActivity implements View.OnClickListener{

    Button l43a,l43b,l43c,l43d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level43);
        l43a=(Button)findViewById(R.id.button61);
        l43b=(Button)findViewById(R.id.button62);
        l43c=(Button)findViewById(R.id.button63);
        l43d=(Button)findViewById(R.id.button64);
        l43a.setOnClickListener(this);
        l43b.setOnClickListener(this);
        l43c.setOnClickListener(this);
        l43d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level43, menu);
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
            case R.id.button61:
                Toast.makeText(getBaseContext(),"Wrong answer", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level44.class);
                startActivity(i1);
                break;
            case R.id.button62:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level44.class);
                startActivity(i2);

                break;
            case R.id.button63:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level44.class);
                startActivity(i3);

                break;
            case R.id.button64:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level44.class);
                startActivity(i4);
                break;
        }
    }
}
