package au.com.pjwin.imageloaddemo

import au.com.pjwin.commonlib.Common
import au.com.pjwin.imageloaddemo.util.CommonConfig

class TestImageDemoApp : ImageDemoApp() {

    override fun initCommon() {
        //todo TestCommonConfig
        Common.init(applicationContext, CommonConfig(), true)
    }
}