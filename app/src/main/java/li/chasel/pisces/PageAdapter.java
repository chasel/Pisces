package li.chasel.pisces;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * @Author Chasel Li
 * @Date 2016-03-15 11:03
 */
public class PageAdapter extends FragmentStatePagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new InstalledFragment();
        } else {
            return new ApkFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "已安装";
        } else {
            return "待安装";
        }
    }
}
