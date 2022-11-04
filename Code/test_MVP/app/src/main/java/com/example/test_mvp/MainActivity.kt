package com.example.test_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test_mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Presenter.View {

    private lateinit var binding: ActivityMainBinding
    val pre: Presenter = PlusPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // 사용자가 버튼을 클릭하는 액션 시작!
        binding.btnPlus.setOnClickListener {
            // view는 액션에 맞는 데이터를 presenter에 요청
            pre.getData()
        }
    }

    // 마지막으로 view는 전달받는 데이터로 UI 갱신
    override fun setDataInTextView(data: String) {
        binding.tvName.text = data
    }
}