package es.murallaromana.pmdm.recyclerviewejemplo.modelo.dao

import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

interface PersonajesDao {
    //public List<Personaje> getTodos/getAll/obternerTodos();
    fun getTodos(): List<Personaje>

}