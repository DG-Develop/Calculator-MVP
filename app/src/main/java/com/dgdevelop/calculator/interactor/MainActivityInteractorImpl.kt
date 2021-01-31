package com.dgdevelop.calculator.interactor

import com.dgdevelop.calculator.presenter.MainActivityPresenter
import java.lang.Exception

class MainActivityInteractorImpl(
    private val presenter: MainActivityPresenter
) : MainActivityInteractor {

    override fun sumar(number1: Int, number2: Int) {
        try {
            val result = number1 + number2
            presenter.showResult(result.toString())
        }catch (e: Exception){
            presenter.showError(e.message!!)
        }
    }
}