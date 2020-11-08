package com.marinagosson.snowmanlabs.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FAQ(
    @PrimaryKey var uid: Int?,
    @ColumnInfo( name = "question" ) val question: String,
    @ColumnInfo( name = "anwser" ) val anwser: String,
    @ColumnInfo( name = "color" ) val color: Int,
)