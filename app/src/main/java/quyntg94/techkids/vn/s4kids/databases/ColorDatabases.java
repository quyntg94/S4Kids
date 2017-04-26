package quyntg94.techkids.vn.s4kids.databases;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

import quyntg94.techkids.vn.s4kids.models.Color;
import quyntg94.techkids.vn.s4kids.models.Letter;

/**
 * Created by quyntg94 on 25/04/2017.
 */

public class ColorDatabases extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "letter.db";
    private static final int DATABASE_VERSION = 1;

    private static final String COLOR_NAME = "name";
    private static final String COLOR_SOUND = "sound";

    private static final String[] COLOR_ALL_COLUMNS = new String[]{
            COLOR_NAME,
            COLOR_SOUND,
    };

    public ColorDatabases(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public List<Color> loadAllColor(){

        List<Color> colors = new ArrayList<>();
        //get readable database
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        //query ==> cursor
        Cursor cursor = sqLiteDatabase.query("tbl_color", COLOR_ALL_COLUMNS, null, null, null, null, null);

        //go through row
        while (cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex(COLOR_NAME));
            String sound = cursor.getString(cursor.getColumnIndex(COLOR_SOUND));

            Color color = new Color(name, sound);
            colors.add(color);


        }
        return colors;
    }
}
