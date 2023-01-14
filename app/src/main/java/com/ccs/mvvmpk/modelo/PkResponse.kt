package com.ccs.mvvmpk.modelo

// 1. Se agrega el modificador data antes de class
// 2. Se reemplazan las llaves por parentisis
// 3. Se crea la linea de la constante pk con mutablelist
//    para obtengamos una respuesta que es la lista de Pokemones
// 4. Luego desde PkDataModel Alt+Enter para que cree la clase
// 5. Y tambien precedemos con data y cambiamos parentesis por llaves
// 6. Luego creamos la estructura del registro del PkDataModel

data class PkResponse (
    val pk : MutableList<PkDataModel> = mutableListOf()

)
data class PkDataModel (
    val id : Long,
    val name: String = "",
    val img: String
    )

