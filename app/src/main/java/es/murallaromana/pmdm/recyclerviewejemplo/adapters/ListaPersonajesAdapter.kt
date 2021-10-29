package es.murallaromana.pmdm.recyclerviewejemplo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

class ListaPersonajesAdapter(val personajes: List<Personaje>) :
    RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    class PersonajesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombre = itemView.findViewById<TextView>(R.id.tvNombre)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val tvFamilia = itemView.findViewById<TextView>(R.id.tvFamilia)
        val tvApellido = itemView.findViewById<TextView>(R.id.tvApellido)
        val ivFoto = itemView.findViewById<ImageView>(R.id.ivFoto)
    }

    //El onCreateViewHolder es código repetitivo, se usa siempre esta estructura.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.item_personaje, parent, false)
        return PersonajesViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = personajes.get(position)
        //O también val personaje = personajes[position]

        holder.tvNombre.setText(personaje.nombre)
        holder.tvTitulo.setText(personaje.titulo)
        holder.tvApellido.setText(personaje.apellido)
        holder.tvFamilia.setText(personaje.familia)
    }

    override fun getItemCount(): Int {
        return personajes.size
    }

    //Otra manera sería
    /* override fun getItemCount() = personajes.size */

}