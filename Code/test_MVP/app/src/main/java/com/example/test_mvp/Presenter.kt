package com.example.test_mvp

interface Presenter {
    fun getData()

    interface View {
        fun setDataInTextView(data: String)
    }
}