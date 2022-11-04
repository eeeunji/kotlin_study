package com.example.test_mvp

class PlusPresenter (val view: Presenter.View) : Presenter {
    val model: Data = Data()

    // presenter는 모델에 데이터를 요청, 응답받고 view에 데이터 전달함
    override fun getData() {
        view.setDataInTextView(model.getData())
    }
}