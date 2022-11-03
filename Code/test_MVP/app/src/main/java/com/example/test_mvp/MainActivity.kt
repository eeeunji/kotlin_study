package com.example.test_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test_mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {

    private lateinit var binding: ActivityMainBinding
    private val data:MutableList<Data> = mutableListOf()
    private var adapter: Adapter? = null
    private var present: PlusPresenter = PlusPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        adapter = Adapter()
        adapter!!.listData = data
        binding.reView.adapter = adapter
        binding.reView.layoutManager = LinearLayoutManager(this)

        binding.btnPlus.setOnClickListener{
            present.addEunji()
        }
    }

    override fun setTotal(total: Int) {
        binding.tvTotal.text = "은지는 $total 명"
    }

    override fun setName(name: String) {
    }

}