package quyntg94.techkids.vn.s4kids.fragments.gamingScreen;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.activities.MainActivity;
import quyntg94.techkids.vn.s4kids.activities.SplashActivity;
import quyntg94.techkids.vn.s4kids.applications.KidApplication;
import quyntg94.techkids.vn.s4kids.databases.ColorDatabases;
import quyntg94.techkids.vn.s4kids.databases.ColorGameDatabases;
import quyntg94.techkids.vn.s4kids.databases.KidsDatabases;
import quyntg94.techkids.vn.s4kids.events.EventTime;
import quyntg94.techkids.vn.s4kids.fragments.resultsScreen.ColorResultFragment;
import quyntg94.techkids.vn.s4kids.models.ColorGame;
import quyntg94.techkids.vn.s4kids.models.Letter;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

import static quyntg94.techkids.vn.s4kids.R.drawable.pikachu;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorGameFragment extends Fragment {

    private ColorDatabases colorDatabases = KidApplication.getInstance().getColorDatabases();
    private List<quyntg94.techkids.vn.s4kids.models.Color> colorList = colorDatabases.loadAllColor();
    private ColorGameDatabases colorGameDatabases = KidApplication.getInstance().getColorGameDatabases();
    private List<ColorGame> colorGameList = colorGameDatabases.loadAllColorGame();

    Random rand = new Random();
    private int randAnswer;
    private int randQuestion;
    private int choice = 2;
    private int number = 0;

    private TextView tvColorGameNumber;
    private Chronometer chTimeColor;
    private ImageView ivQuestionColor;
    private ImageView ivAnswerColorA;
    private ImageView ivAnswerColorB;
    private ImageView ivAnswerColorC;
    private ImageView ivAnswerColorD;
    private TextView tvAnswerColorA;
    private TextView tvAnswerColorB;
    private TextView tvAnswerColorC;
    private TextView tvAnswerColorD;
    private RelativeLayout rlAnswerColorA;
    private RelativeLayout rlAnswerColorB;
    private RelativeLayout rlAnswerColorC;
    private RelativeLayout rlAnswerColorD;

    private TextView tvChoice;
    private ImageView ivAnswerSoundA;
    private ImageView ivAnswerSoundB;
    private ImageView ivAnswerSoundC;
    private ImageView ivAnswerSoundD;


    public ColorGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color_game, container, false);
        setupUI(view);
        setupQuestion();
        return view;
    }

    private void setupUI(View view) {
        tvColorGameNumber = (TextView) view.findViewById(R.id.tv_color_game_number);
        chTimeColor = (Chronometer) view.findViewById(R.id.chr_time_color);
        ivQuestionColor = (ImageView) view.findViewById(R.id.iv_question_color);
        ivAnswerColorA = (ImageView) view.findViewById(R.id.iv_answer_color_A);
        ivAnswerColorB = (ImageView) view.findViewById(R.id.iv_answer_color_B);
        ivAnswerColorC = (ImageView) view.findViewById(R.id.iv_answer_color_C);
        ivAnswerColorD = (ImageView) view.findViewById(R.id.iv_answer_color_D);
        tvAnswerColorA = (TextView) view.findViewById(R.id.tv_answer_color_A);
        tvAnswerColorB = (TextView) view.findViewById(R.id.tv_answer_color_B);
        tvAnswerColorC = (TextView) view.findViewById(R.id.tv_answer_color_C);
        tvAnswerColorD = (TextView) view.findViewById(R.id.tv_answer_color_D);
        rlAnswerColorA = (RelativeLayout) view.findViewById(R.id.rl_answer_color_A);
        rlAnswerColorB = (RelativeLayout) view.findViewById(R.id.rl_answer_color_B);
        rlAnswerColorC = (RelativeLayout) view.findViewById(R.id.rl_answer_color_C);
        rlAnswerColorD = (RelativeLayout) view.findViewById(R.id.rl_answer_color_D);
        ivAnswerSoundA = (ImageView) view.findViewById(R.id.iv_answer_sound_A);
        ivAnswerSoundB = (ImageView) view.findViewById(R.id.iv_answer_sound_B);
        ivAnswerSoundC = (ImageView) view.findViewById(R.id.iv_answer_sound_C);
        ivAnswerSoundD = (ImageView) view.findViewById(R.id.iv_answer_sound_D);
        tvChoice = (TextView) view.findViewById(R.id.tv_choice);
        lockAnswer();

    }

    private void setupQuestion(){
        choice = 2;
        tvChoice.setText("Số lần lựa chọn: " + choice);
        chTimeColor.start();
        Log.d("ahihi", String.valueOf(chTimeColor.getText()));
        number++;
        tvColorGameNumber.setText("Câu " + number);
        Log.d("color", colorList.toString());
        randAnswer = rand.nextInt(colorList.size()) + 1;
        Log.d("ahihi", "a " + String.valueOf(randAnswer));
        switch (randAnswer){
            case 1:
                changeColor(Color.RED);
                break;
            case 2:
                changeColor(Color.YELLOW);
                break;
            case 3:
                changeColor(Color.GRAY);
                break;
            case 4:
                changeColor(Color.CYAN);
                break;
            case 5:
                changeColor(Color.BLACK);
                break;
            case 6:
                changeColor(Color.WHITE);
                break;
            case 7:
                changeColor(Color.BLUE);
                break;
            case 8:
                changeColor(Color.GREEN);
                break;
        }
        setupAnswer(randAnswer);

    }

    public void changeColor(int colorCode){
        randQuestion = rand.nextInt(colorGameList.size());
        Log.d("chihi", String.valueOf(randQuestion));
        try {
            Bitmap image = BitmapFactory.decodeStream(getActivity().getAssets().open("images/" + colorGameList.get(randQuestion).getImage() + ".png"));
            Bitmap b = Bitmap.createBitmap(image.getWidth(), image.getHeight(),image.getConfig());
            for (int i =0; i < image.getWidth(); i++){
                for (int j =0; j < image.getHeight(); j++){
                    int p = image.getPixel(i, j);
                    int alpha = android.graphics.Color.alpha(p);
                    if (alpha != 0){
                        b.setPixel(i, j, colorCode);
                    }
                }
            }
            ivQuestionColor.setImageBitmap(b);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setupAnswer(int i){
        int chooseTrueAnswer = rand.nextInt(4) + 1;
        Log.d("ahihi", String.valueOf(chooseTrueAnswer));
        switch (chooseTrueAnswer){
            case 1:
                setAnswerA(i);
                int chooseFalseAnswerA;
                int chooseFalseAnswerA1;
                int chooseFalseAnswerA2;
                chooseFalseAnswerA = rand.nextInt(colorList.size()) + 1;
                setAnswerB(chooseFalseAnswerA);
                chooseFalseAnswerA = rand.nextInt(colorList.size()) + 1;
                setAnswerC(chooseFalseAnswerA);
                chooseFalseAnswerA = rand.nextInt(colorList.size()) + 1;
                setAnswerD(chooseFalseAnswerA);
                break;
            case 2:
                setAnswerB(i);
                int chooseFalseAnswerB;
                chooseFalseAnswerB = rand.nextInt(colorList.size()) + 1;
                setAnswerA(chooseFalseAnswerB);
                chooseFalseAnswerB = rand.nextInt(colorList.size()) + 1;
                setAnswerC(chooseFalseAnswerB);
                chooseFalseAnswerB = rand.nextInt(colorList.size()) + 1;
                setAnswerD(chooseFalseAnswerB);
                break;
            case 3:
                setAnswerC(i);
                int chooseFalseAnswerC;
                chooseFalseAnswerC = rand.nextInt(colorList.size()) + 1;
                setAnswerA(chooseFalseAnswerC);
                chooseFalseAnswerC = rand.nextInt(colorList.size()) + 1;
                setAnswerB(chooseFalseAnswerC);
                chooseFalseAnswerC = rand.nextInt(colorList.size()) + 1;
                setAnswerD(chooseFalseAnswerC);
                break;
            case 4:
                setAnswerD(i);
                int chooseFalseAnswerD;
                chooseFalseAnswerD = rand.nextInt(colorList.size()) + 1;
                setAnswerA(chooseFalseAnswerD);
                chooseFalseAnswerD = rand.nextInt(colorList.size()) + 1;
                setAnswerB(chooseFalseAnswerD);
                chooseFalseAnswerD = rand.nextInt(colorList.size()) + 1;
                setAnswerC(chooseFalseAnswerD);
                break;
            default:

        }
        resetAnswer();
        setOnClickListeners(chooseTrueAnswer);

    }

    public void setAnswerA(int j){
        for(int i = 0; i < colorList.size(); i ++){
            if(Integer.parseInt(colorList.get(i).getSound()) == j){
                Log.d("dhihi", colorList.get(i).getSound());
                tvAnswerColorA.setText(colorList.get(i).getName());
                ivAnswerSoundA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SoundManager.playColor((String) tvAnswerColorA.getText());
                    }
                });

            }
        }
    }

    public void setAnswerB(int j){
        for(int i = 0; i < colorList.size(); i ++){
            if(Integer.parseInt(colorList.get(i).getSound()) == j){
                Log.d("dhihi", colorList.get(i).getSound());
                tvAnswerColorB.setText(colorList.get(i).getName());
                ivAnswerSoundB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SoundManager.playColor((String) tvAnswerColorB.getText());
                    }
                });
            }
        }
    }
    public void setAnswerC(int j){
        for(int i = 0; i < colorList.size(); i ++){
            if(Integer.parseInt(colorList.get(i).getSound()) == j){
                Log.d("dhihi", colorList.get(i).getSound());
                tvAnswerColorC.setText(colorList.get(i).getName());
                ivAnswerSoundC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SoundManager.playColor((String) tvAnswerColorC.getText());
                    }
                });
            }
        }
    }
    public void setAnswerD(int j){
        for(int i = 0; i < colorList.size(); i ++){
            if(Integer.parseInt(colorList.get(i).getSound()) == j){
                Log.d("dhihi", colorList.get(i).getSound());
                tvAnswerColorD.setText(colorList.get(i).getName());
                ivAnswerSoundD.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SoundManager.playColor((String) tvAnswerColorD.getText());
                    }
                });
            }
        }
    }

    public void setOnClickListeners(int roll){
        tvChoice.setText("Số lần lựa chọn: " + choice);

        switch (roll){
            case 1:
                ivAnswerColorA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorA.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_green));
                        lockAnswerWithoutChoice();
                        nextQuestionWithoutChoice();
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                    }
                });
                ivAnswerColorB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorB.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorB.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorC.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorC.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorD.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorD.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorD.setClickable(false);
                        nextQuestion();
                    }
                });
                break;
            case 2:
                ivAnswerColorA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorA.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorA.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorB.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_green));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswerWithoutChoice();
                        nextQuestionWithoutChoice();
                    }
                });
                ivAnswerColorC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorC.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorC.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorD.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorD.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorD.setClickable(false);
                        nextQuestion();
                    }
                });
                break;
            case 3:
                ivAnswerColorA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorA.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorA.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorB.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorB.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorC.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_green));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswerWithoutChoice();
                        nextQuestionWithoutChoice();
                    }
                });
                ivAnswerColorD.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorD.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorD.setClickable(false);
                        nextQuestion();
                    }
                });
                break;
            case 4:
                ivAnswerColorA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorA.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorA.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorB.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorB.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorC.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_red));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswer();
                        ivAnswerColorC.setClickable(false);
                        nextQuestion();
                    }
                });
                ivAnswerColorD.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ivAnswerColorD.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_green));
                        choice--;
                        tvChoice.setText("Số lần lựa chọn: " + choice);
                        lockAnswerWithoutChoice();
                        nextQuestionWithoutChoice();
                    }
                });
                break;
            default:
        }


    }

    public void resetAnswer(){
        ivAnswerColorA.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_white));
        ivAnswerColorB.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_white));
        ivAnswerColorC.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_white));
        ivAnswerColorD.setImageDrawable(getResources().getDrawable(R.drawable.custom_view_circular_white));

        ivAnswerColorA.setClickable(true);
        ivAnswerColorB.setClickable(true);
        ivAnswerColorC.setClickable(true);
        ivAnswerColorD.setClickable(true);

    }

    public void lockAnswer(){
        if (choice == 0) {
            ivAnswerColorA.setClickable(false);
            ivAnswerColorB.setClickable(false);
            ivAnswerColorC.setClickable(false);
            ivAnswerColorD.setClickable(false);
        }
    }

    public void lockAnswerWithoutChoice(){
        ivAnswerColorA.setClickable(false);
        ivAnswerColorB.setClickable(false);
        ivAnswerColorC.setClickable(false);
        ivAnswerColorD.setClickable(false);
    }


    public void nextQuestion(){
        if(choice == 0){
            CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    if(number == 10){
                        EventBus.getDefault().postSticky(new EventTime(chTimeColor.getText().toString()));
                        Log.d("gg", chTimeColor.getText().toString());
                        chTimeColor.stop();
                        changeFragment(new ColorResultFragment());
                    } else{
                        setupQuestion();
                        choice = 2;
                    }


                }
            };
            countDownTimer.start();

        }


    }

    public void nextQuestionWithoutChoice(){
        CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                if(number == 10){
                    EventBus.getDefault().postSticky(new EventTime(chTimeColor.getText().toString()));
                    Log.d("gg", chTimeColor.getText().toString());
                    chTimeColor.stop();
                    changeFragment(new ColorResultFragment());
                } else{
                    setupQuestion();
                    resetAnswer();
                    choice = 2;
                }


            }
        };
        countDownTimer.start();

    }
    public void changeFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment);
        fragmentTransaction.commit();
    }

}
