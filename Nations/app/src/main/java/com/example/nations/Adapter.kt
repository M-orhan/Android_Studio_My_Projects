package com.example.nations

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.media.SoundPool
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class Adapter(val countryList:MutableList<CountryModel>):
    RecyclerView.Adapter<Adapter.ModelViewHolder>()
{



    class ModelViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val countryName: TextView =view.findViewById(R.id.ulkeAdi)
        val capitalName: TextView =view.findViewById(R.id.baskentAdi)
        val flagImage: ImageView =view.findViewById(R.id.flagImage)
        val buton: ImageButton =view.findViewById(R.id.mars)
        private var currentMediaPlayer: MediaPlayer? = null




        fun bindItems(item:CountryModel)
        {
            countryName.setText(item.countryName)
            capitalName.setText(item.capitalName)
            flagImage.setImageResource(item.flagName)
            buton.setOnClickListener {
                if (currentMediaPlayer != null) {
                    currentMediaPlayer?.stop()
                    currentMediaPlayer = null
                    return@setOnClickListener
                }
                currentMediaPlayer = when (item.countryName) {
                    "Birleşik Krallık" -> MediaPlayer.create(it.context, R.raw.uk)
                    "ABD" -> MediaPlayer.create(it.context, R.raw.abd)
                    "Türkiye" -> MediaPlayer.create(it.context, R.raw.turkey)
                    "Ispanya" -> MediaPlayer.create(it.context, R.raw.spain)
                    "Arjantin" -> MediaPlayer.create(it.context, R.raw.argentina)
                    "Sırbistan" -> MediaPlayer.create(it.context, R.raw.serbia)
                    "Meksika" -> MediaPlayer.create(it.context, R.raw.mexico)
                    "Portekiz"-> MediaPlayer.create(it.context, R.raw.portugal)
                    "Norveç"-> MediaPlayer.create(it.context, R.raw.norway)
                    "Meksika"->MediaPlayer.create(it.context, R.raw.mexico)
                    else -> return@setOnClickListener
                }
                currentMediaPlayer?.start()
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent,false)
        return ModelViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bindItems((countryList.get(position)))
    }

    override fun getItemCount(): Int {
        return countryList.size
    }


}