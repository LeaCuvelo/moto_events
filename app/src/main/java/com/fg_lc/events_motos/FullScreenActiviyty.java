package com.fg_lc.events_motos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FullScreenActiviyty extends AppCompatActivity {

    @BindView(R.id.main_image)
    ImageView mainImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_screen_activity_layout);
        ButterKnife.bind(this);

        Picasso.with(getApplicationContext())
                .load("https://soymotor.files.wordpress.com/2014/09/cartel-motomadrid-2015.jpg")
                .error(R.drawable.error_loading_image)
                .into(mainImage);

    }
}
