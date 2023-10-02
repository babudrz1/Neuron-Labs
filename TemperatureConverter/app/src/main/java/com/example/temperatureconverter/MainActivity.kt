package com.example.temperatureconverter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.temperatureconverter.databinding.ActivityMainBinding // Replace with your actual package name

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConvert.setOnClickListener {
            convertTemperature()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun convertTemperature() {
        val celsiusText = binding.editTextCelsius.text.toString()
        val fahrenheitText = binding.editTextFahrenheit.text.toString()

        if (celsiusText.isNotEmpty()) {
            val celsius = celsiusText.toDouble()
            val fahrenheit = (celsius * 9 / 5) + 32
            binding.editTextFahrenheit.setText(fahrenheit.toString())
        } else if (fahrenheitText.isNotEmpty()) {
            val fahrenheit = fahrenheitText.toDouble()
            val celsius = (fahrenheit - 32) * 5 / 9
            binding.editTextCelsius.setText(celsius.toString())
        } else {
            binding.textViewResult.text = "Enter a value to convert."
        }
    }
}

