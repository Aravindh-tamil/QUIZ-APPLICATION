package com.example.priyanga.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level14 extends AppCompatActivity implements View.OnClickListener {

    Button l14a,l14b,l14c,l14d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level14);
        l14a=(Button)findViewById(R.id.button17);
        l14b=(Button)findViewById(R.id.button18);
        l14c=(Button)findViewById(R.id.button19);
        l14d=(Button)findViewById(R.id.button20);
        l14a.setOnClickListener(this);
        l14b.setOnClickListener(this);
        l14c.setOnClickListener(this);
        l14d.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level14, menu);
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
            case R.id.button17:
                Toast.makeText(getBaseContext(), "Wrong answer", Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 1 completed!!-Great Start", Toast.LENGTH_LONG).show();
                Intent i1=new Intent(getBaseContext(),Level21.class);
                startActivity(i1);
                break;
            case R.id.button18:
                Toast.makeText(getBaseContext(),"Correct answer!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 1 completed!!-Great Start", Toast.LENGTH_LONG).show();
                Intent i2=new Intent(getBaseContext(),Level21.class);
                startActivity(i2);

                break;
            case R.id.button19:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 1 completed!!-Great Start", Toast.LENGTH_LONG).show();
                Intent i3=new Intent(getBaseContext(),Level21.class);
                startActivity(i3);

                break;
            case R.id.button20:
                Toast.makeText(getBaseContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Level 1 completed!!-Great Start", Toast.LENGTH_LONG).show();
                Intent i4=new Intent(getBaseContext(),Level21.class);
                startActivity(i4);
                break;
        }
    }
}
