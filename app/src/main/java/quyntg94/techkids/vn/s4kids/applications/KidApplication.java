package quyntg94.techkids.vn.s4kids.applications;

import android.app.Application;
import android.util.Log;

import java.util.List;

import quyntg94.techkids.vn.s4kids.databases.KidsDatabase;

/**
 * Created by quyntg94 on 19/04/2017.
 */

public class KidApplication extends Application {


    private KidsDatabase kidsDatabase;
    private static KidApplication instance;

    @Override
    public void onCreate() {
        kidsDatabase = new KidsDatabase(this);
        instance = this;
        super.onCreate();

    }

    public KidsDatabase getKidsDatabase(){
        return kidsDatabase;
    }

    public static KidApplication getInstance() {
        return instance;
    }
}
