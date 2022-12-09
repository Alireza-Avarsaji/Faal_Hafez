package ir.avarsaji.faalhafez

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ir.avarsaji.faalhafez.databinding.ActivityMainBinding
import ir.avarsaji.faalhafez.util.Statics

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        setEvents()
    }

    private fun setEvents(): Unit {
        setButtonEvents()
    }

    private fun setButtonEvents(): Unit {
        binding.appButton.setOnClickListener {
            val randomFaal = getRandomFaal()
            changeFaal(randomFaal)
        }
    }

    private fun getRandomFaal(): String {
        return Statics.getRandomFaal()
    }

    private fun changeFaal(newFaal: String): Unit {
        binding.faalTextView.text = newFaal
    }
}