/*Button with Listener1 in App Development.

    Date:29 August,2023
    Author:Hasibur Rahman

 */

package com.example.buttonwithlistener1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int count=0;
    private Button loginButton1,loginButton2,logoutButton1;

    private TextView textView1,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton1 = (Button) findViewById(R.id.loginButtonId1);
        loginButton2 = (Button) findViewById(R.id.loginButtonId2);
        logoutButton1 = (Button) findViewById(R.id.logoutButtonId1);

        textView1 = (TextView) findViewById(R.id.textViewId1);
        textView2 = (TextView) findViewById(R.id.textViewId2);

        loginButton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                count++;
                textView1.setText("Login Button is Clicked "+count+" times.");
            }
        });

        loginButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView2.setText("Login Button is Clicked.");
            }
        });

        logoutButton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView2.setText("Logout Button is Clicked.");
            }
        });
    }
}