package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level34 extends AppCompatActivity implements View.OnClickListener {

    Button l34a,l34b,l34c,l34d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level34);
        l34a=(Button)findViewById(R.id.button49);
        l34b=(Button)findViewById(R.id.button50);
        l34c=(Button)findViewById(R.id.button51);
        l34d=(Button)findViewById(R.id.button52);
        l34a.setOnClickListener(this);
        l34b.setOnClickListener(this);
        l34c.setOnClickListener(this);
        l34d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level34, menu);
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
            case R.id.button49:
                Toast.makeText(getBaseContext(),"Wrong answer", Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 3 completed!!-Great!!", Toast.LENGTH_LONG).show();
                Intent i1=new Intent(getBaseContext(),Level41.class);
                startActivity(i1);
                break;
            case R.id.button50:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 3 completed!!-Great!!", Toast.LENGTH_LONG).show();
                Intent i2=new Intent(getBaseContext(),Level41.class);
                startActivity(i2);

                break;
            case R.id.button51:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 3 completed!!-Great!!", Toast.LENGTH_LONG).show();
                Intent i3=new Intent(getBaseContext(),Level41.class);
                startActivity(i3);

                break;
            case R.id.button52:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 3 completed!!-Great!!", Toast.LENGTH_LONG).show();
                Intent i4=new Intent(getBaseContext(),Level41.class);
                startActivity(i4);
                break;
        }

    }
}
