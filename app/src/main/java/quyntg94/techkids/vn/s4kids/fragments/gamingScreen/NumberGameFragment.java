package quyntg94.techkids.vn.s4kids.fragments.gamingScreen;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.applications.KidApplication;
import quyntg94.techkids.vn.s4kids.databases.ColorGameDatabases;
import quyntg94.techkids.vn.s4kids.events.EventTime;
import quyntg94.techkids.vn.s4kids.fragments.resultsScreen.NumberResultFragment;
import quyntg94.techkids.vn.s4kids.models.ColorGame;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumberGameFragment extends Fragment {

    private ColorGameDatabases colorGameDatabases = KidApplication.getInstance().getColorGameDatabases();
    private List<ColorGame> colorGameList = colorGameDatabases.loadAllColorGame();

    private Chronometer chrNumberTime;
    private RelativeLayout rlAnswerNumber1;
    private RelativeLayout rlAnswerNumber2;
    private RelativeLayout rlAnswerNumber3;
    private RelativeLayout rlAnswerNumber4;
    private RelativeLayout rlAnswerNumber5;
    private RelativeLayout rlAnswerNumber6;
    private RelativeLayout rlAnswerNumber7;
    private RelativeLayout rlAnswerNumber8;
    private RelativeLayout rlAnswerNumber9;
    private RelativeLayout rlAnswerNumber10;
    private TextView tvAnswerNumber1;
    private TextView tvAnswerNumber2;
    private TextView tvAnswerNumber3;
    private TextView tvAnswerNumber4;
    private TextView tvAnswerNumber5;
    private TextView tvAnswerNumber6;
    private TextView tvAnswerNumber7;
    private TextView tvAnswerNumber8;
    private TextView tvAnswerNumber9;
    private TextView tvAnswerNumber10;
    private ImageView ivAnswerNumber1;
    private ImageView ivAnswerNumber2;
    private ImageView ivAnswerNumber3;
    private ImageView ivAnswerNumber4;
    private ImageView ivAnswerNumber5;
    private ImageView ivAnswerNumber6;
    private ImageView ivAnswerNumber7;
    private ImageView ivAnswerNumber8;
    private ImageView ivAnswerNumber9;
    private ImageView ivAnswerNumber10;

    private TextView tvNumberNumber;
    private Button btnSubmit;

    public int resultt;
    public int subRoll;
    private int choice = 1;
    private int number = 0;
    Random rand = new Random();
    private List<TextView> tvNumberGames;
    private List<RelativeLayout> rlNumberGames;
    private List<ImageView> ivNumberGames;

    public NumberGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number_game, container, false);
        setupUI(view);
        return view;
    }

    private void setupUI(View view) {
        chrNumberTime = (Chronometer) view.findViewById(R.id.chr_time_number);

        tvNumberGames = new ArrayList<>();
        rlNumberGames = new ArrayList<>();
        ivNumberGames = new ArrayList<>();

        rlAnswerNumber1 = (RelativeLayout) view.findViewById(R.id.rl_number_1);
        rlAnswerNumber2 = (RelativeLayout) view.findViewById(R.id.rl_number_2);
        rlAnswerNumber3 = (RelativeLayout) view.findViewById(R.id.rl_number_3);
        rlAnswerNumber4 = (RelativeLayout) view.findViewById(R.id.rl_number_4);
        rlAnswerNumber5 = (RelativeLayout) view.findViewById(R.id.rl_number_5);
        rlAnswerNumber6 = (RelativeLayout) view.findViewById(R.id.rl_number_6);
        rlAnswerNumber7 = (RelativeLayout) view.findViewById(R.id.rl_number_7);
        rlAnswerNumber8 = (RelativeLayout) view.findViewById(R.id.rl_number_8);
        rlAnswerNumber9 = (RelativeLayout) view.findViewById(R.id.rl_number_9);
        rlAnswerNumber10 = (RelativeLayout) view.findViewById(R.id.rl_number_10);

        rlNumberGames.add(rlAnswerNumber1);
        rlNumberGames.add(rlAnswerNumber2);
        rlNumberGames.add(rlAnswerNumber3);
        rlNumberGames.add(rlAnswerNumber4);
        rlNumberGames.add(rlAnswerNumber5);
        rlNumberGames.add(rlAnswerNumber6);
        rlNumberGames.add(rlAnswerNumber7);
        rlNumberGames.add(rlAnswerNumber8);
        rlNumberGames.add(rlAnswerNumber9);
        rlNumberGames.add(rlAnswerNumber10);

        tvAnswerNumber1 = (TextView) view.findViewById(R.id.tv_answer_number_1);
        tvAnswerNumber2 = (TextView) view.findViewById(R.id.tv_answer_number_2);
        tvAnswerNumber3 = (TextView) view.findViewById(R.id.tv_answer_number_3);
        tvAnswerNumber4 = (TextView) view.findViewById(R.id.tv_answer_number_4);
        tvAnswerNumber5 = (TextView) view.findViewById(R.id.tv_answer_number_5);
        tvAnswerNumber6 = (TextView) view.findViewById(R.id.tv_answer_number_6);
        tvAnswerNumber7 = (TextView) view.findViewById(R.id.tv_answer_number_7);
        tvAnswerNumber8 = (TextView) view.findViewById(R.id.tv_answer_number_8);
        tvAnswerNumber9 = (TextView) view.findViewById(R.id.tv_answer_number_9);
        tvAnswerNumber10 = (TextView) view.findViewById(R.id.tv_answer_number_10);

        tvNumberGames.add(tvAnswerNumber1);
        tvNumberGames.add(tvAnswerNumber2);
        tvNumberGames.add(tvAnswerNumber3);
        tvNumberGames.add(tvAnswerNumber4);
        tvNumberGames.add(tvAnswerNumber5);
        tvNumberGames.add(tvAnswerNumber6);
        tvNumberGames.add(tvAnswerNumber7);
        tvNumberGames.add(tvAnswerNumber8);
        tvNumberGames.add(tvAnswerNumber9);
        tvNumberGames.add(tvAnswerNumber10);

        ivAnswerNumber1 = (ImageView) view.findViewById(R.id.iv_number_game_1);
        ivAnswerNumber2 = (ImageView) view.findViewById(R.id.iv_number_game_2);
        ivAnswerNumber3 = (ImageView) view.findViewById(R.id.iv_number_game_3);
        ivAnswerNumber4 = (ImageView) view.findViewById(R.id.iv_number_game_4);
        ivAnswerNumber5 = (ImageView) view.findViewById(R.id.iv_number_game_5);
        ivAnswerNumber6 = (ImageView) view.findViewById(R.id.iv_number_game_6);
        ivAnswerNumber7 = (ImageView) view.findViewById(R.id.iv_number_game_7);
        ivAnswerNumber8 = (ImageView) view.findViewById(R.id.iv_number_game_8);
        ivAnswerNumber9 = (ImageView) view.findViewById(R.id.iv_number_game_9);
        ivAnswerNumber10 = (ImageView) view.findViewById(R.id.iv_number_game_10);

        ivNumberGames.add(ivAnswerNumber1);
        ivNumberGames.add(ivAnswerNumber2);
        ivNumberGames.add(ivAnswerNumber3);
        ivNumberGames.add(ivAnswerNumber4);
        ivNumberGames.add(ivAnswerNumber5);
        ivNumberGames.add(ivAnswerNumber6);
        ivNumberGames.add(ivAnswerNumber7);
        ivNumberGames.add(ivAnswerNumber8);
        ivNumberGames.add(ivAnswerNumber9);
        ivNumberGames.add(ivAnswerNumber10);

        tvNumberNumber = (TextView) view.findViewById(R.id.tv_number_game_number);
        btnSubmit = (Button) view.findViewById(R.id.btn_sumbit);

        setupImage();
    }

    private void setupImage() {
        for(ImageView imageView : ivNumberGames){
            imageView.setVisibility(View.INVISIBLE);
        }
        chooseImage();
        chrNumberTime.start();
        number++;
        tvNumberNumber.setText("Câu " + number);
        int roll = rand.nextInt(10) + 1;
        subRoll = roll;
        Log.d("gg", String.valueOf(roll));
        switch (roll) {
            case 1:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                break;
            case 2:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                break;
            case 3:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                break;
            case 4:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                ivAnswerNumber4.setVisibility(View.VISIBLE);
                break;
            case 5:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                ivAnswerNumber4.setVisibility(View.VISIBLE);
                ivAnswerNumber5.setVisibility(View.VISIBLE);
                break;
            case 6:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                ivAnswerNumber4.setVisibility(View.VISIBLE);
                ivAnswerNumber5.setVisibility(View.VISIBLE);
                ivAnswerNumber6.setVisibility(View.VISIBLE);
                break;
            case 7:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                ivAnswerNumber4.setVisibility(View.VISIBLE);
                ivAnswerNumber5.setVisibility(View.VISIBLE);
                ivAnswerNumber6.setVisibility(View.VISIBLE);
                ivAnswerNumber7.setVisibility(View.VISIBLE);
                break;
            case 8:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                ivAnswerNumber4.setVisibility(View.VISIBLE);
                ivAnswerNumber5.setVisibility(View.VISIBLE);
                ivAnswerNumber6.setVisibility(View.VISIBLE);
                ivAnswerNumber7.setVisibility(View.VISIBLE);
                ivAnswerNumber8.setVisibility(View.VISIBLE);
                break;
            case 9:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                ivAnswerNumber4.setVisibility(View.VISIBLE);
                ivAnswerNumber5.setVisibility(View.VISIBLE);
                ivAnswerNumber6.setVisibility(View.VISIBLE);
                ivAnswerNumber7.setVisibility(View.VISIBLE);
                ivAnswerNumber8.setVisibility(View.VISIBLE);
                ivAnswerNumber9.setVisibility(View.VISIBLE);
                break;
            case 10:
                ivAnswerNumber1.setVisibility(View.VISIBLE);
                ivAnswerNumber2.setVisibility(View.VISIBLE);
                ivAnswerNumber3.setVisibility(View.VISIBLE);
                ivAnswerNumber4.setVisibility(View.VISIBLE);
                ivAnswerNumber5.setVisibility(View.VISIBLE);
                ivAnswerNumber6.setVisibility(View.VISIBLE);
                ivAnswerNumber7.setVisibility(View.VISIBLE);
                ivAnswerNumber8.setVisibility(View.VISIBLE);
                ivAnswerNumber9.setVisibility(View.VISIBLE);
                ivAnswerNumber10.setVisibility(View.VISIBLE);
                break;
            default:
        }
        setOnClickListenres();

    }

    private void setOnClickListenres() {
        rlAnswerNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber1);
                resultt = 1;
                choice--;
            }
        });
        rlAnswerNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber2);
                resultt = 2;
                choice--;
            }
        });
        rlAnswerNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber3);
                resultt = 3;
                choice--;
            }
        });
        rlAnswerNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber4);
                resultt = 4;
                choice--;
            }
        });
        rlAnswerNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber5);
                resultt = 5;
                choice--;
            }
        });
        rlAnswerNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber6);
                resultt = 6;
                choice--;
            }
        });
        rlAnswerNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber7);
                resultt = 7;
                choice--;
            }
        });
        rlAnswerNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber8);
                resultt = 8;
                choice--;
            }
        });
        rlAnswerNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber9);
                resultt = 9;
                choice--;
            }
        });
        rlAnswerNumber10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseNumber(rlAnswerNumber10);
                resultt = 10;
                choice--;
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit(subRoll);
                nextQuestion();

            }
        });
    }

    public void chooseNumber(RelativeLayout relativeLayout){
        if(choice == 1){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
        } else if (choice == 0){
            for(RelativeLayout rl : rlNumberGames){
                rl.setBackgroundColor(getResources().getColor(R.color.white));
            }
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
            choice++;
        }
    }

    public void chooseImage(){
        int random= rand.nextInt(10) + 1;
        for(ImageView imageView : ivNumberGames){
            switch(random){
                case 1:
                    imageView.setImageResource(R.drawable.pikachu);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.bulbasaur);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.charmander);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.squirtle);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.raikou);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.entei);
                    break;
                case 7:
                    imageView.setImageResource(R.drawable.suicune);
                    break;
                case 8:
                    imageView.setImageResource(R.drawable.chikorita);
                    break;
                case 9:
                    imageView.setImageResource(R.drawable.totodile);
                    break;
                case 10:
                    imageView.setImageResource(R.drawable.cyndaquil);
                    break;
            }
        }

    }

    public void submit(int result){
        Log.d("fffff", String.valueOf(resultt));
        Log.d("fffff", String.valueOf(result));
        if(result == resultt){
            switch (resultt){
                case 1:
                    rlAnswerNumber1.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 2:
                    rlAnswerNumber2.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 3:
                    rlAnswerNumber3.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 4:
                    rlAnswerNumber4.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 5:
                    rlAnswerNumber5.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 6:
                    rlAnswerNumber6.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 7:
                    rlAnswerNumber7.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 8:
                    rlAnswerNumber8.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 9:
                    rlAnswerNumber9.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                case 10:
                    rlAnswerNumber10.setBackgroundColor(getResources().getColor(R.color.green));
                    break;
                default:
            }
        } else {
            switch (resultt){
                case 1:
                    rlAnswerNumber1.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 2:
                    rlAnswerNumber2.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 3:
                    rlAnswerNumber3.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 4:
                    rlAnswerNumber4.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 5:
                    rlAnswerNumber5.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 6:
                    rlAnswerNumber6.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 7:
                    rlAnswerNumber7.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 8:
                    rlAnswerNumber8.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 9:
                    rlAnswerNumber9.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                case 10:
                    rlAnswerNumber10.setBackgroundColor(getResources().getColor(R.color.red));
                    break;
                default:
            }
        }
    }

    public void nextQuestion(){
        lockAnswer();
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                if(number == 9){
                    EventBus.getDefault().postSticky(new EventTime(chrNumberTime.getText().toString()));
                    Log.d("gg", chrNumberTime.getText().toString());
                    chrNumberTime.stop();
                    changeFragment(new NumberResultFragment());
                } else{
                    resetAnswer();
                    unlockAnswer();
                    setupImage();
                }
            }
        };
        countDownTimer.start();

    }

    public void lockAnswer(){
        for(RelativeLayout rl : rlNumberGames){
            rl.setClickable(false);
        }
    }

    public void unlockAnswer(){
        for(RelativeLayout rl : rlNumberGames){
            rl.setClickable(true);
        }
    }

    public void resetAnswer(){
        for(RelativeLayout rl : rlNumberGames){
            rl.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }

    public void changeFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment);
        fragmentTransaction.commit();
    }
}
