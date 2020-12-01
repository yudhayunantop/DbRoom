package com.example.dbroom

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDao){

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
    suspend fun deleteALL(){
        wordDao.deleteAll()
    }
}