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
                if (binding.nombre.text.isNotEmpty() && binding.apellidop.text.isNotEmpty() && binding.dia.text.isNotEmpty() && binding.mes.text.isNotEmpty() && binding.anio.text.isNotEmpty() && binding.cuenta.text.isNotEmpty() && binding.correo.text.isNotEmpty()){

                    val an2 = binding.anio.text.toString()
                    val dit2 = binding.dia.text.toString()
                    val met2 = binding.mes.text.toString()
                    val corre = binding.correo.text.toString()
                    val an3 = binding.anio.text.toString().toInt()
                    val dit3 = binding.dia.text.toString().toInt()
                    val met3 = binding.mes.text.toString().toInt()
                    val tamdi2 = dit2.length
                    val tamme2 = met2.length
                    val cuen2 = binding.cuenta.text.toString()
                    val taman2 = an2.length
                    val tamcuen2 = cuen2.length

                    if(dit3 <= 31 && tamdi2 == 2 && met3 <= 12 && tamme2 == 2 && taman2 == 4 && an3 >= 1960 && an3 <= 2022 && tamcuen2 == 9 && isValidString(corre)){

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

                    }else {

                        if (met3 > 12 || tamme2 != 2){
                            binding.mes.error = resources.getString(R.string.se_requiere_mes)

                        }else if (taman2 != 4 || an3 < 1960 || an3 > 2022){
                            binding.anio.error = resources.getString(R.string.se_requiere_anio)
                        }else if(tamcuen2 < 9){
                            binding.cuenta.error = resources.getString(R.string.se_requiere_cuenta)

                        }else if(dit3 > 31 || tamdi2 != 2){
                            binding.dia.error = resources.getString(R.string.se_requiere_dia)

                        }else{
                            binding.correo.error = resources.getString(R.string.se_requiere_correo)

                        }
                        Toast.makeText(this@MainActivity,resources.getString(R.string.ingresa_valor_correcto), Toast.LENGTH_SHORT).show()
                    }

                } else {

                    Toast.makeText(this@MainActivity,resources.getString(R.string.ingresa_valor), Toast.LENGTH_SHORT).show()



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


    fun isValidString(str: String): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()
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
