package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level41 extends AppCompatActivity implements View.OnClickListener{

    Button l41a,l41b,l41c,l41d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level41);
        l41a=(Button)findViewById(R.id.button53);
        l41b=(Button)findViewById(R.id.button54);
        l41c=(Button)findViewById(R.id.button55);
        l41d=(Button)findViewById(R.id.button56);
        l41a.setOnClickListener(this);
        l41b.setOnClickListener(this);
        l41c.setOnClickListener(this);
        l41d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level41, menu);
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
            case R.id.button53:
                Toast.makeText(getBaseContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                Intent i1=new Intent(getBaseContext(),Level42.class);
                startActivity(i1);
                break;
            case R.id.button54:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(getBaseContext(),Level42.class);
                startActivity(i2);

                break;
            case R.id.button55:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(getBaseContext(),Level42.class);
                startActivity(i3);

                break;
            case R.id.button56:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i4=new Intent(getBaseContext(),Level42.class);
                startActivity(i4);
                break;
        }
    }
}
