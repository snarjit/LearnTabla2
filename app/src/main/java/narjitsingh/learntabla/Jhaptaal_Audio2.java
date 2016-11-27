package narjitsingh.learntabla;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by NarjitSingh on 8/17/16.
 */
public class Jhaptaal_Audio2 extends AppCompatActivity {
    ImageButton slow;
    ImageButton medium;
    ImageButton fast;
    ImageButton fastStop;

    private static MediaPlayer mp;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jhaptaal2);
        // getting slow button play and stop
        slow = (ImageButton) findViewById(R.id.jhaptaal2_audio_slow);

//getting medium button play and stop
        medium = (ImageButton) findViewById(R.id.jhaptaal2_audio_medium);

        //getting fast button play and stop
        fast = (ImageButton) findViewById(R.id.jhaptaal2_audio_fast);
        fastStop = (ImageButton) findViewById(R.id.jhaptaal2_audio_stop);
        slow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.rajj);
                mp.start();
            }

        });


        medium.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.keas);
                mp.start();
            }
        });


        fast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.purza);
                mp.start();
            }
        });
        fastStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.rajj);
                mp.stop();
            }

        });
    }


    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    public void onBackPressed() {
        stopPlaying();
        Intent back = new Intent(getApplicationContext(), Jhaptaal_ListView.class);
        startActivity(back);

    }
}
