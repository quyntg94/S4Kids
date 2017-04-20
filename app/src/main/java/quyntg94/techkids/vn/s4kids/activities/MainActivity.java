package quyntg94.techkids.vn.s4kids.activities;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.fragments.MainFragment;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

public class MainActivity extends AppCompatActivity {

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(new MainFragment(), true, null);
    }

    public void changeFragment(Fragment fragment, boolean addToBackstack, String tag) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment);
        if (addToBackstack) {
            fragmentTransaction.addToBackStack(tag);
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();
        if (!doubleBackToExitPressedOnce && count > 1) {
            super.onBackPressed();
            return;
        } else if (!doubleBackToExitPressedOnce && count == 1) {
            Log.d("test", getSupportFragmentManager().getBackStackEntryCount() + "");
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Nhấn lần nữa để thoát", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        } else if(doubleBackToExitPressedOnce && count == 1){
            finish();
        }
    }
}
