package com.example.ejercicio1_amr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ejercicio1_amr.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val nombre = bundle?.getString("nombre", "")
        val edad = bundle?.getString("edad", "")
        val cuenta = bundle?.getString("cuenta", "")
        val correo = bundle?.getString("correo", "")
        val mes = bundle?.getString("mes", "")
        val anio = bundle?.getString("anio", "")
        val dia = bundle?.getString("dia", "")
        val diaz = dia.toString().toInt()



        binding.nombre2.text= nombre
        binding.edad.text= edad
        binding.cuenta2.text= cuenta
        binding.correo2.text= correo

        if(anio == "1960" || anio == "1972" || anio == "1984" || anio == "1996" || anio =="2008" || anio =="2020"){

            binding.animal.text= resources.getString(R.string.rata)
            binding.imgani.setImageResource(R.drawable.raton)

        }else if(anio == "1961"|| anio == "1973"|| anio =="1985"|| anio =="1997" || anio =="2009" || anio =="2021"){

            binding.animal.text= resources.getString(R.string.buey)
            binding.imgani.setImageResource(R.drawable.buey)

        }else if(anio == "1962"|| anio == "1974"|| anio =="1986"|| anio =="1998" || anio =="2010" || anio =="2022"){

            binding.animal.text= resources.getString(R.string.tigre)
            binding.imgani.setImageResource(R.drawable.tigre)

        }else if(anio == "1963"|| anio == "1975"|| anio =="1987"|| anio =="1999" || anio =="2011" ){

            binding.animal.text= resources.getString(R.string.conejo)
            binding.imgani.setImageResource(R.drawable.conejo)

        }else if(anio == "1964"|| anio == "1976"|| anio =="1988"|| anio =="2000" || anio =="2012" ){

            binding.animal.text= resources.getString(R.string.dragon)
            binding.imgani.setImageResource(R.drawable.dragon)

        }else if(anio == "1965"|| anio == "1977"|| anio =="1989"|| anio =="2001" || anio =="2013" ){

            binding.animal.text= resources.getString(R.string.serpiente)
            binding.imgani.setImageResource(R.drawable.serp)

        }else if(anio == "1966"|| anio == "1978"|| anio =="1990"|| anio =="2002" || anio =="2014" ){

            binding.animal.text= resources.getString(R.string.caballo)
            binding.imgani.setImageResource(R.drawable.caballo)

        }else if(anio == "1967"|| anio == "1979"|| anio =="1991"|| anio =="2003" || anio =="2015" ){

            binding.animal.text= resources.getString(R.string.cabra)
            binding.imgani.setImageResource(R.drawable.cabra)

        }else if(anio == "1968"|| anio == "1980"|| anio =="1992"|| anio =="2004" || anio =="2016" ){

            binding.animal.text= resources.getString(R.string.mono)
            binding.imgani.setImageResource(R.drawable.mono)

        }else if(anio == "1969"|| anio == "1981"|| anio =="1993"|| anio =="2005" || anio =="2017" ){

            binding.animal.text= resources.getString(R.string.gallo)
            binding.imgani.setImageResource(R.drawable.gallo)

        }else if(anio == "1970"|| anio == "1982"|| anio =="1994"|| anio =="2006" || anio =="2018" ){

            binding.animal.text= resources.getString(R.string.perro)
            binding.imgani.setImageResource(R.drawable.perro)

        }else if(anio == "1971"|| anio == "1983"|| anio =="1995"|| anio =="2007" || anio =="2019" ){

            binding.animal.text= resources.getString(R.string.cerdo)
            binding.imgani.setImageResource(R.drawable.cerdo)

        }

        when(mes){

            "01" ->{
                if(diaz < 20){
                    binding.zodiac.text= "Capricornio"
                    binding.imgzo.setImageResource(R.drawable.capri)
                }else{
                    binding.zodiac.text= "Acuario"
                    binding.imgzo.setImageResource(R.drawable.acua)
                }
            }
            "02" ->{
                if(diaz < 19){
                    binding.zodiac.text= "Acuario"
                    binding.imgzo.setImageResource(R.drawable.acua)
                }else{
                    binding.zodiac.text= "Piscis"
                    binding.imgzo.setImageResource(R.drawable.piscis)
                }
            }
            "03" ->{
                if(diaz < 21){
                    binding.zodiac.text= "Piscis"
                    binding.imgzo.setImageResource(R.drawable.piscis)
                }else{
                    binding.zodiac.text= "Aries"
                    binding.imgzo.setImageResource(R.drawable.aries)
                }
            }
            "04" ->{
                if(diaz < 20){
                    binding.zodiac.text= "Aries"
                    binding.imgzo.setImageResource(R.drawable.aries)
                }else{
                    binding.zodiac.text= "Tauro"
                    binding.imgzo.setImageResource(R.drawable.tauro)
                }
            }
            "05" ->{
                if(diaz < 21){
                    binding.zodiac.text= "Tauro"
                    binding.imgzo.setImageResource(R.drawable.tauro)
                }else{
                    binding.zodiac.text= "Geminis"
                    binding.imgzo.setImageResource(R.drawable.gemi)
                }
            }
            "06" ->{
                if(diaz < 21){
                    binding.zodiac.text= "Geminis"
                    binding.imgzo.setImageResource(R.drawable.gemi)
                }else{
                    binding.zodiac.text= "Cancer"
                    binding.imgzo.setImageResource(R.drawable.cancer)
                }
            }
            "07" ->{
                if(diaz < 23){
                    binding.zodiac.text= "Cancer"
                    binding.imgzo.setImageResource(R.drawable.cancer)
                }else{
                    binding.zodiac.text= "Leo"
                    binding.imgzo.setImageResource(R.drawable.leo)
                }
            }
            "08" ->{
                if(diaz < 23){
                    binding.zodiac.text= "Leo"
                    binding.imgzo.setImageResource(R.drawable.leo)
                }else{
                    binding.zodiac.text= "Virgo"
                    binding.imgzo.setImageResource(R.drawable.virg)
                }
            }
            "09" ->{
                if(diaz < 23){
                    binding.zodiac.text= "Virgo"
                    binding.imgzo.setImageResource(R.drawable.virg)
                }else{
                    binding.zodiac.text= "Libra"
                    binding.imgzo.setImageResource(R.drawable.libra)
                }
            }
            "10" ->{
                if(diaz < 23){
                    binding.zodiac.text= "Libra"
                    binding.imgzo.setImageResource(R.drawable.libra)
                }else{
                    binding.zodiac.text= "Escorpion"
                    binding.imgzo.setImageResource(R.drawable.escorp)
                }
            }
            "11" ->{
                if(diaz < 22){
                    binding.zodiac.text= "Escorpio"
                    binding.imgzo.setImageResource(R.drawable.escorp)
                }else{
                    binding.zodiac.text= "Saguitario "
                    binding.imgzo.setImageResource(R.drawable.sagit)
                }
            }
            "12" -> {
                if(diaz < 22){
                    binding.zodiac.text= "Sagitario"
                    binding.imgzo.setImageResource(R.drawable.sagit)
                }else{
                    binding.zodiac.text= "Capricornio"
                    binding.imgzo.setImageResource(R.drawable.capri)
                }
            }




        }










    }

    fun click(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }
}