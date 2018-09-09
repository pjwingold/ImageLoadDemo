package au.com.pjwin.imageloaddemo.ui

import android.os.Bundle
import au.com.pjwin.commonlib.ui.ViewActivity

class MainActivity : ViewActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            showFragment(PhotoListFragment.newInstance())
        }
    }
}
