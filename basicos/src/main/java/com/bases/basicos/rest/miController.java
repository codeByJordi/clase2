package com.bases.basicos.rest;

import org.springframework.beans.factory.annotation.Value; //para la clase value
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//Endpoints son url del sitio

@Controller //para contenido dinamico con hmtl y que no sea plano como RestController
public class miController {

    //para propiedades personalizadas que estan el .properties
    @Value("${elgrande.nombreEmpresa.nombre}")
    private String nombreGrande;
    @Value("${url.nombreEmpresa}")
    private String urlEmpresa;
    @GetMapping("/datos")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String getDatos(){
        //obtiene los valores que se metieron al .properties
        return "Nombre elgrande: " + nombreGrande + " url: " + urlEmpresa;
    }


    @GetMapping("/") //url raiz o primera pag
    public String saludo() {
        return "index"; //se muestra el index.html al inicio o primera pag/endpoint - es el que creamos en resources/templates/index.html
    }
    

    @GetMapping("/info") //para mostrar esta pag, debemos ir al localhost:8080/info, porque es donde el get mapping nos dirige
    public String info() {
        return "index"; //se muestra el index.html al inicio o primera pag/endpoint - es el que creamos en resources/templates/index.html
    }


    //devTool y todo lo de maven esta en 'pom.xml' --> si vamos a 'mavenrepository' y copiamos una dependecia/metodo, y la pegamos ahi, esta funcionara y se nos anade al proyecto.
    //todo dentro del <project>
    //devTools hace que si estamos ejecutando el proyecto y hacemos un cambio en la pag, no tengamos que detenerlo, el cambiara estando en ejecucion
}
