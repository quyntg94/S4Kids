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
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.applications.KidApplication;
import quyntg94.techkids.vn.s4kids.databases.KidsDatabases;
import quyntg94.techkids.vn.s4kids.events.EventTime;
import quyntg94.techkids.vn.s4kids.fragments.resultsScreen.LetterResultFragment;
import quyntg94.techkids.vn.s4kids.models.Letter;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class LetterGameFragment extends Fragment {

    private KidsDatabases kidsDatabases = KidApplication.getInstance().getKidsDatabases();
    private List<Letter> letterList = kidsDatabases.loadOnlyLetter();
    private TextView tvLetterGameNumber;

    private TextView tvLetterGame1;
    private TextView tvLetterGame2;
    private TextView tvLetterGame3;
    private TextView tvLetterGame4;
    private TextView tvLetterGame5;
    private TextView tvLetterGame6;
    private TextView tvLetterGame7;
    private TextView tvLetterGame8;
    private TextView tvLetterGame9;
    private TextView tvLetterGame10;
    private TextView tvLetterGame11;
    private TextView tvLetterGame12;
    private TextView tvLetterGame13;
    private TextView tvLetterGame14;
    private TextView tvLetterGame15;
    private TextView tvLetterGame16;
    private TextView tvLetterGame17;
    private TextView tvLetterGame18;
    private TextView tvLetterGame19;
    private TextView tvLetterGame20;
    private TextView tvLetterGame21;
    private TextView tvLetterGame22;
    private TextView tvLetterGame23;
    private TextView tvLetterGame24;
    private TextView tvLetterGame25;
    private TextView tvLetterGame26;
    private TextView tvLetterGame27;
    private TextView tvLetterGame28;
    private TextView tvLetterGame29;

    private CardView cvLetterGame1;
    private CardView cvLetterGame2;
    private CardView cvLetterGame3;
    private CardView cvLetterGame4;
    private CardView cvLetterGame5;
    private CardView cvLetterGame6;
    private CardView cvLetterGame7;
    private CardView cvLetterGame8;
    private CardView cvLetterGame9;
    private CardView cvLetterGame10;
    private CardView cvLetterGame11;
    private CardView cvLetterGame12;
    private CardView cvLetterGame13;
    private CardView cvLetterGame14;
    private CardView cvLetterGame15;
    private CardView cvLetterGame16;
    private CardView cvLetterGame17;
    private CardView cvLetterGame18;
    private CardView cvLetterGame19;
    private CardView cvLetterGame20;
    private CardView cvLetterGame21;
    private CardView cvLetterGame22;
    private CardView cvLetterGame23;
    private CardView cvLetterGame24;
    private CardView cvLetterGame25;
    private CardView cvLetterGame26;
    private CardView cvLetterGame27;
    private CardView cvLetterGame28;
    private CardView cvLetterGame29;

    private Chronometer chrLetterGame;
    private Button btnRepeat;

    private int randSub;
    private int number = 0;
    Random rand = new Random();
    private List<TextView> tvLetterGames;
    private List<CardView> cvLetterGames;


    public LetterGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_letter_game, container, false);
        SoundManager.loadAlphabetInfoList(getContext());
        setupUI(view);
        return view;
    }

    private void setupUI(View view) {
        tvLetterGames = new ArrayList<>();
        cvLetterGames = new ArrayList<>();
        tvLetterGame1 = (TextView) view.findViewById(R.id.tv_letter_game_1);
        tvLetterGame2 = (TextView) view.findViewById(R.id.tv_letter_game_2);
        tvLetterGame3 = (TextView) view.findViewById(R.id.tv_letter_game_3);
        tvLetterGame4 = (TextView) view.findViewById(R.id.tv_letter_game_4);
        tvLetterGame5 = (TextView) view.findViewById(R.id.tv_letter_game_5);
        tvLetterGame6 = (TextView) view.findViewById(R.id.tv_letter_game_6);
        tvLetterGame7 = (TextView) view.findViewById(R.id.tv_letter_game_7);
        tvLetterGame8 = (TextView) view.findViewById(R.id.tv_letter_game_8);
        tvLetterGame9 = (TextView) view.findViewById(R.id.tv_letter_game_9);
        tvLetterGame10 = (TextView) view.findViewById(R.id.tv_letter_game_10);
        tvLetterGame11 = (TextView) view.findViewById(R.id.tv_letter_game_11);
        tvLetterGame12 = (TextView) view.findViewById(R.id.tv_letter_game_12);
        tvLetterGame13 = (TextView) view.findViewById(R.id.tv_letter_game_13);
        tvLetterGame14 = (TextView) view.findViewById(R.id.tv_letter_game_14);
        tvLetterGame15 = (TextView) view.findViewById(R.id.tv_letter_game_15);
        tvLetterGame16 = (TextView) view.findViewById(R.id.tv_letter_game_16);
        tvLetterGame17 = (TextView) view.findViewById(R.id.tv_letter_game_17);
        tvLetterGame18 = (TextView) view.findViewById(R.id.tv_letter_game_18);
        tvLetterGame19 = (TextView) view.findViewById(R.id.tv_letter_game_19);
        tvLetterGame20 = (TextView) view.findViewById(R.id.tv_letter_game_20);
        tvLetterGame21 = (TextView) view.findViewById(R.id.tv_letter_game_21);
        tvLetterGame22 = (TextView) view.findViewById(R.id.tv_letter_game_22);
        tvLetterGame23 = (TextView) view.findViewById(R.id.tv_letter_game_23);
        tvLetterGame24 = (TextView) view.findViewById(R.id.tv_letter_game_24);
        tvLetterGame25 = (TextView) view.findViewById(R.id.tv_letter_game_25);
        tvLetterGame26 = (TextView) view.findViewById(R.id.tv_letter_game_26);
        tvLetterGame27 = (TextView) view.findViewById(R.id.tv_letter_game_27);
        tvLetterGame28 = (TextView) view.findViewById(R.id.tv_letter_game_28);
        tvLetterGame29 = (TextView) view.findViewById(R.id.tv_letter_game_29);

        cvLetterGame1 = (CardView) view.findViewById(R.id.cv_letter_game_1);
        cvLetterGame2 = (CardView) view.findViewById(R.id.cv_letter_game_2);
        cvLetterGame3 = (CardView) view.findViewById(R.id.cv_letter_game_3);
        cvLetterGame4 = (CardView) view.findViewById(R.id.cv_letter_game_4);
        cvLetterGame5 = (CardView) view.findViewById(R.id.cv_letter_game_5);
        cvLetterGame6 = (CardView) view.findViewById(R.id.cv_letter_game_6);
        cvLetterGame7 = (CardView) view.findViewById(R.id.cv_letter_game_7);
        cvLetterGame8 = (CardView) view.findViewById(R.id.cv_letter_game_8);
        cvLetterGame9 = (CardView) view.findViewById(R.id.cv_letter_game_9);
        cvLetterGame10 = (CardView) view.findViewById(R.id.cv_letter_game_10);
        cvLetterGame11 = (CardView) view.findViewById(R.id.cv_letter_game_11);
        cvLetterGame12 = (CardView) view.findViewById(R.id.cv_letter_game_12);
        cvLetterGame13 = (CardView) view.findViewById(R.id.cv_letter_game_13);
        cvLetterGame14 = (CardView) view.findViewById(R.id.cv_letter_game_14);
        cvLetterGame15 = (CardView) view.findViewById(R.id.cv_letter_game_15);
        cvLetterGame16 = (CardView) view.findViewById(R.id.cv_letter_game_16);
        cvLetterGame17 = (CardView) view.findViewById(R.id.cv_letter_game_17);
        cvLetterGame18 = (CardView) view.findViewById(R.id.cv_letter_game_18);
        cvLetterGame19 = (CardView) view.findViewById(R.id.cv_letter_game_19);
        cvLetterGame20 = (CardView) view.findViewById(R.id.cv_letter_game_20);
        cvLetterGame21 = (CardView) view.findViewById(R.id.cv_letter_game_21);
        cvLetterGame22 = (CardView) view.findViewById(R.id.cv_letter_game_22);
        cvLetterGame23 = (CardView) view.findViewById(R.id.cv_letter_game_23);
        cvLetterGame24 = (CardView) view.findViewById(R.id.cv_letter_game_24);
        cvLetterGame25 = (CardView) view.findViewById(R.id.cv_letter_game_25);
        cvLetterGame26 = (CardView) view.findViewById(R.id.cv_letter_game_26);
        cvLetterGame27 = (CardView) view.findViewById(R.id.cv_letter_game_27);
        cvLetterGame28 = (CardView) view.findViewById(R.id.cv_letter_game_28);
        cvLetterGame29 = (CardView) view.findViewById(R.id.cv_letter_game_29);

        chrLetterGame = (Chronometer) view.findViewById(R.id.chr_time_letter);

        tvLetterGames.add(tvLetterGame1);
        tvLetterGames.add(tvLetterGame2);
        tvLetterGames.add(tvLetterGame3);
        tvLetterGames.add(tvLetterGame4);
        tvLetterGames.add(tvLetterGame5);
        tvLetterGames.add(tvLetterGame6);
        tvLetterGames.add(tvLetterGame7);
        tvLetterGames.add(tvLetterGame8);
        tvLetterGames.add(tvLetterGame9);
        tvLetterGames.add(tvLetterGame10);
        tvLetterGames.add(tvLetterGame11);
        tvLetterGames.add(tvLetterGame12);
        tvLetterGames.add(tvLetterGame13);
        tvLetterGames.add(tvLetterGame14);
        tvLetterGames.add(tvLetterGame15);
        tvLetterGames.add(tvLetterGame16);
        tvLetterGames.add(tvLetterGame17);
        tvLetterGames.add(tvLetterGame18);
        tvLetterGames.add(tvLetterGame19);
        tvLetterGames.add(tvLetterGame20);
        tvLetterGames.add(tvLetterGame21);
        tvLetterGames.add(tvLetterGame22);
        tvLetterGames.add(tvLetterGame23);
        tvLetterGames.add(tvLetterGame24);
        tvLetterGames.add(tvLetterGame25);
        tvLetterGames.add(tvLetterGame26);
        tvLetterGames.add(tvLetterGame27);
        tvLetterGames.add(tvLetterGame28);
        tvLetterGames.add(tvLetterGame29);

        cvLetterGames.add(cvLetterGame1);
        cvLetterGames.add(cvLetterGame2);
        cvLetterGames.add(cvLetterGame3);
        cvLetterGames.add(cvLetterGame4);
        cvLetterGames.add(cvLetterGame5);
        cvLetterGames.add(cvLetterGame6);
        cvLetterGames.add(cvLetterGame7);
        cvLetterGames.add(cvLetterGame8);
        cvLetterGames.add(cvLetterGame9);
        cvLetterGames.add(cvLetterGame10);
        cvLetterGames.add(cvLetterGame11);
        cvLetterGames.add(cvLetterGame12);
        cvLetterGames.add(cvLetterGame13);
        cvLetterGames.add(cvLetterGame14);
        cvLetterGames.add(cvLetterGame15);
        cvLetterGames.add(cvLetterGame16);
        cvLetterGames.add(cvLetterGame17);
        cvLetterGames.add(cvLetterGame18);
        cvLetterGames.add(cvLetterGame19);
        cvLetterGames.add(cvLetterGame20);
        cvLetterGames.add(cvLetterGame21);
        cvLetterGames.add(cvLetterGame22);
        cvLetterGames.add(cvLetterGame23);
        cvLetterGames.add(cvLetterGame24);
        cvLetterGames.add(cvLetterGame25);
        cvLetterGames.add(cvLetterGame26);
        cvLetterGames.add(cvLetterGame27);
        cvLetterGames.add(cvLetterGame28);
        cvLetterGames.add(cvLetterGame29);

        tvLetterGameNumber = (TextView) view.findViewById(R.id.tv_letter_game_number);
        btnRepeat = (Button) view.findViewById(R.id.btn_repeat);

        setupQuestion();
    }

    private void setupQuestion() {
        chrLetterGame.start();
        number++;
        tvLetterGameNumber.setText("Câu " + number);
        Log.d("fuck1", letterList.toString() + "/n");

        int randQuestion = rand.nextInt(29) + 1;
        randSub = randQuestion;
        Log.d("fuck", String.valueOf(randQuestion));
        for (int i = 0; i < letterList.size(); i++) {
            Letter letter = letterList.get(i);
            Log.d("fuck3", String.valueOf(letter.getId()));
            if (letter.getId() == randQuestion) {
                Log.d("fuck", String.valueOf(letter.getId()));
                Log.d("fuc4", String.valueOf(letter.getName()));
                SoundManager.playAlphabet(letter.getName());
            }
        }
        setOnClickListener(randQuestion);
        setRepeat(randSub);
    }

    private void setOnClickListener(int roll) {
        switch (roll) {
            case 1:
                cvLetterGames.remove(cvLetterGame1);
                tvLetterGames.remove(tvLetterGame1);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame1, cvLetterGame1);
                    }
                });
                setRepeat(roll);
                break;
            case 2:
                cvLetterGames.remove(cvLetterGame2);
                tvLetterGames.remove(tvLetterGame2);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame2, cvLetterGame2);
                    }
                });
                setRepeat(roll);
                break;
            case 3:
                cvLetterGames.remove(cvLetterGame3);
                tvLetterGames.remove(tvLetterGame3);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame3, cvLetterGame3);
                    }
                });
                setRepeat(roll);
                break;
            case 4:
                cvLetterGames.remove(cvLetterGame4);
                tvLetterGames.remove(tvLetterGame4);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame4, cvLetterGame4);
                    }
                });
                setRepeat(roll);
                break;
            case 5:
                cvLetterGames.remove(cvLetterGame5);
                tvLetterGames.remove(tvLetterGame5);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame5, cvLetterGame5);
                    }
                });
                setRepeat(roll);
                break;
            case 6:
                cvLetterGames.remove(cvLetterGame6);
                tvLetterGames.remove(tvLetterGame6);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame6, cvLetterGame6);
                    }
                });
                setRepeat(roll);
                break;
            case 7:
                cvLetterGames.remove(cvLetterGame7);
                tvLetterGames.remove(tvLetterGame7);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame7, cvLetterGame7);
                    }
                });
                setRepeat(roll);
                break;
            case 8:
                cvLetterGames.remove(cvLetterGame8);
                tvLetterGames.remove(tvLetterGame8);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame8, cvLetterGame8);
                    }
                });
                setRepeat(roll);
                break;
            case 9:
                cvLetterGames.remove(cvLetterGame9);
                tvLetterGames.remove(tvLetterGame9);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame9, cvLetterGame9);
                    }
                });
                setRepeat(roll);
                break;
            case 10:
                cvLetterGames.remove(cvLetterGame10);
                tvLetterGames.remove(tvLetterGame10);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame10, cvLetterGame10);
                    }
                });
                setRepeat(roll);
                break;
            case 11:
                cvLetterGames.remove(cvLetterGame11);
                tvLetterGames.remove(tvLetterGame11);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame11, cvLetterGame11);
                    }
                });
                setRepeat(roll);
                break;
            case 12:
                cvLetterGames.remove(cvLetterGame12);
                tvLetterGames.remove(tvLetterGame12);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame12, cvLetterGame12);
                    }
                });
                setRepeat(roll);
                break;
            case 13:
                cvLetterGames.remove(cvLetterGame13);
                tvLetterGames.remove(tvLetterGame13);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame13, cvLetterGame13);
                    }
                });
                setRepeat(roll);
                break;
            case 14:
                cvLetterGames.remove(cvLetterGame14);
                tvLetterGames.remove(tvLetterGame14);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame14, cvLetterGame14);
                    }
                });
                setRepeat(roll);
                break;
            case 15:
                cvLetterGames.remove(cvLetterGame15);
                tvLetterGames.remove(tvLetterGame15);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame15, cvLetterGame15);
                    }
                });
                setRepeat(roll);
                break;
            case 16:
                cvLetterGames.remove(cvLetterGame16);
                tvLetterGames.remove(tvLetterGame16);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame16, cvLetterGame16);
                    }
                });
                setRepeat(roll);
                break;
            case 17:
                cvLetterGames.remove(cvLetterGame17);
                tvLetterGames.remove(tvLetterGame17);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame17, cvLetterGame17);
                    }
                });
                setRepeat(roll);
                break;
            case 18:
                cvLetterGames.remove(cvLetterGame18);
                tvLetterGames.remove(tvLetterGame18);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame18, cvLetterGame18);
                    }
                });
                setRepeat(roll);
                break;
            case 19:
                cvLetterGames.remove(cvLetterGame19);
                tvLetterGames.remove(tvLetterGame19);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame19, cvLetterGame19);
                    }
                });
                setRepeat(roll);
                break;
            case 20:
                cvLetterGames.remove(cvLetterGame20);
                tvLetterGames.remove(tvLetterGame20);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame20, cvLetterGame20);
                    }
                });
                setRepeat(roll);
                break;
            case 21:
                cvLetterGames.remove(cvLetterGame21);
                tvLetterGames.remove(tvLetterGame21);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame21, cvLetterGame21);
                    }
                });
                setRepeat(roll);
                break;
            case 22:
                cvLetterGames.remove(cvLetterGame22);
                tvLetterGames.remove(tvLetterGame22);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame22, cvLetterGame22);
                    }
                });
                setRepeat(roll);
                break;
            case 23:
                cvLetterGames.remove(cvLetterGame23);
                tvLetterGames.remove(tvLetterGame23);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame23, cvLetterGame23);
                    }
                });
                setRepeat(roll);
                break;
            case 24:
                cvLetterGames.remove(cvLetterGame24);
                tvLetterGames.remove(tvLetterGame24);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame24, cvLetterGame24);
                    }
                });
                setRepeat(roll);
                break;
            case 25:
                cvLetterGames.remove(cvLetterGame25);
                tvLetterGames.remove(tvLetterGame25);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame25, cvLetterGame25);
                    }
                });
                setRepeat(roll);
                break;
            case 26:
                cvLetterGames.remove(cvLetterGame26);
                tvLetterGames.remove(tvLetterGame26);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame26, cvLetterGame26);
                    }
                });
                setRepeat(roll);
                break;
            case 27:
                cvLetterGames.remove(cvLetterGame27);
                tvLetterGames.remove(tvLetterGame27);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame27.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame27, cvLetterGame27);
                    }
                });
                setRepeat(roll);
                break;
            case 28:
                cvLetterGames.remove(cvLetterGame28);
                tvLetterGames.remove(tvLetterGame28);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame28.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame28, cvLetterGame28);
                    }
                });
                setRepeat(roll);
                break;
            case 29:
                cvLetterGames.remove(cvLetterGame29);
                tvLetterGames.remove(tvLetterGame29);
                for (int i = 0; i < cvLetterGames.size(); i++) {
                    CardView cardView = cvLetterGames.get(i);
                    final int test = i;
                    cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            for (int j = 0; j < tvLetterGames.size(); j++) {
                                if (j == test) {
                                    clickFalse(tvLetterGames.get(j));
                                }
                            }
                        }
                    });
                }
                cvLetterGame29.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickTrue(tvLetterGame29, cvLetterGame29);
                    }
                });
                setRepeat(roll);
                break;
            default:
        }


    }

    private void setRepeat(final int rand) {
        btnRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < letterList.size(); i++) {
                    Letter letter = letterList.get(i);
                    Log.d("fuck3", String.valueOf(letter.getId()));
                    if (letter.getId() == rand) {
                        Log.d("fuck", String.valueOf(letter.getId()));
                        Log.d("fuc4", String.valueOf(letter.getName()));
                        SoundManager.playAlphabet(letter.getName());
                    }
                }

            }
        });
        btnRepeat.setClickable(false);
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                btnRepeat.setClickable(true);

            }
        };
        countDownTimer.start();
    }

    private void clickTrue(TextView textView, CardView cardView) {
        textView.setBackgroundColor(getResources().getColor(R.color.green));
        tvLetterGames.add(textView);
        cvLetterGames.add(cardView);
        lockAnswer();
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                if (number == 9) {
                    EventBus.getDefault().postSticky(new EventTime(chrLetterGame.getText().toString()));
                    Log.d("gg", chrLetterGame.getText().toString());
                    chrLetterGame.stop();
                    changeFragment(new LetterResultFragment());
                } else {
                    resetClick();
                    unlockAnswer();
                    setupQuestion();
                }
            }
        };
        countDownTimer.start();
    }

    private void clickFalse(TextView textView) {
        textView.setBackgroundColor(getResources().getColor(R.color.red));
    }

    private void resetClick() {
        for (TextView textView : tvLetterGames) {
            textView.setBackgroundColor(getResources().getColor(R.color.white));

        }
    }

    private void lockAnswer() {
        for (CardView cardView : cvLetterGames) {
            cardView.setClickable(false);

        }
    }

    private void unlockAnswer() {
        for (CardView cardView : cvLetterGames) {
            cardView.setClickable(true);

        }
    }

    public void changeFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment);
        fragmentTransaction.commit();
    }
}
