package quyntg94.techkids.vn.s4kids.databases;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

import quyntg94.techkids.vn.s4kids.models.Letter;

/**
 * Created by quyntg94 on 19/04/2017.
 */

public class KidsDatabases extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "letter.db";
    private static final int DATABASE_VERSION = 1;

    private static final String KID_NAME = "name";
    private static final String KID_IMAGE1 = "image1";
    private static final String KID_IMAGE2 = "image2";
    private static final String KID_LETTER1 = "letter1";
    private static final String KID_LETTER2 = "letter2";
    private static final String KID_SOUND = "sound";
    private static final String KID_SOUND1 = "sound1";
    private static final String KID_SOUND2 = "sound2";
    private static final String KID_CHECK = "isCheck";
    private static final String KID_ID = "id";
    private static final String KID_SUBNAME = "subName";



    private static final String[] KID_ALL_COLUMNS = new String[]{
            KID_NAME,
            KID_IMAGE1,
            KID_IMAGE2,
            KID_LETTER1,
            KID_LETTER2,
            KID_SOUND,
            KID_SOUND1,
            KID_SOUND2,
            KID_CHECK,
            KID_ID,
            KID_SUBNAME
    };

    public KidsDatabases(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public List<Letter> loadAllLetter(){

        List<Letter> letters = new ArrayList<>();
        //get readable database
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        //query ==> cursor
        Cursor cursor = sqLiteDatabase.query("tbl_letter", KID_ALL_COLUMNS, null, null, null, null, null);

        //go through row
        while (cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex(KID_NAME));
            String image1 = cursor.getString(cursor.getColumnIndex(KID_IMAGE1));
            String image2 = cursor.getString(cursor.getColumnIndex(KID_IMAGE2));
            String letter1 = cursor.getString(cursor.getColumnIndex(KID_LETTER1));
            String letter2 = cursor.getString(cursor.getColumnIndex(KID_LETTER2));
            String sound = cursor.getString(cursor.getColumnIndex(KID_SOUND));
            String sound1 = cursor.getString(cursor.getColumnIndex(KID_SOUND1));
            String sound2 = cursor.getString(cursor.getColumnIndex(KID_SOUND2));
            boolean isCheck = cursor.getInt(cursor.getColumnIndex(KID_CHECK)) != 0;
            int id = cursor.getInt(cursor.getColumnIndex(KID_ID));
            String subName = cursor.getString(cursor.getColumnIndex(KID_SUBNAME));

            Letter letter = new Letter(name, image1, image2, letter1, letter2, sound, sound1, sound2, isCheck, id, subName);
            letters.add(letter);


        }
        return letters;
    }

    public List<Letter> loadOnlyLetter(){

        List<Letter> letters = new ArrayList<>();
        //get readable database
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        //query ==> cursor
        Cursor cursor = sqLiteDatabase.query("tbl_letter", KID_ALL_COLUMNS, null, null, null, null, null);

        //go through row
        while (cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex(KID_NAME));
            String image1 = cursor.getString(cursor.getColumnIndex(KID_IMAGE1));
            String image2 = cursor.getString(cursor.getColumnIndex(KID_IMAGE2));
            String letter1 = cursor.getString(cursor.getColumnIndex(KID_LETTER1));
            String letter2 = cursor.getString(cursor.getColumnIndex(KID_LETTER2));
            String sound = cursor.getString(cursor.getColumnIndex(KID_SOUND));
            String sound1 = cursor.getString(cursor.getColumnIndex(KID_SOUND1));
            String sound2 = cursor.getString(cursor.getColumnIndex(KID_SOUND2));
            boolean isCheck = cursor.getInt(cursor.getColumnIndex(KID_CHECK)) != 0;
            int id = cursor.getInt(cursor.getColumnIndex(KID_ID));
            String subName = cursor.getString(cursor.getColumnIndex(KID_SUBNAME));

            Letter letter = new Letter(name, image1, image2, letter1, letter2, sound, sound1, sound2, isCheck, id, subName);
            if(!isCheck) {
                letters.add(letter);
                Log.d("fuck2", letter.toString() + "/n");
            }

        }
        return letters;
    }
}
