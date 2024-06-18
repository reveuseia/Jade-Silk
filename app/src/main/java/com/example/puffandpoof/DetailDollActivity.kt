package com.example.puffandpoof

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.NumberPicker
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.bumptech.glide.Glide
import com.example.puffandpoof.Fragment.TransactionFragment
import `object`.Transactionlist

class DetailDollActivity : AppCompatActivity() {

    lateinit var ttl: TextView
    lateinit var ratingg: TextView
    lateinit var sizez: TextView
    lateinit var descc: TextView
    lateinit var brandd: TextView
    lateinit var addToCartButton: Button
    lateinit var quantityPicker: NumberPicker

    private lateinit var ImageView: ImageView
    private lateinit var button: Button

    private var tittle: String = ""
    private var ratingz: String = ""
    private var brandq: String = ""
    private var sizeq: String = ""
    private var desc: String = ""

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_doll)

        ttl = findViewById(R.id.ttl)
//        ratingg = findViewById(R.id.ratingl)
        sizez = findViewById(R.id.sizel)
        descc = findViewById(R.id.descTV)
        brandd = findViewById(R.id.braaand)
        ImageView = findViewById(R.id.dtldoll)
        button = findViewById(R.id.backhome)
        addToCartButton = findViewById(R.id.add_to_cart_button)
        quantityPicker = findViewById(R.id.quantity_picker)

        tittle = intent.getStringExtra("title") ?: ""
        ratingz = intent.getStringExtra("rating") ?: ""
        sizeq = intent.getStringExtra("size") ?: ""
        desc = intent.getStringExtra("desc") ?: ""
        brandq = intent.getStringExtra("brand") ?: ""
        val img = intent.getStringExtra("img") ?: ""

        Glide.with(this).load(img).into(ImageView)

        button.setOnClickListener {
            finish()
        }

        quantityPicker.minValue = 1
        quantityPicker.maxValue = 10

        addToCartButton.setOnClickListener {
            val quantity = quantityPicker.value
            Transactionlist.addTransaction(tittle, quantity, "your_date_here")
            showToast("Item added to cart")

            val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
            if (fragment is TransactionFragment) {
                fragment.updateAdapter()
            }
        }

        ttl.text = "$tittle"
        brandd.text = "$brandq"
        sizez.text = "Size: $sizeq"
        descc.text = desc

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}






