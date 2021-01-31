package com.dgdevelop.calculator.presenter

import com.dgdevelop.calculator.interactor.MainActivityInteractor
import com.dgdevelop.calculator.interactor.MainActivityInteractorImpl
import com.dgdevelop.calculator.view.MainActivityView

class MainActivityPresenterImpl(
    private val activityView: MainActivityView
) : MainActivityPresenter {
    private val interactor: MainActivityInteractor = MainActivityInteractorImpl(this)


    override fun sumar(number1: Int, number2: Int) {
        interactor.sumar(number1, number2)
    }

    override fun showError(error: String) = activityView.showError(error)

    override fun showResult(resultado: String) = activityView.showResult(resultado)
}