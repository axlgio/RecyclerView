package com.example.s5_ejercicio_recyclerview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.s5_ejercicio_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val menuRepository = MenuRepository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
// RecyclerView Configuration
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.rvMenu.apply {
            setHasFixedSize(true)
            adapter = MenuAdapter(menuRepository.getMenu())
            setLayoutManager(layoutManager)
        }
    }
}