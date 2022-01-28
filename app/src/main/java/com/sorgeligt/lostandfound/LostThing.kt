package com.sorgeligt.lostandfound

import java.util.*

data class LostThing(
    val id: UUID = UUID.randomUUID(),
    var thingName: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
)