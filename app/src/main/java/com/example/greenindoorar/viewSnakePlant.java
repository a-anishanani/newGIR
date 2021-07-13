package com.example.greenindoorar;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.player.UnityPlayerActivity;


public class viewSnakePlant extends AppCompatActivity {

    //this is the unity holder class
    //this class opens unity from a button click in android studio

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_snake_plant);

        Intent intent = new Intent(viewSnakePlant.this, UnityPlayerActivity.class );
      //  intent.putExtra("name", "value");
        startActivity(intent);

    }



}
