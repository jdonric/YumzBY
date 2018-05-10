package com.jiellr.yumzby;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //object variable
    Intent cookiePage = new Intent(this, CookieActivity.class );
    Intent cupcakePage = new Intent(this, CupcakeActivity.class);
    Intent confectionPage = new Intent(this, ConfectionActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //when user clicks cupcakes
    private void goCupcake() {
        startActivity(cupcakePage);
    }


    //when user clicks cookies
    private void goCookie() {
      startActivity(cookiePage);
    }

    //when user clicks confections
    private void goConfection() {
       startActivity(confectionPage);
    }


      //Main click method
    public void userClick(View view) {

        ImageButton cupcake = (ImageButton) findViewById(R.id.button_cupcake);
        ImageButton cookie = (ImageButton) findViewById(R.id.button_cookie);
        ImageButton candy = (ImageButton) findViewById(R.id.button_candy);




        if (cupcake.isPressed()) {
            goCupcake();
        }
        if(cookie.isPressed()) {
            goCookie();
        }
        if(candy.isPressed())  {
            goConfection();
        }
    }
}

