package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level22 extends AppCompatActivity implements View.OnClickListener{

    Button l22a,l22b,l22c,l22d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level22);
        l22a=(Button)findViewById(R.id.button25);
        l22b=(Button)findViewById(R.id.button26);
        l22c=(Button)findViewById(R.id.button27);
        l22d=(Button)findViewById(R.id.button28);
        l22a.setOnClickListener(this);
        l22b.setOnClickListener(this);
        l22c.setOnClickListener(this);
        l22d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level22, menu);
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
            case R.id.button25:
                Toast.makeText(getBaseContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level23.class);
                startActivity(i1);
                break;
            case R.id.button26:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level23.class);
                startActivity(i2);

                break;
            case R.id.button27:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level23.class);
                startActivity(i3);

                break;
            case R.id.button28:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level23.class);
                startActivity(i4);
                break;
        }
    }
}
