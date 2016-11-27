package narjitsingh.learntabla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by SurnarSingh on 8/13/16.
 */
public class Basics_Adapter_Activity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basics_square_images_grid);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new Square_Images_Adapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                if(position==0){
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(Basics_Adapter_Activity.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");
                    startActivity(intent);
                }

            }
        });
    }
}


