package es.murallaromana.pmdm.recyclerviewejemplo.modelo.dao

import es.murallaromana.pmdm.recyclerviewejemplo.modelo.entidades.Personaje

class PersonajesDaoMockImpl : PersonajesDao {
    override fun getTodos(): List<Personaje> {
        return listOf(
            Personaje(0,"Daenerys","Targaryen","Mother of Dragons","House Targaryen","https://thronesapi.com/assets/images/daenerys.jpg"),
            Personaje(1,"Samwell","Tarly","Maester","House Tarly","https://thronesapi.com/assets/images/sam.jpg"),
            Personaje(2,"Jon","Snow","King of the North","House Stark","https://thronesapi.com/assets/images/jon-snow.jpg"),
            Personaje(3,"Arya","Stark","No One","House Stark","https://thronesapi.com/assets/images/arya-stark.jpg")
        )

        fun prueba(){
            var lista = ArrayList<Personaje>()
            lista[0] = Personaje(4,"Sansa","Stark","Lady of Winterfell","House Stark","https://thronesapi.com/assets/images/sansa-stark.jpg")
        }
    }
}
/* Primera opción de añadir una lista
    override fun getTodos():List<Personaje>{
        val p = Personaje(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
        val p2 = Personaje(0, "Samwell", "Tarly", "Maester", "House Tarly", "https://thronesapi.com/assets/images/sam.jpg")
        val p3 = Personaje(0, "Jon", "Snow", "King of the North", "House Stark", "https://thronesapi.com/assets/images/jon-snow.jpg")
        val p4 = Personaje(0, "Arya", "Stark", "No One", "House Stark", "https://thronesapi.com/assets/images/arya-stark.jpg")

            val listaPersonajes = listOf(p, p2, p3, p4)
        }
*/

/* Segunda opción de añadir una lista
    override fun getTodos() = listOf(
        Personaje(0,"Daenerys","Targaryen","Mother of Dragons","House Targaryen","https://thronesapi.com/assets/images/daenerys.jpg"),
        Personaje(0,"Samwell","Tarly","Maester","House Tarly","https://thronesapi.com/assets/images/sam.jpg"),
        Personaje(0,"Jon","Snow","King of the North","House Stark","https://thronesapi.com/assets/images/jon-snow.jpg"),
        Personaje(0,"Arya","Stark","No One","House Stark","https://thronesapi.com/assets/images/arya-stark.jpg")
        )
 */
