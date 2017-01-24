package com.example.cynda.csc_201_722;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.color.background_dark;
import static android.R.color.background_light;
import static com.example.cynda.csc_201_722.R.mipmap.black_square_queen;
import static com.example.cynda.csc_201_722.R.mipmap.black_square_used;
import static com.example.cynda.csc_201_722.R.mipmap.white_square_queen;
import static com.example.cynda.csc_201_722.R.mipmap.white_square_used;

public class MainActivity extends AppCompatActivity {

    private Button A1,A2,A3,A4,A5,A6,A7,A8;
    private Button B1,B2,B3,B4,B5,B6,B7,B8;
    private Button C1,C2,C3,C4,C5,C6,C7,C8;
    private Button D1,D2,D3,D4,D5,D6,D7,D8;
    private Button E1,E2,E3,E4,E5,E6,E7,E8;
    private Button F1,F2,F3,F4,F5,F6,F7,F8;
    private Button G1,G2,G3,G4,G5,G6,G7,G8;
    private Button H1,H2,H3,H4,H5,H6,H7,H8;
    private TextView outputTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BitmapDrawable[] currentColor = new BitmapDrawable[1];
        final int[] getColor = new int[1];
        final Button clearBT = (Button) findViewById(R.id.clearBT);
        final Button solutionBT = (Button) findViewById(R.id.solutionBT);
        outputTV = (TextView) findViewById(R.id.solutionTV);

        setButtons();

        //Testing

        //End Testing

        //Button actions for A1-A8

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A1.getHint().toString().equals("Q") && !A1.getHint().toString().equals("U")) {
                    A1.setHint("Q");
                    A1.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A2.getHint().toString().equals("Q") && !A2.getHint().toString().equals("U")) {
                    A2.setHint("Q");
                    A2.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A3.getHint().toString().equals("Q") && !A3.getHint().toString().equals("U")) {
                    A3.setHint("Q");
                    A3.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A4.getHint().toString().equals("Q") && !A4.getHint().toString().equals("U")) {
                    A4.setHint("Q");
                    A4.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A5.getHint().toString().equals("Q") && !A5.getHint().toString().equals("U")) {
                    A5.setHint("Q");
                    A5.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A6.getHint().toString().equals("Q") && !A6.getHint().toString().equals("U")) {
                    A6.setHint("Q");
                    A6.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A7.getHint().toString().equals("Q") && !A7.getHint().toString().equals("U")) {
                    A7.setHint("Q");
                    A7.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!A8.getHint().toString().equals("Q") && !A8.getHint().toString().equals("U")) {
                    A8.setHint("Q");
                    A8.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });


        //Button actions for B1-B8

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B1.getHint().toString().equals("Q") && !B1.getHint().toString().equals("U")) {
                    B1.setHint("Q");
                    B1.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B2.getHint().toString().equals("Q") && !B2.getHint().toString().equals("U")) {
                    B2.setHint("Q");
                    B2.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B3.getHint().toString().equals("Q") && !B3.getHint().toString().equals("U")) {
                    B3.setHint("Q");
                    B3.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B4.getHint().toString().equals("Q") && !B4.getHint().toString().equals("U")) {
                    B4.setHint("Q");
                    B4.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B5.getHint().toString().equals("Q") && !B5.getHint().toString().equals("U")) {
                    B5.setHint("Q");
                    B5.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B6.getHint().toString().equals("Q") && !B6.getHint().toString().equals("U")) {
                    B6.setHint("Q");
                    B6.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B7.getHint().toString().equals("Q") && !B7.getHint().toString().equals("U")) {
                    B7.setHint("Q");
                    B7.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!B8.getHint().toString().equals("Q") && !B8.getHint().toString().equals("U")) {
                    B8.setHint("Q");
                    B8.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });


        //Button actions for C1-C8

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C1.getHint().toString().equals("Q") && !C1.getHint().toString().equals("U")) {
                    C1.setHint("Q");
                    C1.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C2.getHint().toString().equals("Q") && !C2.getHint().toString().equals("U")) {
                    C2.setHint("Q");
                    C2.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C3.getHint().toString().equals("Q") && !C3.getHint().toString().equals("U")) {
                    C3.setHint("Q");
                    C3.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C4.getHint().toString().equals("Q") && !C4.getHint().toString().equals("U")) {
                    C4.setHint("Q");
                    C4.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C5.getHint().toString().equals("Q") && !C5.getHint().toString().equals("U")) {
                    C5.setHint("Q");
                    C5.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C6.getHint().toString().equals("Q") && !C6.getHint().toString().equals("U")) {
                    C6.setHint("Q");
                    C6.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C7.getHint().toString().equals("Q") && !C7.getHint().toString().equals("U")) {
                    C7.setHint("Q");
                    C7.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        C8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!C8.getHint().toString().equals("Q") && !C8.getHint().toString().equals("U")) {
                    C8.setHint("Q");
                    C8.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });


        //Button actions for D1-D8

        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D1.getHint().toString().equals("Q") && !D1.getHint().toString().equals("U")) {
                    D1.setHint("Q");
                    D1.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D2.getHint().toString().equals("Q") && !D2.getHint().toString().equals("U")) {
                    D2.setHint("Q");
                    D2.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D3.getHint().toString().equals("Q") && !D3.getHint().toString().equals("U")) {
                    D3.setHint("Q");
                    D3.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D4.getHint().toString().equals("Q") && !D4.getHint().toString().equals("U")) {
                    D4.setHint("Q");
                    D4.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D5.getHint().toString().equals("Q") && !D5.getHint().toString().equals("U")) {
                    D5.setHint("Q");
                    D5.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D6.getHint().toString().equals("Q") && !D6.getHint().toString().equals("U")) {
                    D6.setHint("Q");
                    D6.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        D7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D7.getHint().toString().equals("Q") && !D7.getHint().toString().equals("U")) {
                    D7.setHint("Q");
                    D7.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        D8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!D8.getHint().toString().equals("Q") && !D8.getHint().toString().equals("U")) {
                    D8.setHint("Q");
                    D8.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });


        //Button actions for E1-E8

        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E1.getHint().toString().equals("Q") && !E1.getHint().toString().equals("U")) {
                    E1.setHint("Q");
                    E1.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E2.getHint().toString().equals("Q") && !E2.getHint().toString().equals("U")) {
                    E2.setHint("Q");
                    E2.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E3.getHint().toString().equals("Q") && !E3.getHint().toString().equals("U")) {
                    E3.setHint("Q");
                    E3.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E4.getHint().toString().equals("Q") && !E4.getHint().toString().equals("U")) {
                    E4.setHint("Q");
                    E4.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E5.getHint().toString().equals("Q") && !E5.getHint().toString().equals("U")) {
                    E5.setHint("Q");
                    E5.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E6.getHint().toString().equals("Q") && !E6.getHint().toString().equals("U")) {
                    E6.setHint("Q");
                    E6.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E7.getHint().toString().equals("Q") && !E7.getHint().toString().equals("U")) {
                    E7.setHint("Q");
                    E7.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        E8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!E8.getHint().toString().equals("Q") && !E8.getHint().toString().equals("U")) {
                    E8.setHint("Q");
                    E8.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });


        //Button actions for F1-F8

        F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F1.getHint().toString().equals("Q") && !F1.getHint().toString().equals("U")) {
                    F1.setHint("Q");
                    F1.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F2.getHint().toString().equals("Q") && !F2.getHint().toString().equals("U")) {
                    F2.setHint("Q");
                    F2.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F3.getHint().toString().equals("Q") && !F3.getHint().toString().equals("U")) {
                    F3.setHint("Q");
                    F3.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        F4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F4.getHint().toString().equals("Q") && !F4.getHint().toString().equals("U")) {
                    F4.setHint("Q");
                    F4.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        F5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F5.getHint().toString().equals("Q") && !F5.getHint().toString().equals("U")) {
                    F5.setHint("Q");
                    F5.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        F6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F6.getHint().toString().equals("Q") && !F6.getHint().toString().equals("U")) {
                    F6.setHint("Q");
                    F6.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        F7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F7.getHint().toString().equals("Q") && !F7.getHint().toString().equals("U")) {
                    F7.setHint("Q");
                    F7.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        F8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!F8.getHint().toString().equals("Q") && !F8.getHint().toString().equals("U")) {
                    F8.setHint("Q");
                    F8.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });

        //Button actions for G1-G8

        G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G1.getHint().toString().equals("Q") && !G1.getHint().toString().equals("U")) {
                    G1.setHint("Q");
                    G1.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G2.getHint().toString().equals("Q") && !G2.getHint().toString().equals("U")) {
                    G2.setHint("Q");
                    G2.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        G3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G3.getHint().toString().equals("Q") && !G3.getHint().toString().equals("U")) {
                    G3.setHint("Q");
                    G3.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        G4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G4.getHint().toString().equals("Q") && !G4.getHint().toString().equals("U")) {
                    G4.setHint("Q");
                    G4.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        G5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G5.getHint().toString().equals("Q") && !G5.getHint().toString().equals("U")) {
                    G5.setHint("Q");
                    G5.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        G6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G6.getHint().toString().equals("Q") && !G6.getHint().toString().equals("U")) {
                    G6.setHint("Q");
                    G6.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        G7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G7.getHint().toString().equals("Q") && !G7.getHint().toString().equals("U")) {
                    G7.setHint("Q");
                    G7.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        G8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!G8.getHint().toString().equals("Q") && !G8.getHint().toString().equals("U")) {
                    G8.setHint("Q");
                    G8.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });

        //Button actions for H1-H8

        H1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H1.getHint().toString().equals("Q") && !H1.getHint().toString().equals("U")) {
                    H1.setHint("Q");
                    H1.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        H2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H2.getHint().toString().equals("Q") && !H2.getHint().toString().equals("U")) {
                    H2.setHint("Q");
                    H2.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        H3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H3.getHint().toString().equals("Q") && !H3.getHint().toString().equals("U")) {
                    H3.setHint("Q");
                    H3.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        H4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H4.getHint().toString().equals("Q") && !H4.getHint().toString().equals("U")) {
                    H4.setHint("Q");
                    H4.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        H5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H5.getHint().toString().equals("Q") && !H5.getHint().toString().equals("U")) {
                    H5.setHint("Q");
                    H5.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        H6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H6.getHint().toString().equals("Q") && !H6.getHint().toString().equals("U")) {
                    H6.setHint("Q");
                    H6.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });
        H7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H7.getHint().toString().equals("Q") && !H7.getHint().toString().equals("U")) {
                    H7.setHint("Q");
                    H7.setBackground(getResources().getDrawable(white_square_queen));
                    setUsed();
                }
            }
        });
        H8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!H8.getHint().toString().equals("Q") && !H8.getHint().toString().equals("U")) {
                    H8.setHint("Q");
                    H8.setBackground(getResources().getDrawable(black_square_queen));
                    setUsed();
                }
            }
        });


        //Reset board Button

        clearBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setButtons();
            }
        });


        //Random Solution output

        solutionBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputTV.setText(getBoard(playQueens(8),8));
            }
        });

    }

    private void setButtons(){
        A1 = (Button) findViewById(R.id.A1);
        A1.setTextColor(getResources().getColor(R.color.green));
        A1.setHint(" ");;
        A1.setBackgroundColor(getResources().getColor(background_dark));
        A2 = (Button) findViewById(R.id.A2);
        A2.setTextColor(getResources().getColor(R.color.green));
        A2.setHint(" ");;
        A2.setBackgroundColor(getResources().getColor(background_light));
        A3 = (Button) findViewById(R.id.A3);
        A3.setTextColor(getResources().getColor(R.color.green));
        A3.setHint(" ");;
        A3.setBackgroundColor(getResources().getColor(background_dark));
        A4 = (Button) findViewById(R.id.A4);
        A4.setTextColor(getResources().getColor(R.color.green));
        A4.setHint(" ");;
        A4.setBackgroundColor(getResources().getColor(background_light));
        A5 = (Button) findViewById(R.id.A5);
        A5.setTextColor(getResources().getColor(R.color.green));
        A5.setHint(" ");;
        A5.setBackgroundColor(getResources().getColor(background_dark));
        A6 = (Button) findViewById(R.id.A6);
        A6.setTextColor(getResources().getColor(R.color.green));
        A6.setHint(" ");;
        A6.setBackgroundColor(getResources().getColor(background_light));
        A7 = (Button) findViewById(R.id.A7);
        A7.setTextColor(getResources().getColor(R.color.green));
        A7.setHint(" ");;
        A7.setBackgroundColor(getResources().getColor(background_dark));
        A8 = (Button) findViewById(R.id.A8);
        A8.setTextColor(getResources().getColor(R.color.green));
        A8.setHint(" ");;
        A8.setBackgroundColor(getResources().getColor(background_light));

        B1 = (Button) findViewById(R.id.B1);
        B1.setTextColor(getResources().getColor(R.color.green));
        B1.setHint(" ");;
        B1.setBackgroundColor(getResources().getColor(background_light));
        B2 = (Button) findViewById(R.id.B2);
        B2.setTextColor(getResources().getColor(R.color.green));
        B2.setHint(" ");;
        B2.setBackgroundColor(getResources().getColor(background_dark));
        B3 = (Button) findViewById(R.id.B3);
        B3.setTextColor(getResources().getColor(R.color.green));
        B3.setHint(" ");;
        B3.setBackgroundColor(getResources().getColor(background_light));
        B4 = (Button) findViewById(R.id.B4);
        B4.setTextColor(getResources().getColor(R.color.green));
        B4.setHint(" ");;
        B4.setBackgroundColor(getResources().getColor(background_dark));
        B5 = (Button) findViewById(R.id.B5);
        B5.setTextColor(getResources().getColor(R.color.green));
        B5.setHint(" ");;
        B5.setBackgroundColor(getResources().getColor(background_light));
        B6 = (Button) findViewById(R.id.B6);
        B6.setTextColor(getResources().getColor(R.color.green));
        B6.setHint(" ");;
        B6.setBackgroundColor(getResources().getColor(background_dark));
        B7 = (Button) findViewById(R.id.B7);
        B7.setTextColor(getResources().getColor(R.color.green));
        B7.setHint(" ");;
        B7.setBackgroundColor(getResources().getColor(background_light));
        B8 = (Button) findViewById(R.id.B8);
        B8.setTextColor(getResources().getColor(R.color.green));
        B8.setHint(" ");;
        B8.setBackgroundColor(getResources().getColor(background_dark));

        C1 = (Button) findViewById(R.id.C1);
        C1.setTextColor(getResources().getColor(R.color.green));
        C1.setHint(" ");;
        C1.setBackgroundColor(getResources().getColor(background_dark));
        C2 = (Button) findViewById(R.id.C2);
        C2.setTextColor(getResources().getColor(R.color.green));
        C2.setHint(" ");;
        C2.setBackgroundColor(getResources().getColor(background_light));
        C3 = (Button) findViewById(R.id.C3);
        C3.setTextColor(getResources().getColor(R.color.green));
        C3.setHint(" ");;
        C3.setBackgroundColor(getResources().getColor(background_dark));
        C4 = (Button) findViewById(R.id.C4);
        C4.setTextColor(getResources().getColor(R.color.green));
        C4.setHint(" ");;
        C4.setBackgroundColor(getResources().getColor(background_light));
        C5 = (Button) findViewById(R.id.C5);
        C5.setTextColor(getResources().getColor(R.color.green));
        C5.setHint(" ");;
        C5.setBackgroundColor(getResources().getColor(background_dark));
        C6 = (Button) findViewById(R.id.C6);
        C6.setTextColor(getResources().getColor(R.color.green));
        C6.setHint(" ");;
        C6.setBackgroundColor(getResources().getColor(background_light));
        C7 = (Button) findViewById(R.id.C7);
        C7.setTextColor(getResources().getColor(R.color.green));
        C7.setHint(" ");;
        C7.setBackgroundColor(getResources().getColor(background_dark));
        C8 = (Button) findViewById(R.id.C8);
        C8.setTextColor(getResources().getColor(R.color.green));
        C8.setHint(" ");;
        C8.setBackgroundColor(getResources().getColor(background_light));

        D1 = (Button) findViewById(R.id.D1);
        D1.setTextColor(getResources().getColor(R.color.green));
        D1.setHint(" ");;
        D1.setBackgroundColor(getResources().getColor(background_light));
        D2 = (Button) findViewById(R.id.D2);
        D2.setTextColor(getResources().getColor(R.color.green));
        D2.setHint(" ");;
        D2.setBackgroundColor(getResources().getColor(background_dark));
        D3 = (Button) findViewById(R.id.D3);
        D3.setTextColor(getResources().getColor(R.color.green));
        D3.setHint(" ");;
        D3.setBackgroundColor(getResources().getColor(background_light));
        D4 = (Button) findViewById(R.id.D4);
        D4.setTextColor(getResources().getColor(R.color.green));
        D4.setHint(" ");;
        D4.setBackgroundColor(getResources().getColor(background_dark));
        D5 = (Button) findViewById(R.id.D5);
        D5.setTextColor(getResources().getColor(R.color.green));
        D5.setHint(" ");;
        D5.setBackgroundColor(getResources().getColor(background_light));
        D6 = (Button) findViewById(R.id.D6);
        D6.setTextColor(getResources().getColor(R.color.green));
        D6.setHint(" ");;
        D6.setBackgroundColor(getResources().getColor(background_dark));
        D7 = (Button) findViewById(R.id.D7);
        D7.setTextColor(getResources().getColor(R.color.green));
        D7.setHint(" ");;
        D7.setBackgroundColor(getResources().getColor(background_light));
        D8 = (Button) findViewById(R.id.D8);
        D8.setTextColor(getResources().getColor(R.color.green));
        D8.setHint(" ");;
        D8.setBackgroundColor(getResources().getColor(background_dark));

        E1 = (Button) findViewById(R.id.E1);
        E1.setTextColor(getResources().getColor(R.color.green));
        E1.setHint(" ");;
        E1.setBackgroundColor(getResources().getColor(background_dark));
        E2 = (Button) findViewById(R.id.E2);
        E2.setTextColor(getResources().getColor(R.color.green));
        E2.setHint(" ");;
        E2.setBackgroundColor(getResources().getColor(background_light));
        E3 = (Button) findViewById(R.id.E3);
        E3.setTextColor(getResources().getColor(R.color.green));
        E3.setHint(" ");;
        E3.setBackgroundColor(getResources().getColor(background_dark));
        E4 = (Button) findViewById(R.id.E4);
        E4.setTextColor(getResources().getColor(R.color.green));
        E4.setHint(" ");;
        E4.setBackgroundColor(getResources().getColor(background_light));
        E5 = (Button) findViewById(R.id.E5);
        E5.setTextColor(getResources().getColor(R.color.green));
        E5.setHint(" ");;
        E5.setBackgroundColor(getResources().getColor(background_dark));
        E6 = (Button) findViewById(R.id.E6);
        E6.setTextColor(getResources().getColor(R.color.green));
        E6.setHint(" ");;
        E6.setBackgroundColor(getResources().getColor(background_light));
        E7 = (Button) findViewById(R.id.E7);
        E7.setTextColor(getResources().getColor(R.color.green));
        E7.setHint(" ");;
        E7.setBackgroundColor(getResources().getColor(background_dark));
        E8 = (Button) findViewById(R.id.E8);
        E8.setTextColor(getResources().getColor(R.color.green));
        E8.setHint(" ");;
        E8.setBackgroundColor(getResources().getColor(background_light));

        F1 = (Button) findViewById(R.id.F1);
        F1.setTextColor(getResources().getColor(R.color.green));
        F1.setHint(" ");;
        F1.setBackgroundColor(getResources().getColor(background_light));
        F2 = (Button) findViewById(R.id.F2);
        F2.setTextColor(getResources().getColor(R.color.green));
        F2.setHint(" ");;
        F2.setBackgroundColor(getResources().getColor(background_dark));
        F3 = (Button) findViewById(R.id.F3);
        F3.setTextColor(getResources().getColor(R.color.green));
        F3.setHint(" ");;
        F3.setBackgroundColor(getResources().getColor(background_light));
        F4 = (Button) findViewById(R.id.F4);
        F4.setTextColor(getResources().getColor(R.color.green));
        F4.setHint(" ");;
        F4.setBackgroundColor(getResources().getColor(background_dark));
        F5 = (Button) findViewById(R.id.F5);
        F5.setTextColor(getResources().getColor(R.color.green));
        F5.setHint(" ");;
        F5.setBackgroundColor(getResources().getColor(background_light));
        F6 = (Button) findViewById(R.id.F6);
        F6.setTextColor(getResources().getColor(R.color.green));
        F6.setHint(" ");;
        F6.setBackgroundColor(getResources().getColor(background_dark));
        F7 = (Button) findViewById(R.id.F7);
        F7.setTextColor(getResources().getColor(R.color.green));
        F7.setHint(" ");;
        F7.setBackgroundColor(getResources().getColor(background_light));
        F8 = (Button) findViewById(R.id.F8);
        F8.setTextColor(getResources().getColor(R.color.green));
        F8.setHint(" ");;
        F8.setBackgroundColor(getResources().getColor(background_dark));

        G1 = (Button) findViewById(R.id.G1);
        G1.setTextColor(getResources().getColor(R.color.green));
        G1.setHint(" ");;
        G1.setBackgroundColor(getResources().getColor(background_dark));
        G2 = (Button) findViewById(R.id.G2);
        G2.setTextColor(getResources().getColor(R.color.green));
        G2.setHint(" ");;
        G2.setBackgroundColor(getResources().getColor(background_light));
        G3 = (Button) findViewById(R.id.G3);
        G3.setTextColor(getResources().getColor(R.color.green));
        G3.setHint(" ");;
        G3.setBackgroundColor(getResources().getColor(background_dark));
        G4 = (Button) findViewById(R.id.G4);
        G4.setTextColor(getResources().getColor(R.color.green));
        G4.setHint(" ");;
        G4.setBackgroundColor(getResources().getColor(background_light));
        G5 = (Button) findViewById(R.id.G5);
        G5.setTextColor(getResources().getColor(R.color.green));
        G5.setHint(" ");;
        G5.setBackgroundColor(getResources().getColor(background_dark));
        G6 = (Button) findViewById(R.id.G6);
        G6.setTextColor(getResources().getColor(R.color.green));
        G6.setHint(" ");;
        G6.setBackgroundColor(getResources().getColor(background_light));
        G7 = (Button) findViewById(R.id.G7);
        G7.setTextColor(getResources().getColor(R.color.green));
        G7.setHint(" ");;
        G7.setBackgroundColor(getResources().getColor(background_dark));
        G8 = (Button) findViewById(R.id.G8);
        G8.setTextColor(getResources().getColor(R.color.green));
        G8.setHint(" ");;
        G8.setBackgroundColor(getResources().getColor(background_light));

        H1 = (Button) findViewById(R.id.H1);
        H1.setTextColor(getResources().getColor(R.color.green));
        H1.setHint(" ");;
        H1.setBackgroundColor(getResources().getColor(background_light));
        H2 = (Button) findViewById(R.id.H2);
        H2.setTextColor(getResources().getColor(R.color.green));
        H2.setHint(" ");;
        H2.setBackgroundColor(getResources().getColor(background_dark));
        H3 = (Button) findViewById(R.id.H3);
        H3.setTextColor(getResources().getColor(R.color.green));
        H3.setHint(" ");;
        H3.setBackgroundColor(getResources().getColor(background_light));
        H4 = (Button) findViewById(R.id.H4);
        H4.setTextColor(getResources().getColor(R.color.green));
        H4.setHint(" ");;
        H4.setBackgroundColor(getResources().getColor(background_dark));
        H5 = (Button) findViewById(R.id.H5);
        H5.setTextColor(getResources().getColor(R.color.green));
        H5.setHint(" ");;
        H5.setBackgroundColor(getResources().getColor(background_light));
        H6 = (Button) findViewById(R.id.H6);
        H6.setTextColor(getResources().getColor(R.color.green));
        H6.setHint(" ");;
        H6.setBackgroundColor(getResources().getColor(background_dark));
        H7 = (Button) findViewById(R.id.H7);
        H7.setTextColor(getResources().getColor(R.color.green));
        H7.setHint(" ");;
        H7.setBackgroundColor(getResources().getColor(background_light));
        H8 = (Button) findViewById(R.id.H8);
        H8.setTextColor(getResources().getColor(R.color.green));
        H8.setHint(" ");;
        H8.setBackgroundColor(getResources().getColor(background_dark));
    }

    private void setUsed(){
        String[][] currentBoard = new String[8][8];
        String[][] usedBoard = new String[8][8];

            //Gets column A
            currentBoard[0][0] = A8.getHint().toString();
            currentBoard[1][0] = A7.getHint().toString();
            currentBoard[2][0] = A6.getHint().toString();
            currentBoard[3][0] = A5.getHint().toString();
            currentBoard[4][0] = A4.getHint().toString();
            currentBoard[5][0] = A3.getHint().toString();
            currentBoard[6][0] = A2.getHint().toString();
            currentBoard[7][0] = A1.getHint().toString();

            //Gets column B
            currentBoard[0][1] = B8.getHint().toString();
            currentBoard[1][1] = B7.getHint().toString();
            currentBoard[2][1] = B6.getHint().toString();
            currentBoard[3][1] = B5.getHint().toString();
            currentBoard[4][1] = B4.getHint().toString();
            currentBoard[5][1] = B3.getHint().toString();
            currentBoard[6][1] = B2.getHint().toString();
            currentBoard[7][1] = B1.getHint().toString();

            //Gets column C
            currentBoard[0][2] = C8.getHint().toString();
            currentBoard[1][2] = C7.getHint().toString();
            currentBoard[2][2] = C6.getHint().toString();
            currentBoard[3][2] = C5.getHint().toString();
            currentBoard[4][2] = C4.getHint().toString();
            currentBoard[5][2] = C3.getHint().toString();
            currentBoard[6][2] = C2.getHint().toString();
            currentBoard[7][2] = C1.getHint().toString();

            //Gets column D
            currentBoard[0][3] = D8.getHint().toString();
            currentBoard[1][3] = D7.getHint().toString();
            currentBoard[2][3] = D6.getHint().toString();
            currentBoard[3][3] = D5.getHint().toString();
            currentBoard[4][3] = D4.getHint().toString();
            currentBoard[5][3] = D3.getHint().toString();
            currentBoard[6][3] = D2.getHint().toString();
            currentBoard[7][3] = D1.getHint().toString();

            //Gets column E
            currentBoard[0][4] = E8.getHint().toString();
            currentBoard[1][4] = E7.getHint().toString();
            currentBoard[2][4] = E6.getHint().toString();
            currentBoard[3][4] = E5.getHint().toString();
            currentBoard[4][4] = E4.getHint().toString();
            currentBoard[5][4] = E3.getHint().toString();
            currentBoard[6][4] = E2.getHint().toString();
            currentBoard[7][4] = E1.getHint().toString();

            //Gets column F
            currentBoard[0][5] = F8.getHint().toString();
            currentBoard[1][5] = F7.getHint().toString();
            currentBoard[2][5] = F6.getHint().toString();
            currentBoard[3][5] = F5.getHint().toString();
            currentBoard[4][5] = F4.getHint().toString();
            currentBoard[5][5] = F3.getHint().toString();
            currentBoard[6][5] = F2.getHint().toString();
            currentBoard[7][5] = F1.getHint().toString();

            //Gets column G
            currentBoard[0][6] = G8.getHint().toString();
            currentBoard[1][6] = G7.getHint().toString();
            currentBoard[2][6] = G6.getHint().toString();
            currentBoard[3][6] = G5.getHint().toString();
            currentBoard[4][6] = G4.getHint().toString();
            currentBoard[5][6] = G3.getHint().toString();
            currentBoard[6][6] = G2.getHint().toString();
            currentBoard[7][6] = G1.getHint().toString();

            //Gets column H
            currentBoard[0][7] = H8.getHint().toString();
            currentBoard[1][7] = H7.getHint().toString();
            currentBoard[2][7] = H6.getHint().toString();
            currentBoard[3][7] = H5.getHint().toString();
            currentBoard[4][7] = H4.getHint().toString();
            currentBoard[5][7] = H3.getHint().toString();
            currentBoard[6][7] = H2.getHint().toString();
            currentBoard[7][7] = H1.getHint().toString();


            usedBoard = setUsed(currentBoard);

            for (int i = 0; i < 8; i++) {
                for (int x = 0; x < 8; x++) {
                    if (usedBoard[i][x].equals("U")) {
                        switch (i) {
                            //Sets Row 8
                            case 0:
                                switch (x) {
                                    //Sets A8
                                    case 0:
                                        A8.setBackground(getResources().getDrawable(white_square_used));
                                        A8.setHint("U");
                                        break;

                                    //Sets B8
                                    case 1:
                                        B8.setBackground(getResources().getDrawable(black_square_used));
                                        B8.setHint("U");
                                        break;

                                    //Sets C8
                                    case 2:
                                        C8.setBackground(getResources().getDrawable(white_square_used));
                                        C8.setHint("U");
                                        break;

                                    //Sets D8
                                    case 3:
                                        D8.setBackground(getResources().getDrawable(black_square_used));
                                        D8.setHint("U");
                                        break;

                                    //Sets E8
                                    case 4:
                                        E8.setBackground(getResources().getDrawable(white_square_used));
                                        E8.setHint("U");
                                        break;

                                    //Sets F8
                                    case 5:
                                        F8.setBackground(getResources().getDrawable(black_square_used));
                                        F8.setHint("U");
                                        break;

                                    //Sets G8
                                    case 6:
                                        G8.setBackground(getResources().getDrawable(white_square_used));
                                        G8.setHint("U");
                                        break;

                                    //Sets H8
                                    case 7:
                                        H8.setBackground(getResources().getDrawable(black_square_used));
                                        H8.setHint("U");
                                        break;
                                }
                                break;

                            //Sets Row 7
                            case 1:
                                switch (x) {
                                    //Sets A7
                                    case 0:
                                        A7.setBackground(getResources().getDrawable(black_square_used));
                                        A7.setHint("U");
                                        break;

                                    //Sets B7
                                    case 1:
                                        B7.setBackground(getResources().getDrawable(white_square_used));
                                        B7.setHint("U");
                                        break;

                                    //Sets C7
                                    case 2:
                                        C7.setBackground(getResources().getDrawable(black_square_used));
                                        C7.setHint("U");
                                        break;

                                    //Sets D7
                                    case 3:
                                        D7.setBackground(getResources().getDrawable(white_square_used));
                                        D7.setHint("U");
                                        break;

                                    //Sets E7
                                    case 4:
                                        E7.setBackground(getResources().getDrawable(black_square_used));
                                        E7.setHint("U");
                                        break;

                                    //Sets F7
                                    case 5:
                                        F7.setBackground(getResources().getDrawable(white_square_used));
                                        F7.setHint("U");
                                        break;

                                    //Sets G7
                                    case 6:
                                        G7.setBackground(getResources().getDrawable(black_square_used));
                                        G7.setHint("U");
                                        break;

                                    //Sets H7
                                    case 7:
                                        H7.setBackground(getResources().getDrawable(white_square_used));
                                        H7.setHint("U");
                                        break;
                                }
                                break;

                            //Sets Row 6
                            case 2:
                                switch (x) {
                                    //Sets A6
                                    case 0:
                                        A6.setBackground(getResources().getDrawable(white_square_used));
                                        A6.setHint("U");
                                        break;

                                    //Sets B6
                                    case 1:
                                        B6.setBackground(getResources().getDrawable(black_square_used));
                                        B6.setHint("U");
                                        break;

                                    //Sets C6
                                    case 2:
                                        C6.setBackground(getResources().getDrawable(white_square_used));
                                        C6.setHint("U");
                                        break;

                                    //Sets D6
                                    case 3:
                                        D6.setBackground(getResources().getDrawable(black_square_used));
                                        D6.setHint("U");
                                        break;

                                    //Sets E6
                                    case 4:
                                        E6.setBackground(getResources().getDrawable(white_square_used));
                                        E6.setHint("U");
                                        break;

                                    //Sets F6
                                    case 5:
                                        F6.setBackground(getResources().getDrawable(black_square_used));
                                        F6.setHint("U");
                                        break;

                                    //Sets G6
                                    case 6:
                                        G6.setBackground(getResources().getDrawable(white_square_used));
                                        G6.setHint("U");
                                        break;

                                    //Sets H6
                                    case 7:
                                        H6.setBackground(getResources().getDrawable(black_square_used));
                                        H6.setHint("U");
                                        break;
                                }
                                break;

                            //Sets Row 5
                            case 3:
                                switch (x) {
                                    //Sets A5
                                    case 0:
                                        A5.setBackground(getResources().getDrawable(black_square_used));
                                        A5.setHint("U");
                                        break;

                                    //Sets B5
                                    case 1:
                                        B5.setBackground(getResources().getDrawable(white_square_used));
                                        B5.setHint("U");
                                        break;

                                    //Sets C5
                                    case 2:
                                        C5.setBackground(getResources().getDrawable(black_square_used));
                                        C5.setHint("U");
                                        break;

                                    //Sets D5
                                    case 3:
                                        D5.setBackground(getResources().getDrawable(white_square_used));
                                        D5.setHint("U");
                                        break;

                                    //Sets E5
                                    case 4:
                                        E5.setBackground(getResources().getDrawable(black_square_used));
                                        E5.setHint("U");
                                        break;

                                    //Sets F5
                                    case 5:
                                        F5.setBackground(getResources().getDrawable(white_square_used));
                                        F5.setHint("U");
                                        break;

                                    //Sets G5
                                    case 6:
                                        G5.setBackground(getResources().getDrawable(black_square_used));
                                        G5.setHint("U");
                                        break;

                                    //Sets H5
                                    case 7:
                                        H5.setBackground(getResources().getDrawable(white_square_used));
                                        H5.setHint("U");
                                        break;
                                }
                                break;

                            //Sets Row 4
                            case 4:
                                switch (x) {
                                    //Sets A4
                                    case 0:
                                        A4.setBackground(getResources().getDrawable(white_square_used));
                                        A4.setHint("U");
                                        break;

                                    //Sets B4
                                    case 1:
                                        B4.setBackground(getResources().getDrawable(black_square_used));
                                        B4.setHint("U");
                                        break;

                                    //Sets C4
                                    case 2:
                                        C4.setBackground(getResources().getDrawable(white_square_used));
                                        C4.setHint("U");
                                        break;

                                    //Sets D4
                                    case 3:
                                        D4.setBackground(getResources().getDrawable(black_square_used));
                                        D4.setHint("U");
                                        break;

                                    //Sets E4
                                    case 4:
                                        E4.setBackground(getResources().getDrawable(white_square_used));
                                        E4.setHint("U");
                                        break;

                                    //Sets F4
                                    case 5:
                                        F4.setBackground(getResources().getDrawable(black_square_used));
                                        F4.setHint("U");
                                        break;

                                    //Sets G4
                                    case 6:
                                        G4.setBackground(getResources().getDrawable(white_square_used));
                                        G4.setHint("U");
                                        break;

                                    //Sets H4
                                    case 7:
                                        H4.setBackground(getResources().getDrawable(black_square_used));
                                        H4.setHint("U");
                                        break;
                                }
                                break;

                            //Sets Row 3
                            case 5:
                                switch (x) {
                                    //Sets A3
                                    case 0:
                                        A3.setBackground(getResources().getDrawable(black_square_used));
                                        A3.setHint("U");
                                        break;

                                    //Sets B3
                                    case 1:
                                        B3.setBackground(getResources().getDrawable(white_square_used));
                                        B3.setHint("U");
                                        break;

                                    //Sets C3
                                    case 2:
                                        C3.setBackground(getResources().getDrawable(black_square_used));
                                        C3.setHint("U");
                                        break;

                                    //Sets D3
                                    case 3:
                                        D3.setBackground(getResources().getDrawable(white_square_used));
                                        D3.setHint("U");
                                        break;

                                    //Sets E3
                                    case 4:
                                        E3.setBackground(getResources().getDrawable(black_square_used));
                                        E3.setHint("U");
                                        break;

                                    //Sets F3
                                    case 5:
                                        F3.setBackground(getResources().getDrawable(white_square_used));
                                        F3.setHint("U");
                                        break;

                                    //Sets G3
                                    case 6:
                                        G3.setBackground(getResources().getDrawable(black_square_used));
                                        G3.setHint("U");
                                        break;

                                    //Sets H3
                                    case 7:
                                        H3.setBackground(getResources().getDrawable(white_square_used));
                                        H3.setHint("U");
                                        break;
                                }
                                break;

                            //Sets Row 2
                            case 6:
                                switch (x) {
                                    //Sets A2
                                    case 0:
                                        A2.setBackground(getResources().getDrawable(white_square_used));
                                        A2.setHint("U");
                                        break;

                                    //Sets B2
                                    case 1:
                                        B2.setBackground(getResources().getDrawable(black_square_used));
                                        B2.setHint("U");
                                        break;

                                    //Sets C2
                                    case 2:
                                        C2.setBackground(getResources().getDrawable(white_square_used));
                                        C2.setHint("U");
                                        break;

                                    //Sets D2
                                    case 3:
                                        D2.setBackground(getResources().getDrawable(black_square_used));
                                        D2.setHint("U");
                                        break;

                                    //Sets E2
                                    case 4:
                                        E2.setBackground(getResources().getDrawable(white_square_used));
                                        E2.setHint("U");
                                        break;

                                    //Sets F2
                                    case 5:
                                        F2.setBackground(getResources().getDrawable(black_square_used));
                                        F2.setHint("U");
                                        break;

                                    //Sets G2
                                    case 6:
                                        G2.setBackground(getResources().getDrawable(white_square_used));
                                        G2.setHint("U");
                                        break;

                                    //Sets H2
                                    case 7:
                                        H2.setBackground(getResources().getDrawable(black_square_used));
                                        H2.setHint("U");
                                        break;
                                }
                                break;

                            //Sets Row 1
                            case 7:
                                switch (x) {
                                    //Sets A1
                                    case 0:
                                        A1.setBackground(getResources().getDrawable(black_square_used));
                                        A1.setHint("U");
                                        break;

                                    //Sets B1
                                    case 1:
                                        B1.setBackground(getResources().getDrawable(white_square_used));
                                        B1.setHint("U");
                                        break;

                                    //Sets C1
                                    case 2:
                                        C1.setBackground(getResources().getDrawable(black_square_used));
                                        C1.setHint("U");
                                        break;

                                    //Sets D1
                                    case 3:
                                        D1.setBackground(getResources().getDrawable(white_square_used));
                                        D1.setHint("U");
                                        break;

                                    //Sets E1
                                    case 4:
                                        E1.setBackground(getResources().getDrawable(black_square_used));
                                        E1.setHint("U");
                                        break;

                                    //Sets F1
                                    case 5:
                                        F1.setBackground(getResources().getDrawable(white_square_used));
                                        F1.setHint("U");
                                        break;

                                    //Sets G1
                                    case 6:
                                        G1.setBackground(getResources().getDrawable(black_square_used));
                                        G1.setHint("U");
                                        break;

                                    //Sets H1
                                    case 7:
                                        H1.setBackground(getResources().getDrawable(white_square_used));
                                        H1.setHint("U");
                                        break;
                                }

                                break;
                        }
                    }
                }
            }
    }

    private String[][] setUsed(String[][] board){
        String[][] currentBoard = board;
        String[][] output = new String[8][8];
        int row, column;
        boolean go;

        //Initializes output board
        for(int rowSetup=0; rowSetup<8; rowSetup++){
            for(int columnSetup=0; columnSetup<8; columnSetup++){
                output[rowSetup][columnSetup]=" ";
            }
        }

        for(int rowEdit=0; rowEdit<8; rowEdit++){
            for(int columnEdit=0; columnEdit<8; columnEdit++){
                //Checks if current square has a QUEEN
                if(currentBoard[rowEdit][columnEdit].equals("Q")){

                    //Marks all squares to the RIGHT of current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            row++;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares to the LEFT of the current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            row--;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares ABOVE the current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            column++;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares BELOW the current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            column--;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going RIGHT and ABOVE
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            row++;
                            column++;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going LEFT and BELOW
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            row--;
                            column--;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going RIGHT and BELOW
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            row++;
                            column--;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going LEFT and BELOW
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            row--;
                            column++;
                            output[row][column]="U";
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }
                }
            }
        }
        return output;
    }

    private String[][] playQueens(int boardSize){
        String[][] board;
        board = board(boardSize);
        String[][] used;
        boolean go = true;
        int square1 = (int) (Math.random()*boardSize);
        int square2 = (int) (Math.random()*boardSize);

        while(go){
            int checkUSED=0;
            int checkQUEENS=0;
            used = check(board, boardSize);
            int rand1 = (int) (Math.random()*boardSize);
            int rand2 = (int) (Math.random()*boardSize);

            if(used[square1][square2].equals("G ")){
                String.format(board[square1][square2]="Q ");
            }

            //Choose random board square
            //Places Queen if able
            if(used[rand1][rand2].equals("G ")) {
                String.format(board[rand1][rand2] ="Q ");
            }

            //Checks the amount of available spaces on board
            for(int i=0; i<boardSize; i++){
                for(int x=0; x<boardSize; x++){
                    if(used[i][x].equals("U ")){
                        checkUSED++;
                    }
                }
            }

            //Checks the amount of Queens on board
            for(int i=0; i<boardSize; i++){
                for(int x=0; x<boardSize; x++){
                    if(board[i][x].equals("Q ")){
                        checkQUEENS++;
                    }
                }
            }

            //Resets board if no available spaces
            //And there isn't 8 Queens
            if(checkUSED==(boardSize*boardSize)&&checkQUEENS!=boardSize){
                for(int i=0; i<boardSize; i++){
                    for(int x=0; x<boardSize; x++){
                        board[i][x]="B ";
                    }
                }
            }

            //Sees that there are 8 Queens
            //And stops loop
            if(checkQUEENS==boardSize){
                go=false;
            }
        }
        return board;
    }

    private static String[][] check(String[][] currentBoard, int boardSize){
        String[][] output = new String[boardSize][boardSize];
        int row, column;
        boolean go;

        //Initializes output board
        for(int rowSetup=0; rowSetup<boardSize; rowSetup++){
            for(int columnSetup=0; columnSetup<boardSize; columnSetup++){
                output[rowSetup][columnSetup]="G ";
            }
        }

        for(int rowEdit=0; rowEdit<boardSize; rowEdit++){
            for(int columnEdit=0; columnEdit<boardSize; columnEdit++){
                //Checks if current square has a QUEEN
                if(currentBoard[rowEdit][columnEdit].equals("Q ")){

                    //Marks all squares to the RIGHT of current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            row++;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares to the LEFT of the current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            row--;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares ABOVE the current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            column++;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares BELOW the current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            column--;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going RIGHT and ABOVE
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            row++;
                            column++;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going LEFT and BELOW
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            row--;
                            column--;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going RIGHT and BELOW
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            row++;
                            column--;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }

                    //Marks all squares in a diagonal going LEFT and BELOW
                    //current QUEEN as USED
                    go=true;
                    row=rowEdit; column=columnEdit;
                    while(go){
                        try{
                            output[row][column]="U ";
                            row--;
                            column++;
                        }catch (ArrayIndexOutOfBoundsException exc){go=false;}
                    }
                }
            }
        }
        return output;
    }

    private static String[][] board(int boardSize){
        String[][] c = new String[boardSize][boardSize];
        for(int i=0; i<boardSize; i++){
            for(int x=0; x<boardSize; x++){
                c[i][x]="B ";
            }
        }
        return c;
    }

    private static String getBoard(String[][] board, int boardSize){
        StringBuilder output = new StringBuilder("");
        for(int i=0; i<boardSize; i++){
            for(int x=0; x<boardSize; x++){
                output.append(board[i][x]);
            }
            output.append("\n");
        }
        return output.toString();
    }
}
