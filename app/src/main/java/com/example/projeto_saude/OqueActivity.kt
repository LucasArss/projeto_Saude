package com.example.projeto_saude

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projeto_saude.databinding.ActivityOqueBinding

class OqueActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOqueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOqueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }
    }
