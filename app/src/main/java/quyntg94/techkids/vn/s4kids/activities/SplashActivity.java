package quyntg94.techkids.vn.s4kids.activities;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

public class SplashActivity extends AppCompatActivity {

    ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //load list nhạc từ app ra
        SoundManager.loadSoundInfoList(this);
        ivLogo = (ImageView) findViewById(R.id.iv_logo);

        //animation từ từ hiện ra (alpha) với ảnh ở màn hình splash
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f); //tỉ lệ từ 20% đến 100%
        alphaAnimation.setDuration(1000); //thời gian hoàn thành animation (1s)
        alphaAnimation.setFillAfter(true); //giữ nguyên hình ảnh sau khi hoàn thành animation
        ivLogo.startAnimation(alphaAnimation); //chạy animation

        //đồng hồ đếm ngược
        CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        };

        countDownTimer.start();
    }
}
