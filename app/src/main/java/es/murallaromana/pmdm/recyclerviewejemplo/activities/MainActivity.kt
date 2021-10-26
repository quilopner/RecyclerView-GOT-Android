package es.murallaromana.pmdm.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ActivityMainBinding
import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // LayoutManager layoutManager = new LinearLayoutManager(this)
        val layoutManager = LinearLayoutManager(this)


        // Prueba personaje
        val p = Personaje(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
        println(p.getNombreCompleto())
    }
}