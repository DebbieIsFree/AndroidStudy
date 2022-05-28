package com.example.myapplication01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication01.databinding.ActivitySubBinding


class SubActivity : AppCompatActivity() {
    val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.subText.text = intent.getStringExtra("from_Main")

        binding.btnSub.setOnClickListener{
            val intent = Intent()
            intent.putExtra("from_Sub", binding.editSub.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}