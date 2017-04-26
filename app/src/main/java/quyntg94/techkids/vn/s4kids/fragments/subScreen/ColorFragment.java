package quyntg94.techkids.vn.s4kids.fragments.subScreen;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.util.List;

import quyntg94.techkids.vn.s4kids.R;
import quyntg94.techkids.vn.s4kids.applications.KidApplication;
import quyntg94.techkids.vn.s4kids.databases.ColorDatabases;
import quyntg94.techkids.vn.s4kids.models.Color;
import quyntg94.techkids.vn.s4kids.sounds.SoundManager;

import static quyntg94.techkids.vn.s4kids.R.drawable.pikachu;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    private ColorDatabases colorDatabases = KidApplication.getInstance().getColorDatabases();
    private List<Color> colorList = colorDatabases.loadAllColor();

    private ImageView ivColorGameTest;
    private ImageView ivRed;
    private ImageView ivYellow;
    private ImageView ivCyan;
    private ImageView ivBlack;
    private ImageView ivWhite;
    private ImageView ivBlue;
    private ImageView ivGreen;
    private ImageView ivGray;

    private Button btnReset;

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        SoundManager.loadColorInfoList(getContext());
        setupUI(view);
        return view;
    }

    private void setupUI(View view) {
        ivColorGameTest = (ImageView) view.findViewById(R.id.iv_color_game_test);
        ivRed = (ImageView) view.findViewById(R.id.iv_red);
        ivYellow = (ImageView) view.findViewById(R.id.iv_yellow);
        ivCyan = (ImageView) view.findViewById(R.id.iv_cyan);
        ivBlack = (ImageView) view.findViewById(R.id.iv_black);
        ivWhite = (ImageView) view.findViewById(R.id.iv_white);
        ivBlue = (ImageView) view.findViewById(R.id.iv_blue);
        ivGreen = (ImageView) view.findViewById(R.id.iv_green);
        ivGray = (ImageView) view.findViewById(R.id.iv_gray);
        btnReset = (Button) view.findViewById(R.id.btn_reset);
        ivColorGameTest.setImageResource(pikachu);
        setOnClickListener();
    }

    private void setOnClickListener() {
        ivRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.RED);
                SoundManager.playColor("Màu Đỏ");

            }
        });
        ivYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.YELLOW);
                SoundManager.playColor("Màu Vàng");

            }
        });
        ivCyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.CYAN);
                SoundManager.playColor("Màu Xanh Da Trời");
            }
        });
        ivBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.BLACK);
                Log.d("ahihi", "ahihi");
                SoundManager.playColor("Màu Đen");

            }
        });
        ivWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.WHITE);
                SoundManager.playColor("Màu Trắng");

            }
        });
        ivBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.BLUE);
                SoundManager.playColor("Màu Xanh Dương");

            }
        });
        ivGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.GREEN);
                SoundManager.playColor("Màu Xanh Lá Cây");
            }
        });
        ivGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(android.graphics.Color.GRAY);
                SoundManager.playColor("Màu Nâu");
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivColorGameTest.setImageResource(pikachu);

            }
        });
    }

    public void changeColor(int colorCode){
        try {
            Bitmap image = BitmapFactory.decodeStream(getActivity().getAssets().open("images/" + "pikachu.png"));
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
            ivColorGameTest.setImageBitmap(b);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
