package narjitsingh.learntabla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SurnarSingh on 8/17/16.
 */
public class Chaartaal_ListView extends AppCompatActivity {
    public List<TaalList> myList = new ArrayList<TaalList>();
    ImageButton audio;
    ImageButton video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taals_layout);
        fill_eventsList();
        fill_ListView();
        clickResponse();
    }
//    public TaalList(String name, int iconId,  int beats) {


    private void fill_eventsList() {


        myList.add(new TaalList("Chaartaal 1", "Dha Dha Dhin Ta Tit Dha Dhin Ta Tit Kata Gid Gena", audio, video));
    }


    private void fill_ListView() {
        ArrayAdapter<TaalList> listArrayAdapter = new myListAdapter();
        ListView list = (ListView) findViewById(R.id.id_listView);
        if (list != null) {
            list.setAdapter(listArrayAdapter);
        }


    }

    private class myListAdapter extends ArrayAdapter<TaalList> {
        public myListAdapter() {
            // what objects are going in there and how are they going to look
            super(Chaartaal_ListView.this, R.layout.inside_taal_custom_list, myList);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            final int post = position;
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.inside_taal_custom_list, parent, false);


            }

//            if(audio!=null){
//                audio.setOnClickListener(new View.OnClickListener() {
//                    public void onClick(View v) {
//                        Toast.makeText(ListView_Teentaal.this, "" + post,
//                                Toast.LENGTH_SHORT).show();
//                    }
//                });

//            }


            TaalList current_list = myList.get(position);


//            ImageView imageView = (ImageView) itemView.findViewById(R.id.theka);
//            imageView.setImageResource(current_list.getIconId());
            TextView taalname = (TextView) itemView.findViewById(R.id.taal_type);
            taalname.setText(current_list.getTaal_type());

            TextView titleTxt = (TextView) itemView.findViewById(R.id.taal_description);
            titleTxt.setText(current_list.getName());

            ImageButton audio = (ImageButton) itemView.findViewById(R.id.audio_symbol);
            audio.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (position == 0) {
                        Intent check = new Intent(Chaartaal_ListView.this, Chaartaal_Audio1.class);
                        startActivity(check);
                    }

                    Toast.makeText(Chaartaal_ListView.this, "" + post,
                            Toast.LENGTH_SHORT).show();
                }
            });

            video = (ImageButton) itemView.findViewById(R.id.video_symbol);
            video.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (position == 0) {
                        Intent intent = YouTubeStandalonePlayer.createVideoIntent(Chaartaal_ListView.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");
                        startActivity(intent);

                    }
                    if (position == 1) {
                        Intent intent = YouTubeStandalonePlayer.createVideoIntent(Chaartaal_ListView.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");

                        startActivity(intent);
                    }
                    Toast.makeText(Chaartaal_ListView.this, "Loading Video",
                            Toast.LENGTH_SHORT).show();
                }

            });


            return itemView;
        }

    }

    public void clickResponse() {
        ListView l = (ListView) findViewById(R.id.id_listView);
        if (l != null) {
            l.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, final View viewClicked,
                                        final int position, long id) {
//                    TaalList clickedItem = myList.get(position);
//                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(ListView_Teentaal.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");
//                    startActivity(intent);


//                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1-9IWQ3Npdw#t=2.897774"));
//                    intent.putExtra("force_fullscreen",true);
//                    intent.putExtra("force_autoplay",true);
//                    intent.setComponent("com.google.android.youtube/.UrlActivity");

//                    startActivity(intent);


                    if (position == 0) {
                        if (audio.isPressed()) {
                            Toast.makeText(Chaartaal_ListView.this, "" + position,
                                    Toast.LENGTH_SHORT).show();
                        }
                    }


                }
            });
        }
    }
    public void onBackPressed() {
        Intent back = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(back);

        }
    }