package banuelos.hector.multiplicar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPracticare: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPracticare = findViewById(R.id.btnPracticar)

        btnPracticare.setOnClickListener{
            val intentPracticar = Intent(this,PracticaActivity::class.java)
            startActivity(intentPracticar)        }
    }

}