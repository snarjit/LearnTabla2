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
 * Created by SurnarSingh on 8/16/16.
 */
public class ListView_Kehrwa extends AppCompatActivity {
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

        myList.add(new TaalList("Details on Kehrwa", "Kehrwa consists of 8 beats divided into 4+4.\n" +
                "Click on the audio or video to listen or watch and get an overview on how a complete Kehrwa is played.",audio, video));

        myList.add(new TaalList("Kehrwa 1", "Dha Ge Na Tin\n" +
                "Na Ke Dhin Na",audio, video));

        myList.add(new TaalList("Kehrwa 2", "Dha Tit Tin Tin\n" +
                "Ta Tit Dhin Dhin", audio, video));

        myList.add(new TaalList("Thapp 1", "Ta Kit Ta\n" +
                "Ta Kit Ta",audio, video));
        myList.add(new TaalList("Thapp 2", "Tit Na Na\n" +
                "Tit Na Na",audio, video));

        myList.add(new TaalList("Thapp 3", "Tit Nana Tit Nana\n" +
                "Tit Na Ta Tirkit Ta Kirkit",audio, video));

        myList.add(new TaalList("Kehrwa 3", "Dha Dhin Dha Dhin\n" +
                "Dha Tin Ta Ta Tit", audio, video));

        myList.add(new TaalList("Kehrwa 4", "Dha Dhin Nag Tit\n" +
                "Ta Tin Nag Tit",  audio, video));

        myList.add(new TaalList("Kehrwa 5", "Tirkit Ta Dhin\n" +
                "Dhin Na Ke", audio, video));

        myList.add(new TaalList("Kehrwa 6", "Dhin Na, Dhin Dhinna\n" +
                "Tin Na, Tin Tinna", audio, video));

        myList.add(new TaalList("Kehrwa 7", "Dhin Na Dhin Dhina\n" +
                "Tirkit Ta Dhina", audio, video));

        myList.add(new TaalList("Kehrwa 8", "Dhi-NaDhi-N\n" +
                "Na Na Na Na", audio, video));

        myList.add(new TaalList("Kehrwa 9", "Dha Tina\n" +
                "Tage Dhina", audio, video));

        myList.add(new TaalList("Kehrwa 10", "Dha Ti Na Na\n" +
                "Ta Dhi Na Na", audio, video));

        myList.add(new TaalList("Kehrwa 11", "Dhit Nana\n" +
                "Tit Nana", audio, video));

        myList.add(new TaalList("Kehrwa 12", "Dha Dhin Nana Tirkit\n" +
                "Ta Dhin Nana Tirkit", audio, video));

        myList.add(new TaalList("Kehrwa 13", "Dha Ti Na Na\n" +
                "Ta Dhi Na Na", audio, video));
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
            super(ListView_Kehrwa.this, R.layout.inside_taal_custom_list, myList);
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
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio1.class);
                        startActivity(check);
                    }
                    if (position == 1) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio2.class);
                        startActivity(check);
                    }

                    if (position == 2) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio3.class);
                        startActivity(check);
                    }

                    if (position == 3) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio4.class);
                        startActivity(check);
                    }


                    if (position == 4) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio5.class);
                        startActivity(check);
                    }


                    if (position == 5) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio6.class);
                        startActivity(check);
                    }


                    if (position == 6) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio7.class);
                        startActivity(check);
                    }


                    if (position == 7) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio8.class);
                        startActivity(check);
                    }


                    if (position == 8) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio9.class);
                        startActivity(check);
                    }


                    if (position == 9) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio10.class);
                        startActivity(check);
                    }


                    if (position == 10) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio11.class);
                        startActivity(check);
                    }


                    if (position == 11) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio12.class);
                        startActivity(check);
                    }

                    if (position == 12) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio13.class);
                        startActivity(check);
                    }

                    if (position == 13) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio14.class);
                        startActivity(check);
                    }


                    if (position == 14) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio15.class);
                        startActivity(check);
                    }


                    if (position == 15) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio16.class);
                        startActivity(check);
                    }

                    if (position == 16) {
                        Intent check = new Intent(ListView_Kehrwa.this, Kehrwa_Audio17.class);
                        startActivity(check);
                    }
                    Toast.makeText(ListView_Kehrwa.this, "" + post,
                            Toast.LENGTH_SHORT).show();
                }
            });

            video = (ImageButton) itemView.findViewById(R.id.video_symbol);
            video.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (position == 0) {
                        Intent intent = YouTubeStandalonePlayer.createVideoIntent(ListView_Kehrwa.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");
                        startActivity(intent);

                    }
                    if (position == 1) {
                        Intent intent = YouTubeStandalonePlayer.createVideoIntent(ListView_Kehrwa.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");

                        startActivity(intent);
                    }
                    Toast.makeText(ListView_Kehrwa.this, "Loading Video",
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
                            Toast.makeText(ListView_Kehrwa.this, "" + position,
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


