package org.autojs.autojs.ui.main.components

import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import org.autojs.autojs.ui.log.LogActivityKt
import org.autojs.autoxjs.R

//主界面日志按钮
@Composable
fun LogButton() {
    val context = LocalContext.current
    IconButton(onClick = { LogActivityKt.start(context) }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_logcat),
            contentDescription = stringResource(id = R.string.text_logcat)
        )
    }
}