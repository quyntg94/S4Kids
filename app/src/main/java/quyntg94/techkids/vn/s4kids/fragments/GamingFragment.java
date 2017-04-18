package quyntg94.techkids.vn.s4kids.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quyntg94.techkids.vn.s4kids.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GamingFragment extends Fragment {


    public GamingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gaming, container, false);
    }

}
