package quyntg94.techkids.vn.s4kids.activities;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

public class SplashActivity extends AppCompatActivity {

    ImageView ivLogo;
    ProgressBar pbTime;
    private int s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //load list nhạc từ app ra

        ivLogo = (ImageView) findViewById(R.id.iv_logo);
        pbTime = (ProgressBar) findViewById(R.id.pb_time);
        //animation từ từ hiện ra (alpha) với ảnh ở màn hình splash
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f); //tỉ lệ từ 20% đến 100%
        alphaAnimation.setDuration(1000); //thời gian hoàn thành animation (1s)
        alphaAnimation.setFillAfter(true); //giữ nguyên hình ảnh sau khi hoàn thành animation
        ivLogo.startAnimation(alphaAnimation); //chạy animation

        //đồng hồ đếm ngược
        s = 0;
        pbTime.setProgress(s);
        pbTime.setMax(3);
        CountDownTimer countDownTimer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                s += 1;
                if (s < pbTime.getMax()) {
                    pbTime.setProgress(s);
                } else {
                    pbTime.setProgress(pbTime.getMax());
                }
            }

            @Override
            public void onFinish() {
                SoundManager.loadSoundInfoList(getBaseContext());
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        };

        countDownTimer.start();
//        pbTime.setVisibility(View.INVISIBLE);

    }
}
