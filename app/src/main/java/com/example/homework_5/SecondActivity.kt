package com.example.homework_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val anime = mutableListOf<Manga>()
    private var binding: ActivitySecondBinding? = null
    private val animeAdapter = AnimeAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        fillAnimeList()
        setupRecyclerView()
    }

    private fun fillAnimeList() {
        anime.apply {
            add(Manga(R.drawable.naruto, "Naruto"))
            add(Manga(R.drawable.ne, "One-piece"))
            add(Manga(R.drawable.bleach, "Bleach"))
            add(Manga(R.drawable.mag, "Магическая битва"))
        }
    }

    private fun setupRecyclerView() {
        binding?.animeRecycler?.adapter = animeAdapter
        animeAdapter.setData(anime)
    }
}