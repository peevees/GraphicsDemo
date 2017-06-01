package com.mikecoding.graphicsdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class GraphicsDemoActivity extends AppCompatActivity {
    ImageView ourView;

    //the entry to the game
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_graphics_demo);

        //do all our drawing in a seperate method
        draw();

        //Make ourView ImageView ovject the view for the activity
        setContentView(ourView);
    }

    public void draw(){
        //declare an object of type Bitmap
        Bitmap blankBitkmap;
        //make it 600 x 600 pixels in size and an appropriate format
        blankBitkmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);
        //declare an object of type canvas
        Canvas canvas;
        //initialize it by making its surface our previously created blank bitmap
        canvas = new Canvas(blankBitkmap);

        //initialize our previously declared member object of type imageview
        ourView = new ImageView(this);
        //put our blank bitmap on ourview
        ourView.setImageBitmap(blankBitkmap);

        //we now have a surface ready to draw on
        //but we need something to draw with

        //declare an object of type Paint
        Paint paint;
        //initialize it ready for painting our canvas
        paint = new Paint();

        //make the canvas white
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        //make the brush blue
        paint.setColor(Color.argb(255, 26, 128, 182));
        //we can change this around as well

        //declare an object of type Bitmap
        Bitmap bitmapbob;
        //initialize it using the bob.png
        bitmapbob = BitmapFactory.decodeResource(this.getResources(), R.drawable.bob);
        //now draw bob to our canvas
        canvas.drawBitmap(bitmapbob, 500, 50, paint);

        //draw a line
        canvas.drawLine(50, 50, 250, 250,  paint);

        //Draw some text
        canvas.drawText("Game Code Test", 50, 50, paint);

        //draw a pixel
        canvas.drawPoint(40, 50, paint);

        //draw a circle
        canvas.drawCircle(350, 250, 100, paint);

        //change the brush color
        paint.setColor(Color.argb(255, 249, 129, 0));

        //draw a rectangle
        canvas.drawRect(50, 450, 500, 550, paint);

        //back to onCreate method to set our canvas as the view
    }
}
