package com.yellowcode.roomsample.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.yellowcode.roomsample.model.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM note_table ORDER BY id ASC")
    suspend fun getAllNotes(): List<Note>

    @Query("SELECT * FROM note_table WHERE name LIKE :title")
    suspend fun findNoteByTitle(title: String): Note

    @Insert
    suspend fun insert(note: Note)

    @Delete
    suspend fun delete(note: Note)
}