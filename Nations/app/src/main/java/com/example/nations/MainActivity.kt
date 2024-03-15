package com.example.nations

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=Adapter(getModels())
    }

    fun getModels():MutableList<CountryModel>
    {
        val models= mutableListOf(
            CountryModel(R.drawable.usa,"ABD",
                "Washington",R.raw.abd),

            CountryModel(R.drawable.spain,"Ispanya",
                "Madrid",R.raw.spain),
            CountryModel(R.drawable.uk,"Birleşik Krallık",
                "Londra",R.raw.uk),

            CountryModel(R.drawable.serbia,"Sırbistan",
                "Belgrad",R.raw.serbia),

            CountryModel(R.drawable.turkey,"Türkiye",
                "Ankara",R.raw.turkey),

            CountryModel(R.drawable.argentina,"Arjantin",
                "Buenos Aires",R.raw.argentina),

            CountryModel(R.drawable.mexico,"Meksika",
                "Mexico City",R.raw.mexico),

            CountryModel(R.drawable.japan,"Japonya",
                "Tokyo",R.raw.japan),

            CountryModel(R.drawable.norway,"Norveç",
                "Oslo",R.raw.norway),

            CountryModel(R.drawable.portugal,"Portekiz",
                "Lizbon",R.raw.portugal)
        )
        return models
    }
}