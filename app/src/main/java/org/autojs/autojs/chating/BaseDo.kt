package org.autojs.autojs.chating

import android.content.Context
import com.stardust.autojs.core.image.ImageWrapper
import com.stardust.autojs.core.image.capture.ScreenCaptureManager
import com.stardust.autojs.core.image.capture.ScreenCaptureRequester
import com.stardust.autojs.core.image.capture.ScreenCapturer
import kotlinx.coroutines.runBlocking
import com.stardust.autojs.runtime.api.Images
import org.eclipse.egit.github.core.Application

class BaseDo() {
    private lateinit var mContext: Context
    private val images:Images? = null
    private val mScreenCaptureRequester: ScreenCaptureRequester = ScreenCaptureManager()
    @Synchronized
    fun captureScreen(): ImageWrapper {
        val screenCapture = mScreenCaptureRequester.screenCapture
        checkNotNull(screenCapture) { SecurityException("No screen capture permission") }
        return runBlocking {
            screenCapture.captureImageWrapper()
        }
    }

//    suspend fun requestScreentMe(): Boolean = runBlocking{
//////        val ScreenCapturer = ScreenCapturer
//        var orientation = ScreenCapturer.ORIENTATION_PORTRAIT
////        return images?.requestScreenCapture(orientation)
//
////        return mScreenCaptureRequester.requestScreenCapture(mContext, orientation)
//        return@runBlocking runCatching {
//            mScreenCaptureRequester.requestScreenCapture(
//                mContext, orientation
//            )
//            captureScreen()
//        }.isSuccess
//
//    }

    suspend fun requestScreentMe(){
        var orientation = ScreenCapturer.ORIENTATION_PORTRAIT
        mScreenCaptureRequester.requestScreenCapture(mContext, orientation)
    }
}