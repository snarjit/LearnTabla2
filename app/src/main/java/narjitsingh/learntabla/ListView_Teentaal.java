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
 * Created by Narjiit Singh on 8/9/16.
 */
public class ListView_Teentaal extends AppCompatActivity {
    public List<TaalList> myList = new ArrayList<TaalList>();
    int positioncheck;
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

    private void fill_eventsList() {
        myList.add(new TaalList("Details about Teentaal", "Teentaal is in 16 matras (beats) divided into 4+4+4+4.\n" +
                "Kaida means rule consisting of different compositions.\n" +
                "Teentaal has various kaidas and they allow us to add variation as well as complexity to a particular taal.\n" +
                "Click on the audio or video to listen or watch and get an overview on how a complete teentaal is played.",  audio, video));


        myList.add(new TaalList("Teentaal 1", "Dha Dhin Dhin Dha ,Dha Dhin Dhin Dha\n" +
                "Dha Tin Tin Ta, Ta Dhin Dhin Dha",  audio, video));


        myList.add(new TaalList("Teentaal 2", "Dha Dhin Dhin Dha, Dha Dhin Dhin Dha\n" +
                "Dha Tit Tin Nana Tit, Dha Tit Dha Tit Dha",  audio, video));

        myList.add(new TaalList("Teentaal 3", "Dhage Dhin Gedha, Dhage Dhin Gedha\n" +
                "Dhake Tin Keta, Tage Dhin Gedha",  audio, video));


        myList.add(new TaalList("Teehai", "Dha Dha Tirkit, Dha Dha Tuna Dha\n" +
                "Dha Dha Tirkit, Dha Dha Tuna Dha\n" +
                "Dha Dha Tirkit, Dha Dha Tuna Dha", audio, video));

        myList.add(new TaalList("Kaida 1", "Dha Tit , Dha Tit, Dha Dha Tit, Dha Ge Tina Kena\n" +
                "Ta Tit, Ta Tit, Dha Dha Tit, Dhage Dhina Gena",  audio, video));

        myList.add(new TaalList("Kaida 2", "Dha Tirkit Dha Tirkit Dha Dha Tirkit Dhage Tunaken\n" +
                "Ta Tirkit Ta Tirkit Dha Dha Tirkit Dhage Dhinagena",  audio, video));

        myList.add(new TaalList("Kaida 3", "Dha Tit, Dha Tit Tit, Dha Tit, Dha Tit Tit\n" +
                "Dha Tit, Dha Tit, Dha Dha Tit, Dhage Tina Kena\n" +
                "Ta Tit, Ta Tit Tit, Ta Tit, Ta Tit Tit\n" +
                "Dha Tit, Dha Tít, Dha Dha Tit, Dhage Dhina Gena",  audio, video));

        myList.add(new TaalList("Kaida 4", "Dha Dha Tirkit, Dha Dha Tuna\n" +
                "Ta Ta Tirkit, Dha Dha Dhina(x2)",  audio, video));

        myList.add(new TaalList("Kaida 5", "Dha Dha Tirkit, Tik Tirkit Tak, Dha Dha Tirkit, Dha Dha Tuna\n" +
                "Ta Ta Tirkit, Tik Tirkit Tak, Dha Dha Tirkit, Dha Dha Dhina",  audio, video));

        myList.add(new TaalList("Kaida 6", "Dha Dha Tirkit, Dha Dha Tirkit, Dha Dha Tuna\n" +
                "Dha Dha Tirkit, Dha Dha Tirkit, Dha Dha Tuna\n" +
                "Dha Dha Tirkit, Dha Dha Tuna\n" +
                "Ta Ta Tirkit, Ta Ta Tirkit, Dha Dha Dhina\n" +
                "Ta Ta Tirkit, Ta Ta Tikit, Dha Dha Dhina\n" +
                "Dha Dha Tirkit, Dha Dha Dhina",  audio, video));

        myList.add(new TaalList("Kaida 7", "Dha Tirkit Tak Tirkit Tak,Dha Dha Tirkit Dha Dha Tuna\n" +
                "Ta Tirkit Tak Tirkit Tak, Dha Tirkit Dha Dha Dhina", audio, video));

        myList.add(new TaalList("Kaida 8", "Dha Tirkit Tak Tirkit, Ta Tirkit Tak Tirkit\n" +
                "Dha Tirkit Tak Tirkit, Ta Tirkit Tak Tirkit\n" +
                "Dha Tirkit Tak Tirkit Dha, Dha Tirkit Tak Tirkit Dha\n" +
                "Dha Tirkit Tak Tirkit Dha",  audio, video));

        myList.add(new TaalList("Kaida 9", "Dhati Dha Tirkit Tak Tirkit, Dhati Dhage Tina Kena\n" +
                "Tati Ta Tirkit Tak Tirkit, Dhati Dhage Dhina Gena",  audio, video));

        myList.add(new TaalList("Kaida 10", "Dhage Tirkit Dhage Nage Tina Kena Take Tirkit\n" +
                "Dhage Tirkit Dha, Dhage Tirkit Dha, Dhage Tirkit", audio, video));


        myList.add(new TaalList("Kaida 11", "Dhati Dhage Nadha Tirkit, Dhati Dhage Tina Kena\n" +
                "Tati Tage Na Ta Tirkit, Dhati Dhage Dhina Gena",  audio, video));

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
            super(ListView_Teentaal.this, R.layout.inside_taal_custom_list, myList);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            final int post = position;
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.inside_taal_custom_list, parent, false);


            }

            TaalList current_list = myList.get(position);

            TextView taalname = (TextView) itemView.findViewById(R.id.taal_type);
            taalname.setText(current_list.getTaal_type());

            TextView titleTxt = (TextView) itemView.findViewById(R.id.taal_description);
            titleTxt.setText(current_list.getName());

            ImageButton audio = (ImageButton) itemView.findViewById(R.id.audio_symbol);
            audio.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (position == 0) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Theka_Audio.class);
                        startActivity(check);
                    }
                    if (position == 1) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Theka_Audio.class);
                        startActivity(check);
                    }

                    if (position == 2) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio2.class);
                        startActivity(check);
                    }

                    if (position == 3) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio3.class);
                        startActivity(check);
                    }


                    if (position == 4) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio4.class);
                        startActivity(check);
                    }


                    if (position == 5) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio5.class);
                        startActivity(check);
                    }


                    if (position == 6) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio6.class);
                        startActivity(check);
                    }


                    if (position == 7) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio7.class);
                        startActivity(check);
                    }


                    if (position == 8) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio8.class);
                        startActivity(check);
                    }


                    if (position == 9) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio9.class);
                        startActivity(check);
                    }


                    if (position == 10) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio10.class);
                        startActivity(check);
                    }


                    if (position == 11) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio11.class);
                        startActivity(check);
                    }

                    if (position == 12) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio12.class);
                        startActivity(check);
                    }

                    if (position == 13) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio13.class);
                        startActivity(check);
                    }


                    if (position == 14) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio14.class);
                        startActivity(check);
                    }


                    if (position == 15) {
                        Intent check = new Intent(ListView_Teentaal.this, Teentaal_Audio15.class);
                        startActivity(check);
                    }



                    Toast.makeText(ListView_Teentaal.this, "" + post,
                            Toast.LENGTH_SHORT).show();
                }
            });

            video = (ImageButton) itemView.findViewById(R.id.video_symbol);
            video.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (position == 0) {
                        Intent intent = YouTubeStandalonePlayer.createVideoIntent(ListView_Teentaal.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");
                        startActivity(intent);

                    }
                    if (position == 1) {
                        Intent intent = YouTubeStandalonePlayer.createVideoIntent(ListView_Teentaal.this, "AIzaSyA4SDxoxDXtRFPfaPTf95_X7M7zTj0Cdj4", "nE0qiGfofV8");

                        startActivity(intent);
                    }
                    Toast.makeText(ListView_Teentaal.this, "Loading Video",
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
                            Toast.makeText(ListView_Teentaal.this, "" + position,
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
