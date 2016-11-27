package narjitsingh.learntabla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


//        int secondsDelayed = 1;
//        new Handler().postDelayed(new Runnable() {
//            public void run() {
//                startActivity(new Intent(MainActivity.this, Layoutcheck.class));
//
//                finish();
//            }
//        }, secondsDelayed * 2000);
//
//        ImageButton basics = (ImageButton) findViewById(R.id.taal_basics_button);
//
//        basics.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent basicsIntent = new Intent(getApplicationContext(), Teentaal.class);
//                startActivity(basicsIntent);
//            }
//        });
//
//}


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        ImageButton button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Basics_Adapter_Activity.class);
                startActivity(one);
            }
        });


        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), ListView_Teentaal.class);
                startActivity(one);
            }
        });


        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), ListView_Kehrwa.class);
                startActivity(one);
            }
        });

        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Dadra_Taal_ListView.class);
                startActivity(one);
            }
        });

        ImageButton button5 = (ImageButton) findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Deepchandi_ListView.class);
                startActivity(one);
            }
        });

        ImageButton button6 = (ImageButton) findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Rupak_ListView.class);
                startActivity(one);
            }
        });


        ImageButton button7 = (ImageButton) findViewById(R.id.imageButton7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Jhaptaal_ListView.class);
                startActivity(one);
            }
        });


        ImageButton button8 = (ImageButton) findViewById(R.id.imageButton8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Ektaal_ListView.class);
                startActivity(one);
            }
        });


        ImageButton button9 = (ImageButton) findViewById(R.id.imageButton9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Sultaal_ListView.class);
                startActivity(one);
            }
        });

        ImageButton button10 = (ImageButton) findViewById(R.id.imageButton10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Chaartaal_ListView.class);
                startActivity(one);
            }
        });

        ImageButton button11 = (ImageButton) findViewById(R.id.imageButton11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(), Panjtaal_ListView.class);
                startActivity(one);
            }
        });




    }
}
