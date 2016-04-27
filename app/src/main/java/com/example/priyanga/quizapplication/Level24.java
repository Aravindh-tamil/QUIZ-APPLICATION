package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level24 extends AppCompatActivity implements View.OnClickListener{

    Button l24a,l24b,l24c,l24d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level24);
        l24a=(Button)findViewById(R.id.button33);
        l24b=(Button)findViewById(R.id.button34);
        l24c=(Button)findViewById(R.id.button35);
        l24d=(Button)findViewById(R.id.button36);
        l24a.setOnClickListener(this);
        l24b.setOnClickListener(this);
        l24c.setOnClickListener(this);
        l24d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level24, menu);
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
            case R.id.button33:
                Toast.makeText(getBaseContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 2 completed!!-Good Improvement", Toast.LENGTH_LONG).show();
                Intent i1=new Intent(getBaseContext(),Level31.class);
                startActivity(i1);
                break;
            case R.id.button34:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 2 completed!!-Good Improvement", Toast.LENGTH_LONG).show();
                Intent i2=new Intent(getBaseContext(),Level31.class);
                startActivity(i2);

                break;
            case R.id.button35:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 2 completed!!-Good Improvement", Toast.LENGTH_LONG).show();
                Intent i3=new Intent(getBaseContext(),Level31.class);
                startActivity(i3);

                break;
            case R.id.button36:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 2 completed!!-Good Improvement", Toast.LENGTH_LONG).show();
                Intent i4=new Intent(getBaseContext(),Level31.class);
                startActivity(i4);
                break;
        }
    }
}
