package quyntg94.techkids.vn.s4kids.fragments.subScreen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.fragments.gamingScreen.ColorGameFragment;
import quyntg94.techkids.vn.s4kids.fragments.gamingScreen.LetterGameFragment;
import quyntg94.techkids.vn.s4kids.fragments.gamingScreen.NumberGameFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class GamingFragment extends Fragment {

    private RelativeLayout ivLetterGame;
    private RelativeLayout ivNumberGame;
    private RelativeLayout ivColorGame;

    public GamingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gaming, container, false);
        setupUI(view);
        return view;
    }

    private void setupUI(View view) {
        ivLetterGame = (RelativeLayout) view.findViewById(R.id.iv_game_letter);
        ivNumberGame = (RelativeLayout) view.findViewById(R.id.iv_game_number);
        ivColorGame = (RelativeLayout) view.findViewById(R.id.iv_game_color);

        setOnClickListener();
    }

    private void setOnClickListener() {
        ivLetterGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new LetterGameFragment(), true, null);
            }
        });
        ivNumberGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new NumberGameFragment(), true, null);
            }
        });
        ivColorGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new ColorGameFragment(), true, null);
            }
        });
    }

    public void changeFragment(Fragment fragment, boolean addToBackstack, String tag) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment);
        if (addToBackstack) {
            fragmentTransaction.addToBackStack(tag);
        }
        fragmentTransaction.commit();
    }

}
