package au.com.pjwin.imageloaddemo

import android.app.Application
import au.com.pjwin.commonlib.Common
import au.com.pjwin.imageloaddemo.util.CommonConfig

open class ImageDemoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initCommon()
    }

    protected open fun initCommon() {
        Common.init(applicationContext, CommonConfig(), false)
    }
}