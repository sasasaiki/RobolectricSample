package net.rensyuu.robolectricsample

import android.os.Build
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class,sdk = [(Build.VERSION_CODES.LOLLIPOP)])
class ExampleUnitTest {
    @Test
    fun hello_world_isCorrect() {
        val activity = Robolectric.setupActivity(MainActivity::class.java!!)
        val textView = activity.main_text
        activity.fab.performClick()
        assertEquals(textView.text,"Hello World!")
    }
}

