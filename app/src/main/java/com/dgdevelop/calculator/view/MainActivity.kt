package com.dgdevelop.calculator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dgdevelop.calculator.R
import com.dgdevelop.calculator.presenter.MainActivityPresenter
import com.dgdevelop.calculator.presenter.MainActivityPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityView{

    private lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenterImpl(this)
    }

    fun suma(view: View){
        val number1 =  etNumber1.text.toString().toInt()
        val number2 =  etNumber2.text.toString().toInt()
        presenter.sumar(number1, number2)
    }

    override fun showResult(result: String) {
        tvResult.text = result
    }

    override fun showError(error: String) {
        tvResult.text = error
    }
}