package com.example.projeto_saude

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projeto_saude.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOq.setOnClickListener{
            startActivity(Intent(this, OqueActivity::class.java))
        }
        binding.btnSintomas.setOnClickListener{
            startActivity(Intent(this, Sintomas_Activity::class.java))
        }
        binding.btnTransmisao.setOnClickListener{
            startActivity(Intent(this, TransmissaoActivity::class.java))
        }
        binding.btnDiagnostico.setOnClickListener{
            startActivity(Intent(this, DiagnosticoActivity::class.java))
        }
        binding.bntTratamento.setOnClickListener{
            startActivity(Intent(this, TratamentoActivity::class.java))
        }
        binding.bntSobre.setOnClickListener{
            startActivity(Intent(this, SobreActivity::class.java))
        }

    }


    }


