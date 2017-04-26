package quyntg94.techkids.vn.s4kids.sounds;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by quyntg94 on 11/04/2017.
 */

public class SoundManager {

    public static int NUMBER_OF_ALPHABET = 29;
    public static int NUMBER_OF_LETTER = 29;
    public static int NUMBER_OF_COLOR = 8;
    public static int NUMBER_OF_NUMBER = 30;

    public static SoundPool alphabetPool = new SoundPool(NUMBER_OF_ALPHABET, AudioManager.STREAM_MUSIC, 0);
    public static SoundPool letterPool = new SoundPool(NUMBER_OF_LETTER, AudioManager.STREAM_MUSIC, 0);
    public static SoundPool colorPool = new SoundPool(NUMBER_OF_COLOR, AudioManager.STREAM_MUSIC, 0);
    public static SoundPool numberPool = new SoundPool(NUMBER_OF_NUMBER, AudioManager.STREAM_MUSIC, 0);

    public static ArrayList<Integer> alphabetList = new ArrayList<>();
    public static ArrayList<Integer> letterList = new ArrayList<>();
    public static ArrayList<Integer> colorList = new ArrayList<>();
    public static ArrayList<Integer> numberList = new ArrayList<>();

    public static void loadAlphabetInfoList(Context context){
        for(int i = 1; i <= NUMBER_OF_ALPHABET; i++){
            int resIdAlphabet = context.getResources().getIdentifier("alphabet_" + i, "raw", context.getPackageName());
            int alphabetPoolId = alphabetPool.load(context, resIdAlphabet, 1);
            alphabetList.add(alphabetPoolId);
        }
    }

    public static void loadLetterInfoList(Context context){
        for(int i = 1; i <= NUMBER_OF_LETTER; i++){
            int resIdLetter = context.getResources().getIdentifier("letter_" + i, "raw", context.getPackageName());
            int letterPoolId = letterPool.load(context, resIdLetter, 1);
            letterList.add(letterPoolId);
        }
    }

    public static void loadColorInfoList(Context context){
        for(int i = 1; i <= NUMBER_OF_COLOR; i++){
            int resIdColor = context.getResources().getIdentifier("color_" + i, "raw", context.getPackageName());
            int colorPoolId = colorPool.load(context, resIdColor, 1);
            colorList.add(colorPoolId);
        }
    }

    public static void loadNumberInfoList(Context context){
        for(int i = 1; i <= NUMBER_OF_NUMBER; i++){
            int resIdNumber = context.getResources().getIdentifier("number_" + i, "raw", context.getPackageName());
            int numberPoolId = numberPool.load(context, resIdNumber, 1);
            numberList.add(numberPoolId);
        }
    }

    static HashMap<String, Integer> listNumberID =  new HashMap<>();

    static {
        listNumberID.put("0", 0);
        listNumberID.put("1", 1);
        listNumberID.put("2", 2);
        listNumberID.put("3", 3);
        listNumberID.put("4", 4);
        listNumberID.put("5", 5);
        listNumberID.put("6", 6);
        listNumberID.put("7", 7);
        listNumberID.put("8", 8);
        listNumberID.put("9", 9);

        listNumberID.put("Số Không", 10);
        listNumberID.put("Số Mười", 11);
        listNumberID.put("Số Một", 12);
        listNumberID.put("Mười Một", 13);
        listNumberID.put("Số Hai", 14);
        listNumberID.put("Mười Hai", 15);
        listNumberID.put("Số Ba", 16);
        listNumberID.put("Mười Ba", 17);
        listNumberID.put("Số Bốn", 18);
        listNumberID.put("Mười Bốn", 19);
        listNumberID.put("Số Năm", 20);
        listNumberID.put("Mười Năm", 21);
        listNumberID.put("Số Sáu", 22);
        listNumberID.put("Mười Sáu", 23);
        listNumberID.put("Số Bảy", 24);
        listNumberID.put("Mười Bảy", 25);
        listNumberID.put("Số Tám", 26);
        listNumberID.put("Mười Tám", 27);
        listNumberID.put("Số Chín", 28);
        listNumberID.put("Mười Chín", 29);
    }

    static HashMap<String, Integer> listColorID =  new HashMap<>();

    static {
        listColorID.put("Màu Đỏ", 0);
        listColorID.put("Màu Vàng", 1);
        listColorID.put("Màu Nâu", 2);
        listColorID.put("Màu Xanh Da Trời", 3);
        listColorID.put("Màu Đen", 4);
        listColorID.put("Màu Trắng", 5);
        listColorID.put("Màu Xanh Dương", 6);
        listColorID.put("Màu Xanh Lá Cây", 7);
    }

    static HashMap<String, Integer> listAlphabetID =  new HashMap<>();

    static {
        listAlphabetID.put("A", 0);
        listAlphabetID.put("Ă", 1);
        listAlphabetID.put("Â", 2);
        listAlphabetID.put("B", 3);
        listAlphabetID.put("C", 4);
        listAlphabetID.put("D", 5);
        listAlphabetID.put("Đ", 6);
        listAlphabetID.put("E", 7);
        listAlphabetID.put("Ê", 8);
        listAlphabetID.put("G", 9);
        listAlphabetID.put("H", 10);
        listAlphabetID.put("I", 11);
        listAlphabetID.put("K", 12);
        listAlphabetID.put("L", 13);
        listAlphabetID.put("M", 14);
        listAlphabetID.put("N", 15);
        listAlphabetID.put("O", 16);
        listAlphabetID.put("Ô", 17);
        listAlphabetID.put("Ơ", 18);
        listAlphabetID.put("P", 19);
        listAlphabetID.put("Q", 20);
        listAlphabetID.put("R", 21);
        listAlphabetID.put("S", 22);
        listAlphabetID.put("T", 23);
        listAlphabetID.put("U", 24);
        listAlphabetID.put("Ư", 25);
        listAlphabetID.put("V", 26);
        listAlphabetID.put("X", 27);
        listAlphabetID.put("Y", 28);
    }

        static HashMap<String, Integer> listLetterID =  new HashMap<>();

    static{
        listLetterID.put("Quả Táo", 0);
        listLetterID.put("Con Cá", 1);
        listLetterID.put("Mặt Trăng", 2);
        listLetterID.put("Gói Tăm", 3);
        listLetterID.put("Cái Cân", 4);
        listLetterID.put("Múa Lân", 5);
        listLetterID.put("Quả Bóng", 6);
        listLetterID.put("Bánh Mì", 7);
        listLetterID.put("Con Chó", 8);
        listLetterID.put("Bút Chì", 9);
        listLetterID.put("Con Dê", 10);
        listLetterID.put("Quả Dâu", 11);
        listLetterID.put("Đu Đủ", 12);
        listLetterID.put("Đà Điểu", 13);
        listLetterID.put("Quả Me", 14);
        listLetterID.put("Thước Kẻ", 15);
        listLetterID.put("Củ Nghệ", 16);
        listLetterID.put("Quả Lê", 17);
        listLetterID.put("Gà Trống", 18);
        listLetterID.put("Cái Ghế", 19);
        listLetterID.put("Hoa Hồng", 20);
        listLetterID.put("Con Hổ", 21);
        listLetterID.put("Quả Thị", 22);
        listLetterID.put("Tivi", 23);
        listLetterID.put("Kẹo Mút", 24);
        listLetterID.put("Con Khỉ", 25);
        listLetterID.put("Lá Cờ", 26);
        listLetterID.put("Con Lợn", 27);
        listLetterID.put("Con Mèo", 28);
        listLetterID.put("Máy Tính", 29);
        listLetterID.put("Cây Nấm", 30);
        listLetterID.put("Con Nai", 31);
        listLetterID.put("Chùm Nho", 32);
        listLetterID.put("Con Ong", 33);
        listLetterID.put("Cái Ô", 34);
        listLetterID.put("Ô Tô", 35);
        listLetterID.put("Bơ", 36);
        listLetterID.put("Cái Nơ", 37);
        listLetterID.put("Tô Phở", 38);
        listLetterID.put("Đèn Pin", 39);
        listLetterID.put("Hộp Quà", 40);
        listLetterID.put("Cái Quạt", 41);
        listLetterID.put("Bó Rau", 42);
        listLetterID.put("Con Rắn", 43);
        listLetterID.put("Sư Tử", 44);
        listLetterID.put("Con Sâu", 45);
        listLetterID.put("Quả Táo", 46);
        listLetterID.put("Cái Tủ", 47);
        listLetterID.put("Đu Đủ", 48);
        listLetterID.put("Xe Lu", 49);
        listLetterID.put("Hộp Thư", 50);
        listLetterID.put("Lọ Mực", 51);
        listLetterID.put("Vải Thiều", 52);
        listLetterID.put("Con Voi", 53);
        listLetterID.put("Xe Đạp", 54);
        listLetterID.put("Cái Xẻng", 55);
        listLetterID.put("Chim Yến", 56);
        listLetterID.put("Hoa Ly", 57);


    }

    public static void playAlphabet(String string){
        alphabetPool.play(alphabetList.get(listAlphabetID.get(string)), 5.0f, 5.0f, 1, 0, 1.0f);
    }

    public static void playLetter(String string){
        letterPool.play(letterList.get(listLetterID.get(string)), 5.0f, 5.0f, 1, 0, 1.0f);
    }

    public static void playColor(String string){
        colorPool.play(colorList.get(listColorID.get(string)), 5.0f, 5.0f, 1, 0, 1.0f);
    }

    public static void playNumber(String string){
        numberPool.play(numberList.get(listNumberID.get(string)), 5.0f, 5.0f, 1, 0, 1.0f);
    }
}

