package ge.shualeduri.myproject

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences=getSharedPreferences("raisa_preference",Context.MODE_PRIVATE)

        buttonofsignin.setOnClickListener {
            val name:String=teqstigadasacemi.text.toString()
            val editor:SharedPreferences.Editor=sharedPreferences.edit()
            editor.putString("name",name)
            editor.apply()
            Toast.makeText(this,"Nice to meet you",Toast.LENGTH_LONG).show()
            val temp = Intent(this, MainActivity2::class.java)
            startActivity(temp)
            finish()
            }
        buttonofnext.setOnClickListener {
            val editor:SharedPreferences.Editor=sharedPreferences.edit()
            editor.putString("name","")
            editor.apply()
            Toast.makeText(this,"Nice to meet you",Toast.LENGTH_LONG).show()
            val temp = Intent(this, MainActivity2::class.java)
            startActivity(temp)
            finish()
        }
        }
    }


