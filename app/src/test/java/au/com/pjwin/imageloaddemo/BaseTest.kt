package au.com.pjwin.imageloaddemo

import android.support.annotation.CallSuper
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.robolectric.annotation.Config

@RunWith(AppTestRunner::class)
@Config(constants = BuildConfig::class, application = TestImageDemoApp::class)
open class BaseTest {

    @CallSuper
    open fun setup() {
        MockitoAnnotations.initMocks(this)
    }
}