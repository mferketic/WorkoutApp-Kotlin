package com.mferketic.workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mferketic.workout.databinding.ActivityBmiactivityBinding

class BMIActivity : AppCompatActivity() {

    private var binding: ActivityBmiactivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiactivityBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarBmiActivity)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "BMI Calculator"
        }
        binding?.toolbarBmiActivity?.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    private fun validateMetricUnits(): Boolean{
        //TODO
    }
}