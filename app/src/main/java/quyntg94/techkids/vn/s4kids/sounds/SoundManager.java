package quyntg94.techkids.vn.s4kids.sounds;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import quyntg94.techkids.vn.s4kids.applications.KidApplication;
import quyntg94.techkids.vn.s4kids.databases.KidsDatabase;
import quyntg94.techkids.vn.s4kids.models.Letter;

/**
 * Created by quyntg94 on 11/04/2017.
 */

public class SoundManager {

    public static int NUMBER_OF_NOTE = 97;
    public static SoundPool soundPool = new SoundPool(NUMBER_OF_NOTE, AudioManager.STREAM_MUSIC, 0);

    public static ArrayList<Integer> soundList = new ArrayList<>();

    public static void loadSoundInfoList(Context context){
        for(int i = 1; i <= NUMBER_OF_NOTE; i++){
            int resIdSound = context.getResources().getIdentifier("sound_" + i, "raw", context.getPackageName());
            int soundPoolId = soundPool.load(context, resIdSound, 1);
            soundList.add(soundPoolId);
        }
    }

    static HashMap<String, Integer> listSoundID =  new HashMap<>();

    static{
        listSoundID.put("A", 0);
        listSoundID.put("Ă", 1);
        listSoundID.put("Â", 2);
        listSoundID.put("B", 3);
        listSoundID.put("C", 4);
        listSoundID.put("D", 5);
        listSoundID.put("Đ", 6);
        listSoundID.put("E", 7);
        listSoundID.put("Ê", 8);
        listSoundID.put("G", 9);
        listSoundID.put("H", 10);
        listSoundID.put("I", 11);
        listSoundID.put("K", 12);
        listSoundID.put("L", 13);
        listSoundID.put("M", 14);
        listSoundID.put("N", 15);
        listSoundID.put("O", 16);
        listSoundID.put("Ô", 17);
        listSoundID.put("Ơ", 18);
        listSoundID.put("P", 19);
        listSoundID.put("Q", 20);
        listSoundID.put("R", 21);
        listSoundID.put("S", 22);
        listSoundID.put("T", 23);
        listSoundID.put("U", 24);
        listSoundID.put("Ư", 25);
        listSoundID.put("V", 26);
        listSoundID.put("X", 27);
        listSoundID.put("Y", 28);
        listSoundID.put("0", 29);
        listSoundID.put("1", 30);
        listSoundID.put("2", 31);
        listSoundID.put("3", 32);
        listSoundID.put("4", 33);
        listSoundID.put("5", 34);
        listSoundID.put("6", 35);
        listSoundID.put("7", 36);
        listSoundID.put("8", 37);
        listSoundID.put("9", 38);
        listSoundID.put("Quả Táo", 39);
        listSoundID.put("Con Cá", 40);
        listSoundID.put("Mặt Trăng", 41);
        listSoundID.put("Gói Tăm", 42);
        listSoundID.put("Cái Cân", 43);
        listSoundID.put("Múa Lân", 44);
        listSoundID.put("Quả Bóng", 45);
        listSoundID.put("Bánh Mì", 46);
        listSoundID.put("Con Chó", 47);
        listSoundID.put("Bút Chì", 48);
        listSoundID.put("Con Dê", 49);
        listSoundID.put("Quả Dâu", 50);
        listSoundID.put("Đu Đủ", 51);
        listSoundID.put("Đà Điểu", 52);
        listSoundID.put("Quả Me", 53);
        listSoundID.put("Thước Kẻ", 54);
        listSoundID.put("Củ Nghệ", 55);
        listSoundID.put("Quả Lê", 56);
        listSoundID.put("Gà Trống", 57);
        listSoundID.put("Cái Ghế", 58);
        listSoundID.put("Hoa Hồng", 59);
        listSoundID.put("Con Hổ", 60);
        listSoundID.put("Quả Thị", 61);
        listSoundID.put("Tivi", 62);
        listSoundID.put("Kẹo Mút", 63);
        listSoundID.put("Con Khỉ", 64);
        listSoundID.put("Lá Cờ", 65);
        listSoundID.put("Con Lợn", 66);
        listSoundID.put("Con Mèo", 67);
        listSoundID.put("Máy Tính", 68);
        listSoundID.put("Cây Nấm", 69);
        listSoundID.put("Con Nai", 70);
        listSoundID.put("Chùm Nho", 71);
        listSoundID.put("Con Ong", 72);
        listSoundID.put("Cái Ô", 73);
        listSoundID.put("Ô Tô", 74);
        listSoundID.put("Bơ", 75);
        listSoundID.put("Cái Nơ", 76);
        listSoundID.put("Tô Phở", 77);
        listSoundID.put("Đèn Pin", 78);
        listSoundID.put("Hộp Quà", 79);
        listSoundID.put("Cái Quạt", 80);
        listSoundID.put("Bó Rau", 81);
        listSoundID.put("Con Rắn", 82);
        listSoundID.put("Sư Tử", 83);
        listSoundID.put("Con Sâu", 84);
        listSoundID.put("Quả Táo", 85);
        listSoundID.put("Cái Tủ", 86);
        listSoundID.put("Đu Đủ", 87);
        listSoundID.put("Xe Lu", 88);
        listSoundID.put("Hộp Thư", 89);
        listSoundID.put("Lọ Mực", 90);
        listSoundID.put("Vải Thiều", 91);
        listSoundID.put("Con Voi", 92);
        listSoundID.put("Xe Đạp", 93);
        listSoundID.put("Cái Xẻng", 94);
        listSoundID.put("Chim Yến", 95);
        listSoundID.put("Hoa Ly", 96);

    }


    public static void playSound(String string){
        soundPool.play(soundList.get(listSoundID.get(string)), 5.0f, 5.0f, 1, 0, 1.0f);
    }
}
