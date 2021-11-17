package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
//https://github.com/UrvashiMalankar/MyLibrary.git