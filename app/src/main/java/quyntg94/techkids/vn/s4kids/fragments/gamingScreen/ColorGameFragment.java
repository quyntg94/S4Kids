package quyntg94.techkids.vn.s4kids.fragments.gamingScreen;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.IOException;
import java.util.List;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.applications.KidApplication;
import quyntg94.techkids.vn.s4kids.databases.ColorDatabases;
import quyntg94.techkids.vn.s4kids.databases.KidsDatabases;
import quyntg94.techkids.vn.s4kids.models.Letter;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

import static quyntg94.techkids.vn.s4kids.R.drawable.pikachu;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorGameFragment extends Fragment {



    public ColorGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color_game, container, false);

        return view;
    }





}
