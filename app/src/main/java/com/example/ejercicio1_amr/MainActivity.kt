package com.example.ejercicio1_amr

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio1_amr.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun click(view: View) {
        when(view.id){
            R.id.ver->{
                if( binding.nombre.text.isNotEmpty()){
                    val nom = binding.nombre.text.toString()
                }else{
                    Toast.makeText(this@MainActivity,resources.getString(R.string.ingresa_valor), Toast.LENGTH_SHORT).show()
                    binding.nombre.error= resources.getString(R.string.se_requiere_nombre)
                }
                if( binding.apellidop.text.isNotEmpty()){
                    val ape = binding.apellidop.text.toString()
                }else{
                    Toast.makeText(this@MainActivity,resources.getString(R.string.ingresa_valor), Toast.LENGTH_SHORT).show()
                    binding.apellidop.error= resources.getString(R.string.se_requiere_apellido)
                }

            }

            R.id.esp -> {
                setLocale("es")
            }

            R.id.ing -> {
                setLocale("en")
            }
        }

    }

   fun setLocale(codigoIdioma: String){
        val config = resources.configuration
        val locale = Locale(codigoIdioma)
        Locale.setDefault(locale)

        config.setLocale(locale)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            createConfigurationContext(config)

        resources.updateConfiguration(config, resources.displayMetrics)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
