package com.example.mvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvm.data.Quote
import com.example.mvvm.data.QuoteRepository

//this class will inherit view model
class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}