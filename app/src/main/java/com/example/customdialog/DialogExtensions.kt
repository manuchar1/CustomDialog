package com.example.customdialog

import android.app.Activity
import android.app.Dialog
import android.view.Window
import android.view.WindowManager
import com.example.customdialog.databinding.CustomDialogBinding

fun Activity.showDialog() {
    val dialog = Dialog(this)
    dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
    dialog.window!!.requestFeature(Window.FEATURE_NO_TITLE)
    val dialogBinding = CustomDialogBinding.inflate(layoutInflater)

    val params = dialog.window!!.attributes
    params.width = WindowManager.LayoutParams.MATCH_PARENT
    params.height = WindowManager.LayoutParams.WRAP_CONTENT
    dialog.setContentView(dialogBinding.root)
    dialogBinding.btnContinue.setOnClickListener {
        dialog.cancel()
    }
    dialog.show()
}