package com.example.save_personal_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.save_personal_info.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy  { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            Mbtn.setOnClickListener{
                var infoData = arrayOf(Mname.text.toString(), Mage.text.toString(), Mtel.text.toString(),
                    Maddr.text.toString(), Metc.text.toString())

                val intent = Intent(root.context, SubActivity::class.java)
                intent.putExtra("Info_from_Main", infoData)
                startActivity(intent)
            }
        }
    }
}