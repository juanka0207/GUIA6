/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.EjemplorSprintt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import mintic.misiontic.ciclo3.modelo.Usuario;


/**
 *
 * @author Juanka
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio(Model modelo){
        String mensaje = "SALUDOS DESDE MVC con paso de informacion";
        modelo.addAttribute("mensaje",mensaje);
        modelo.addAttribute("dato",dato);
        Usuario u = new Usuario();
        u.setCedula("1007260380");
        u.setClave("Juan2003");
        u.setNombre("Juan Camilo Gaviria");
        u.setEmail("juancgaviria2003@gmail.com");
        modelo.addAttribute("alguien",u);
        log.info("Ejecutando el controlador inicio");
        return "index";
    }
    
}
