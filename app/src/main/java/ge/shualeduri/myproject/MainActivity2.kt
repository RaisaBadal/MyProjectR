package ge.shualeduri.myproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        preferences=getSharedPreferences("raisa_preference",Context.MODE_PRIVATE)
        val names=preferences.getString("name","")
        gamotanisadgili.text=names
        backbutton.setOnClickListener {
            val editor:SharedPreferences.Editor=preferences.edit()
            editor.clear()
            editor.apply()
            val temp = Intent(this, MainActivity::class.java)
            startActivity(temp)
            finish()
        }
        }
    }


