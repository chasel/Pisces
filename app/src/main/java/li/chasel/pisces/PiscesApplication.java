package li.chasel.pisces;

import android.app.Application;
import android.content.Context;

import com.morgoo.droidplugin.PluginHelper;

/**
 * @Author Chasel Li
 * @Date 2016-03-15 10:44
 */
public class PiscesApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        PluginHelper.getInstance().applicationOnCreate(getBaseContext());
    }

    @Override
    protected void attachBaseContext(Context base) {
        PluginHelper.getInstance().applicationAttachBaseContext(base);
        super.attachBaseContext(base);
    }


}
