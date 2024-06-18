package com.example.puffandpoof

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.puffandpoof.model.Doll

@Dao
interface DollDao {

    @Insert
    fun insertDolls(dolls: List<Doll>)

    @Query("SELECT * FROM doll")
    fun getAllDolls(): LiveData<List<Doll>>

    @Query("DELETE FROM doll")
    fun deleteAllDolls()
}






