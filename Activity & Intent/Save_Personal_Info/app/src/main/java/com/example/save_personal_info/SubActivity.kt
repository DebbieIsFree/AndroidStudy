package com.example.save_personal_info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.save_personal_info.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val infoData = intent.getStringArrayExtra("Info_from_Main")

        with(binding){
            Sname.text = infoData?.get(0).toString()
            Sage.text = infoData?.get(1).toString()
            Stel.text = infoData?.get(2).toString()
            Saddr.text = infoData?.get(3).toString()
            Setc.text = infoData?.get(4).toString()
        }

        binding.Sbtn.setOnClickListener{
            finish()
        }
    }
}