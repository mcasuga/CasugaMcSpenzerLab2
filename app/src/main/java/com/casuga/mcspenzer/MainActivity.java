package com.casuga.mcspenzer;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_constraint_layout);

        String tag = (String) findViewById(R.id.theView).getTag();

        Resources resource = getResources();
        String[] title = resource.getStringArray(R.array.title);
        String[] distance = resource.getStringArray(R.array.distance);
        String[] layout_titles = resource.getStringArray(R.array.layout_titles);

        if (tag.equals("constraint")) {
            setTitle(layout_titles[0]);
            ImageView constraint_imageView = findViewById(R.id.constraintImageView);
            constraint_imageView.setImageResource(R.drawable.reichtag);

            // Set the title
            TextView titleTextView = findViewById(R.id.constraint_titleTextView);
            titleTextView.setText(title[0]);

            // Set the location
            TextView locationTextView = findViewById(R.id.constraint_locationValueTextView);
            locationTextView.setText(R.string.location);

            // Set the distance
            TextView distanceTextView = findViewById(R.id.constraint_distanceValueTextView);
            distanceTextView.setText(distance[0]);
        } else if (tag.equals("relative")) {
            setTitle(layout_titles[1]);
            ImageView relative_imageView = findViewById(R.id.relativeImageView);
            relative_imageView.setImageResource(R.drawable.pergamon);

            // Set the title
            TextView titleTextView = findViewById(R.id.relative_titleTextView);
            titleTextView.setText(title[1]);

            // Set the location
            TextView locationTextView = findViewById(R.id.relative_locationValueTextView);
            locationTextView.setText(R.string.location);

            // Set the distance
            TextView distanceTextView = findViewById(R.id.relative_distanceValueTextView);
            distanceTextView.setText(distance[1]);
        } else if (tag.equals("linear")) {
            setTitle(layout_titles[2]);
            ImageView linear_imageView = findViewById(R.id.linearImageView);
            linear_imageView.setImageResource(R.drawable.hotel);

            // Set the title
            TextView titleTextView = findViewById(R.id.linear_titleTextView);
            titleTextView.setText(title[2]);

            // Set the location
            TextView locationTextView = findViewById(R.id.linear_locationValueTextView);
            locationTextView.setText(R.string.location);

            // Set the distance
            TextView distanceTextView = findViewById(R.id.linear_distanceValueTextView);
            distanceTextView.setText(distance[2]);
        }
    }
}
