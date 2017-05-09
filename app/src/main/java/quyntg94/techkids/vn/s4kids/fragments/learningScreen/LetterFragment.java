package quyntg94.techkids.vn.s4kids.fragments.learningScreen;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.events.EventLetter;
import quyntg94.techkids.vn.s4kids.models.Letter;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class LetterFragment extends Fragment {

    private Letter letter;
    private TextView tvName;
    private ImageView ivImage1;
    private ImageView ivImage2;
    private TextView tvLetter1;
    private TextView tvLetter2;
    private ImageView ivSound;
    private ImageView ivSound1;
    private ImageView ivSound2;
    private boolean check = false;

    public LetterFragment() {
        // Required empty public constructor
    }

    @Subscribe(sticky = true)
    public void receiveInfo(EventLetter event) {
        this.letter = event.getLetter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_letter, container, false);
        EventBus.getDefault().register(this); //đăng ký nhận data được gửi từ learning fragment
        setupUI(view);
        return view;
    }

    private void setupUI(View view) {
        tvName = (TextView) view.findViewById(R.id.tv_name);
        ivImage1 = (ImageView) view.findViewById(R.id.iv_image1);
        ivImage2 = (ImageView) view.findViewById(R.id.iv_image2);
        tvLetter1 = (TextView) view.findViewById(R.id.tv_letter1);
        tvLetter2 = (TextView) view.findViewById(R.id.tv_letter2);
        ivSound = (ImageView) view.findViewById(R.id.iv_sound);
        ivSound1 = (ImageView) view.findViewById(R.id.iv_sound1);
        ivSound2 = (ImageView) view.findViewById(R.id.iv_sound2);

        loadData();
    }

    private void loadData() {
        tvName.setText(letter.getSubName());
        int image1 = getContext().getResources().getIdentifier("img_" + letter.getImage1(), "drawable", getContext().getPackageName());
        int image2 = getContext().getResources().getIdentifier("img_" + letter.getImage2(), "drawable", getContext().getPackageName());
        ivImage1.setImageResource(image1);
        ivImage2.setImageResource(image2);
        tvLetter1.setText(letter.getLetter1());
        tvLetter2.setText(letter.getLetter2());

        setOnClickListeners();

    }

    private void setOnClickListeners() {
        ivSound.setClickable(true);
        ivSound1.setClickable(true);
        ivSound2.setClickable(true);

        ivSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (letter.isCheck()) {
                    SoundManager.playNumber(letter.getName());

                } else {
                    SoundManager.playAlphabet(letter.getName());
                }
                unlockClick(ivSound);

            }
        });

        ivSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (letter.isCheck()) {
                    SoundManager.playNumber(letter.getLetter1());

                } else {
                    SoundManager.playLetter(letter.getLetter1());
                }
                unlockClick(ivSound1);
            }
        });

        ivSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (letter.isCheck()) {
                    SoundManager.playNumber(letter.getLetter2());

                } else {
                    SoundManager.playLetter(letter.getLetter2());
                }
                unlockClick(ivSound2);
            }
        });

    }

    private void lockClick(ImageView imageview) {

        imageview.setClickable(false);
    }

    private void unlockClick(ImageView imageView) {
        lockClick(imageView);
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                setOnClickListeners();
            }
        };
        countDownTimer.start();
    }
}
