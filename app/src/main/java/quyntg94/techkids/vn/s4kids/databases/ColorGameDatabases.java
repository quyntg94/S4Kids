package quyntg94.techkids.vn.s4kids.databases;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

import quyntg94.techkids.vn.s4kids.models.Color;
import quyntg94.techkids.vn.s4kids.models.ColorGame;

/**
 * Created by quyntg94 on 03/05/2017.
 */

public class ColorGameDatabases extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "letter.db";
    private static final int DATABASE_VERSION = 1;

    private static final String COLOR_IMAGE= "image";
    private static final String COLOR_ID = "id";

    private static final String[] COLOR_GAME_ALL_COLUMNS = new String[]{
            COLOR_IMAGE,
            COLOR_ID,
    };

    public ColorGameDatabases(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public List<ColorGame> loadAllColorGame(){

        List<ColorGame> colorGames = new ArrayList<>();
        //get readable database
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        //query ==> cursor
        Cursor cursor = sqLiteDatabase.query("tbl_color_game", COLOR_GAME_ALL_COLUMNS, null, null, null, null, null);

        //go through row
        while (cursor.moveToNext()){
            String image = cursor.getString(cursor.getColumnIndex(COLOR_IMAGE));
            int id = cursor.getInt(cursor.getColumnIndex(COLOR_ID));

            ColorGame colorGame = new ColorGame(image, id);
            colorGames.add(colorGame);


        }
        return colorGames;
    }
}
