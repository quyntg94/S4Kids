package quyntg94.techkids.vn.s4kids.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import quyntg94.techkids.vn.s4kids.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private ImageView ivScreen1;
    private ImageView ivScreen2;
    private ImageView ivScreen3;
    private ImageView ivScreen4;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        setupUI(view);
        setOnClickListeners();
        return view;
    }

    private void setupUI(View view) {
        ivScreen1 = (ImageView) view.findViewById(R.id.iv_screen_1);
        ivScreen2 = (ImageView) view.findViewById(R.id.iv_screen_2);
        ivScreen3 = (ImageView) view.findViewById(R.id.iv_screen_3);
        ivScreen4 = (ImageView) view.findViewById(R.id.iv_screen_4);

    }

    private void setOnClickListeners() {
        ivScreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new LearningFragment(), true, null);
            }
        });
        ivScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new GamingFragment(), true, null);
            }
        });
        ivScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new ColorFragment(), true, null);
            }
        });
        ivScreen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new RankingFragment(), true, null);
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
