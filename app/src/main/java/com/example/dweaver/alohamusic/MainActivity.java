package com.example.dweaver.alohamusic;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    MediaPlayer firstSong, secondSong,thirdSong;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btnSong1);
        button2 = (Button) findViewById(R.id.btnSong2);
        button3 = (Button) findViewById(R.id.btnSong3);
        button1.setOnClickListener(bSong1);
        button2.setOnClickListener(bSong2);
        button3.setOnClickListener(bSong3);
        firstSong = new MediaPlayer();
        firstSong = MediaPlayer.create(this, R.raw.song1);
        secondSong = new MediaPlayer();
        secondSong = MediaPlayer.create(this, R.raw.song2);
        thirdSong = new MediaPlayer();
        thirdSong = MediaPlayer.create(this, R.raw.song3);
        playing = 0;
    }
    Button.OnClickListener bSong1 = new Button.OnClickListener(){
        @Override
        public void onClick(View v){

            switch(playing){
                case 0:
                    firstSong.start();
                    playing = 1;
                    button1.setText("Pause Song 1");
                    break;
                case 1:
                    firstSong.pause();
                    playing = 0;
                    button1.setText("Play Song 1");
                    break;
            }

        }
    };
    Button.OnClickListener bSong2 = new Button.OnClickListener(){

        @Override
        public void onClick(View v){
            switch(playing){
                case 0:
                    secondSong.start();
                    playing = 1;
                    button2.setText("Pause Song 2");
                    break;
                case 1:
                    secondSong.pause();
                    playing = 0;
                    button2.setText("Play Song 2");
                    break;
            }


        }
    };
    Button.OnClickListener bSong3 = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch(playing){
                case 0:
                    thirdSong.start();
                    playing = 1;
                    button3.setText("Pause Song 2");
                    break;
                case 1:
                    thirdSong.pause();
                    playing = 0;
                    button3.setText("Play Song 2");
                    break;
            }


        }
    };

}
