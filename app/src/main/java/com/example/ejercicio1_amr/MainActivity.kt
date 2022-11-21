package com.example.ejercicio1_amr

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio1_amr.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun click(view: View) {
        when (view.id) {
            R.id.ver -> {

                //val di3 = binding.dia.text.toString().toInt()
                //val me3 = binding.mes.text.toString().toInt()
                //val an3 = binding.anio.text.toString()
                //val dit2 = binding.dia.text.toString()
                //val met2 = binding.mes.text.toString()
                //val tamdi2 = dit2.length
                //val tamme2 = met2.length
                //val cuen2 = binding.cuenta.text.toString()
                //val taman2 = an3.length
                //val tam_cuen2 = cuen2.length

                if (binding.nombre.text.isNotEmpty() && binding.apellidop.text.isNotEmpty() && binding.dia.text.isNotEmpty() && binding.mes.text.isNotEmpty() && binding.anio.text.isNotEmpty() && binding.cuenta.text.isNotEmpty() && binding.correo.text.isNotEmpty()) {
                    val nom = binding.nombre.text.toString()
                    val apep = binding.apellidop.text.toString()
                    val apem = binding.apellidom.text.toString()
                    val di = binding.dia.text.toString()
                    val me = binding.mes.text.toString()
                    val an = binding.anio.text.toString()
                    val cuent = binding.cuenta.text.toString()
                    val correo = binding.correo.text.toString()
                    val nomcom = nom + " " + apep + " " + apem
                    val fech = di + "/" + me + "/" + an
                    val fechnac: Date = SimpleDateFormat("dd/MM/yyyyy").parse(fech)
                    val fechact = Date(System.currentTimeMillis())
                    val diferen = fechact.getTime() - fechnac.getTime()
                    val segundos = diferen / 1000
                    val min = segundos / 60
                    val horas = min / 60
                    val dias = horas / 24
                    val aniosc = dias / 365
                    val edad = aniosc.toString()
                    val intent = Intent(this, MainActivity2::class.java)
                    val parametros = Bundle()
                    parametros.putString("nombre", nomcom)
                    parametros.putString("edad", edad)
                    parametros.putString("cuenta", cuent)
                    parametros.putString("correo", correo)
                    parametros.putString("mes", me)
                    parametros.putString("anio", an)
                    parametros.putString("dia", di)

                    intent.putExtras(parametros)
                    startActivity(intent)

                } else {

                    val cuen = binding.cuenta.text.toString()
                    val di2 = binding.dia.text.toString().toInt()
                    val me2 = binding.mes.text.toString().toInt()
                    val anc = binding.anio.text.toString().toInt()
                    val dit = binding.dia.text.toString()
                    val met = binding.mes.text.toString()
                    val an2 = binding.anio.text.toString()
                    val taman = an2.length
                    val tamdi = dit.length
                    val tamme = met.length
                    val tam_cuen = cuen.length

                    if (binding.nombre.text.isNotEmpty()) {

                        print("")
                    } else {
                        binding.nombre.error = resources.getString(R.string.se_requiere_nombre)
                    }
                    if (binding.apellidop.text.isNotEmpty()) {

                        print("")

                    } else {
                        binding.apellidop.error = resources.getString(R.string.se_requiere_apellido)
                    }
                    if (binding.dia.text.isNotEmpty() && di2 <= 31 && tamdi == 2) {

                        print("")

                    } else {
                        binding.dia.error = resources.getString(R.string.se_requiere_dia)
                    }
                    if (binding.mes.text.isNotEmpty() && me2 <= 12 && tamme == 2) {

                        print("")

                    } else {
                        binding.mes.error = resources.getString(R.string.se_requiere_mes)
                    }
                    if (binding.anio.text.isNotEmpty() && taman == 4 && anc >= 1960 && anc <= 2022) {

                        print("")

                    } else {
                        binding.anio.error = resources.getString(R.string.se_requiere_anio)
                    }
                    if (binding.cuenta.text.isNotEmpty() && tam_cuen == 9) {

                        print("")

                    } else {
                        binding.cuenta.error = resources.getString(R.string.se_requiere_cuenta)
                    }
                    if (binding.correo.text.isNotEmpty()) {

                        print("")

                    } else {
                        binding.correo.error = resources.getString(R.string.se_requiere_correo)
                    }

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
