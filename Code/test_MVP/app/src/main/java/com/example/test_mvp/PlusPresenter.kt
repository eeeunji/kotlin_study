package com.example.test_mvp


class PlusPresenter(
    private var view: View,
    private var t: Int = 0
) : Presenter {

    override fun addEunji() {
        t++
        view.setTotal(t)
        view.setName("은지")
    }
}