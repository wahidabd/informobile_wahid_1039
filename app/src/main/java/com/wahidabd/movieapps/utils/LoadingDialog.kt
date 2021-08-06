package com.wahidabd.movieapps.utils

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import androidx.core.graphics.drawable.toDrawable
import com.wahidabd.movieapps.R

class LoadingDialog {
    private var dialog: Dialog? = null

    fun startDialog(context: Context){
        dialog = setLoading(context)
    }

    fun dismissLoading() {
        dialog?.let {
            if (it.isShowing) it.cancel()
        }
    }

    private fun setLoading(context: Context): Dialog{

        val dialog = Dialog(context)

        dialog.let {
            it.show()
            it.window?.setBackgroundDrawable(Color.TRANSPARENT.toDrawable())
            it.setContentView(R.layout.custom_dialog)
            it.setCancelable(false)
            it.setCanceledOnTouchOutside(false)
            return it
        }
    }
}