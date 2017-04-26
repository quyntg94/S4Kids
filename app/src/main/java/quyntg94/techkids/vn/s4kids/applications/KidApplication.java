package quyntg94.techkids.vn.s4kids.applications;

import android.app.Application;

import quyntg94.techkids.vn.s4kids.databases.ColorDatabases;
import quyntg94.techkids.vn.s4kids.databases.KidsDatabases;

/**
 * Created by quyntg94 on 19/04/2017.
 */

public class KidApplication extends Application {

    private ColorDatabases colorDatabases;
    private KidsDatabases kidsDatabases;
    private static KidApplication instance;

    @Override
    public void onCreate() {
        colorDatabases = new ColorDatabases(this);
        kidsDatabases = new KidsDatabases(this);
        instance = this;
        super.onCreate();

    }

    public KidsDatabases getKidsDatabases(){
        return kidsDatabases;
    }

    public ColorDatabases getColorDatabases() {
        return colorDatabases;
    }

    public static KidApplication getInstance() {
        return instance;
    }
}
