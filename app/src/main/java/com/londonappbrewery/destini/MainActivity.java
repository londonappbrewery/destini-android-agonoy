package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:


    int mStoryIndex = 1;

    Button buttonT;
    Button buttonB;

    TextView storyTextView, topStoryTextview, buttomStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView = (TextView) findViewById(R.id.storyTextView);

        buttonT = (Button) findViewById(R.id.buttonTop);
        buttonB = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonT.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Log.d("asdfsd", "has been seletecteed");


                if( mStoryIndex == 1) {

                    storyTextView.setText(R.string.T3_Story);
                    buttonT.setText(R.string.T3_Ans1);
                    buttonB.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;


                }

                else if( mStoryIndex == 3){
                    storyTextView.setText(R.string.T6_End);
                    Log.d("number is --->> ", String.valueOf(mStoryIndex));

                    mStoryIndex++;

                }

                else if ( mStoryIndex == 2){

                    //    storyTextView.setText(R.string.T3_Story);
                    storyTextView.setText(R.string.T3_Story);
                    buttonT.setText(R.string.T3_Ans1);
                    buttonB.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                    Log.d("number is --->> ", String.valueOf(mStoryIndex));
                }


            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:.
        buttonB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(mStoryIndex ==1 ) {
                    storyTextView.setText(R.string.T2_Story);
                    buttonT.setText(R.string.T2_Ans1);
                    buttonB.setText(R.string.T2_Ans2);

                    mStoryIndex = 2;
                }
                else if( mStoryIndex == 3){
                    storyTextView.setText(R.string.T5_End);
                }

                else if ( mStoryIndex == 2){
                    storyTextView.setText(R.string.T4_End);
                }
            }
        });

    } // end oncreate
}  // end MainActivity



