package com.example.puffandpoof.Fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.puffandpoof.DetailDollActivity
import com.example.puffandpoof.R
import com.example.puffandpoof.adaptor.DollAdap
import com.example.puffandpoof.AppDatabase
import com.example.puffandpoof.DollDao
import com.example.puffandpoof.model.Doll
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject

class HomeFragment : Fragment(), DollAdap.OnItemClickListener {

    private lateinit var adap: DollAdap
    private lateinit var recyclerView: RecyclerView
    private lateinit var dollDao: DollDao
    private lateinit var requestQueue: RequestQueue

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.rvd)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adap = DollAdap(emptyList(), this)
        recyclerView.adapter = adap

        dollDao = AppDatabase.getInstance(requireContext()).dollDao()
        requestQueue = Volley.newRequestQueue(requireContext())

        fetchDataFromJSON()
    }

    private fun fetchDataFromJSON() {
        val url = "https://api.npoint.io/5be5f94c818a44cca2bb"

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            { response ->
                Log.d("HomeFragment", "JSON Response: $response")
                val dolls = parseDollData(response)
                storeDataInDatabase(dolls)
            },
            { error ->
                Log.e("HomeFragment", "Error fetching data", error)
            }
        )

        requestQueue.add(jsonObjectRequest)
    }

    private fun parseDollData(jsonObject: JSONObject): List<Doll> {
        val gson = Gson()
        val dollsJsonArray = jsonObject.getJSONArray("dolls")
        val dollsType = object : TypeToken<List<Doll>>() {}.type
        return gson.fromJson(dollsJsonArray.toString(), dollsType)
    }

    private fun storeDataInDatabase(dolls: List<Doll>) {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                Log.d("HomeFragment", "Clearing old data from database")
                dollDao.deleteAllDolls()  // Add method to clear old data
                Log.d("HomeFragment", "Storing new data in database: $dolls")
                dollDao.insertDolls(dolls)
            }
            getDataFromDatabase()
        }
    }


    private fun getDataFromDatabase() {
        dollDao.getAllDolls().observe(viewLifecycleOwner, { dolls ->
            adap.updateData(dolls)
        })
    }

    override fun onItemClick(position: Int) {
        val clickedDoll = adap.getItemAtPosition(position)
        val intent = Intent(requireContext(), DetailDollActivity::class.java).apply {
            putExtra("dollId", clickedDoll.id)
            putExtra("title", clickedDoll.name)
            putExtra("price", clickedDoll.price)
            putExtra("size", clickedDoll.size)
            putExtra("desc", clickedDoll.desc)
            putExtra("brand", clickedDoll.brand)
            putExtra("img", clickedDoll.imageLink)
        }
        startActivity(intent)
    }
}
