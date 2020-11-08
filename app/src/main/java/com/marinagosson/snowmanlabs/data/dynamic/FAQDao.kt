package com.marinagosson.snowmanlabs.data.dynamic

import androidx.room.*
import com.marinagosson.snowmanlabs.data.model.FAQ

@Dao
interface FAQDao {
    @Query("SELECT * FROM faq")
    fun getAll(): List<FAQ>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(faq: FAQ)

}