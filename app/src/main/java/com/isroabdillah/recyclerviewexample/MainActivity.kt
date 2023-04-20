package com.isroabdillah.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvsuperhero: RecyclerView

    private val list = ArrayList<SuperHero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvsuperhero = findViewById(R.id.rv_superhero)
        rvsuperhero.setHasFixedSize(true)

        list.addAll(getListSuperHero())

//        rvsuperhero.layoutManager = LinearLayoutManager(this)
//        val superHeroAdapter = SuperHeroAdapter(list)
//        rvsuperhero.adapter = superHeroAdapter

        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvsuperhero.layoutManager = LinearLayoutManager(this)
        val superHeroAdapter = SuperHeroAdapter(list)
        rvsuperhero.adapter = superHeroAdapter
    }

    private fun getListSuperHero(): ArrayList<SuperHero> {
        val name = resources.getStringArray(R.array.data_name)
        val desc = resources.getStringArray(R.array.data_desc)

        val listSuperHero = ArrayList<SuperHero>()
        for (i in name.indices){
            val superHero = SuperHero(
                name[i], desc[i]
            )
            listSuperHero.add(superHero)
        }
        return listSuperHero
    }
}