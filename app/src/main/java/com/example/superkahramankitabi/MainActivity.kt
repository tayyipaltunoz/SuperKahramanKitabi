package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri hazırlığı

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Iron Man")

        //Verimsiz tanımlamalar
        /*
    val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
    val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
    val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
    val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
    val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)

    var superKahramanGorselleri = ArrayList<Bitmap>()
    superKahramanGorselleri.add(batmanBitmap)
    superKahramanGorselleri.add(supermanBitmap)
    superKahramanGorselleri.add(spidermanBitmap)
    superKahramanGorselleri.add(aquamanBitmap)
    superKahramanGorselleri.add(ironmanBitmap)
*/
        //Verimli Tanımlar

        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val spidermanDrawableId = R.drawable.spiderman
        val aquamanDrawableId = R.drawable.aquaman
        val ironmanDrawableId = R.drawable.ironman

        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)

        //adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawableListesi)
        recyclerView.adapter = adapter
    }
}