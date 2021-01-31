package com.dgdevelop.calculator.presenter

interface MainActivityPresenter {

    fun sumar(number1: Int, number2: Int) //interactor
    fun showError(error: String) //View
    fun showResult(resultado: String)//View
}