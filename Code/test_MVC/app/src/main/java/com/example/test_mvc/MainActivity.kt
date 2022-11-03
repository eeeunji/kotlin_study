package com.example.test_mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test_mvc.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val data:MutableList<Data> = mutableListOf()
    private var adapter: Adapter? = null
    var t = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // view: UI
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // controller: 클릭에 따라 model 수 증가, 변경에 따라 view 갱신
        adapter = Adapter()
        adapter!!.listData = data
        binding.reView.adapter = adapter
        binding.reView.layoutManager = LinearLayoutManager(this)

        binding.btnPlus.setOnClickListener{
            val string = "은지"
            t++
            data.add(Data(string, t))
            binding.tvTotal.text = "은지는 $t 명"
            adapter?.notifyDataSetChanged()
        }
    }

}