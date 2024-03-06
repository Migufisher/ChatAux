package org.autojs.autojs.doit

import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Toast
import com.stardust.autojs.core.accessibility.AccessibilityService
import com.stardust.toast

class Chat :AccessibilityService(){
    override fun onInterrupt() {
    }
    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        super.onAccessibilityEvent(event)
    }
    fun click() {
        val mNodeInfo = windows

        var pass = mNodeInfo

    }
}