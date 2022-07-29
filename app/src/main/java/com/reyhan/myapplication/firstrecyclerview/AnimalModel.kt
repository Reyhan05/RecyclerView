package com.reyhan.myapplication.firstrecyclerview

import android.content.Context
import com.reyhan.myapplication.R

class AnimalModel(val context: Context) {
    fun getAnimalList(): Array<String> {
        return context.resources.getStringArray(R.array.animallist)
    }
}