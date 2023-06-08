package com.example.myofflinedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray

class VolleyGETAPI_calling : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volley_getapi_calling)


// Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://jsonplaceholder.typicode.com/posts"

// Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                var jsonarr = JSONArray(response)
              for(ele in 0..jsonarr.length()-1)
              {
                  Log.d("===EL==", "onCreate:$ele ")
                  Log.d("===DAT==", "onCreate:${jsonarr[ele]} ")

                  var jb = jsonarr.getJSONObject(ele)
                  var userId = jb.getInt("userId")
                  var title = jb.getString("title")
                  Log.d("===UI", "onCreate:$userId ")
                  Log.d("===UT", "onCreate:$title ")



              }



                Log.d("====", "onCreate: ${response}")

                // Display the first 500 characters of the response string.

            },
            {

 })

// Add the request to the RequestQueue.
        queue.add(stringRequest)

    }
}