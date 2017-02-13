package com.example.baker.tweenanimation3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnimatetText;
    ImageView imgIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnimatetText=(TextView)findViewById(R.id.txtAnimatedText);
        imgIcon=(ImageView)findViewById(R.id.imageView);

        txtAnimatetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //load Animation
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                txtAnimatetText.startAnimation(rotate);
            }
        });
        txtAnimatetText.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //long time press korle animation bondo hobe
                txtAnimatetText.clearAnimation();//for stop animation
                return true;
            }
        });
        imgIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load Animation
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                imgIcon.startAnimation(rotate);
            }
        });
        imgIcon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //long time press korle animation bondo hobe
                imgIcon.clearAnimation();//for stop animation
                return true;
            }
        });
    }
}
