package com.proyectoArgProg.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.proyectoArgProg.myapplication.MVVM.MainViewModel
import com.proyectoArgProg.myapplication.databinding.ActivityMainBinding
import androidx.lifecycle.Observer

import androidx.activity.viewModels as viewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel : MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.button.setOnClickListener {

           val texto1 = binding.editText1.text.toString()
           val texto2 = binding.editText2.text.toString()
           viewModel.compareStrings(texto1, texto2)

       }
        viewModel.resultado.observe(this, Observer { resultado ->
            binding.textView2.text = resultado
        })
    }

}













