package com.csclab.drag_example;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends Activity{

    private TextView nameText;
    private ImageView dino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        /** In order to create a dragabble icon:
         * 1. Find the UI element on xml file
         * 2. Use Bundle to retrieve name string
         * 3. Display "Welcome 'username' "
         * 4. Set image resource and its touch listener **/

        nameText = (TextView) findViewById(R.id.nameTextView);
        dino = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = this.getIntent().getExtras();
        String nameOfUser = bundle.getString("nameOfUser");

        nameText.setText("Welcome " + nameOfUser);

        dino.setImageResource(R.drawable.dino);
        dino.setOnTouchListener(imgListener);



    }

    private OnTouchListener imgListener = new OnTouchListener() {
        private float x, y; //The x, y position of the image
        private float mx, my; // The distance from original position to finger dragging

        // For the draggable options, we can use ACTION_DOWN and ACTION_MOVE

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()){
                case MotionEvent.ACTION_DOWN: //ACTION_DOWN
                    x= v.getX()-event.getRawX();
                    y = v.getY()-event.getRawY();
                    break;
                case MotionEvent.ACTION_MOVE: //ACTION_MOVE
                    v.animate().x(event.getRawX()+x).y(event.getRawY()+y).setDuration(0).start();
                    break;

            }

            return true;
        }
    };

}
