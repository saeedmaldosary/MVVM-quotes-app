package com.example.mvvm.data

//QuoteRepository is mediator between database and view model
class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {


    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()

    companion object {
        @Volatile
        private var instance: QuoteRepository? = null

        fun getInstance(quoteDao: FakeQuoteDao) =
            // this mean companion object
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(quoteDao).also { instance = it }

            }
    }
}