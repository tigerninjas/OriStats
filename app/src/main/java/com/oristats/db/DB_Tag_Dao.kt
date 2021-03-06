package com.oristats.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DB_Tag_Dao {
    @Query("SELECT * FROM tag_table")
    fun getAll(): LiveData<List<DB_Tag_Entity>>

    @Query("SELECT * FROM tag_table WHERE id IN (:tag_ids)")
    fun loadAllByIds(tag_ids: IntArray): LiveData<List<DB_Tag_Entity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(db_Tag_entity: DB_Tag_Entity) : Long

    @Query("DELETE FROM tag_table")
    suspend fun deleteAll()
}