package com.two.anchuinse.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Matt on 3/11/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected CrimeListFragment createFragment() {
        return new CrimeListFragment();
    }
}
