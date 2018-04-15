package com.alhaj.magic8ball;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Vibrator;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.img_ball);
       final TextView mytext = findViewById(R.id.txt_img);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
       /*         Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                // Vibrate for 500 milliseconds
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    if (vibrator != null) {
                        vibrator.vibrate(VibrationEffect.createOneShot(500,VibrationEffect.DEFAULT_AMPLITUDE));
                    }
                }else{
                    //deprecated in API 26
                    if (vibrator != null) {
                        vibrator.vibrate(500);
                    }
                }*/
                String answer = gettext();
                mytext.setText(answer);

            }


        });

    }



    private String  gettext() {
        Random random = new Random();
        int x = random.nextInt(8);
        String answer ;
        switch (x) {
            case 0: {
                answer = "Better not tell you now";
                return answer;
            }
            case 1:
            {
                answer = "Yes you can";
                return answer;
            }
            case 2:
            {
                answer = "Hell No";
                return answer;

            }
            case 3:
            {
                answer = "It's decodedly so";

                return answer;

            }
            case 4:
            {
                answer = "Without a doubt";
                return answer;
            }
            case 5:
            {
                answer = "Yes - definitely";
                return answer;

            }
            case 6:
            {
                answer = "You may rely on it";
                return answer;
            }
            case 7:
            {
                answer = "As I see it, yes";
                return answer;

            }
            default:
            {
                answer = "Reply hazy, try again";
                return answer;

            }
        }
    }
}

