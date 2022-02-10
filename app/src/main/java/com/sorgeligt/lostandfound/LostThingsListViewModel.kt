package com.sorgeligt.lostandfound

import androidx.lifecycle.ViewModel

class LostThingsListViewModel : ViewModel() {
    val thingsList = mutableListOf<LostThing>()

    init {
        for (i in 1..100) {
            val lostThing = LostThing()
            lostThing.thingName = "Thing $i"
            lostThing.isSolved = i % 2 == 0
            thingsList += lostThing
        }
    }
}