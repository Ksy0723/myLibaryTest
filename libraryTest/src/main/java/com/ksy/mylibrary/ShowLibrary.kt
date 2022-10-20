package com.ksy.mylibrary

import android.content.Context
import android.widget.Toast

class ShowLibrary {
    companion object{

        private fun sToast(context: Context, msg : String) = Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()

        private fun lToast(context: Context, msg : String) = Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
    }
}