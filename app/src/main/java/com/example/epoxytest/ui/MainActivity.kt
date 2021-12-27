package com.example.epoxytest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.epoxytest.databinding.ActivityMainBinding
import com.example.epoxytest.model.InfoData
import com.example.epoxytest.ui.epoxy.MainController1
import com.example.epoxytest.ui.epoxy.MainController2

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainController1 = MainController1()
        binding.epoxyRecyclerViewMain1.adapter = mainController1.adapter
        mainController1.setData(InfoData.fakeDataList)

        val mainController2 = MainController2()
        binding.epoxyRecyclerViewMain2.adapter = mainController2.adapter
        mainController2.setData(InfoData.fakeDataList)
    }
}