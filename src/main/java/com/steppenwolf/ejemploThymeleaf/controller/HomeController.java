package com.steppenwolf.ejemploThymeleaf.controller;

import com.steppenwolf.ejemploThymeleaf.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mostrarHome(Model model){ //Model envía información a la vista

        String mensaje = "Un texto para mostrar";
        Double unnumero = 15.25;
        String otromensaje = "Este es otro mensaje a mostrar";
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("unnumero", unnumero);
        model.addAttribute("otromensaje", otromensaje);

        Producto producto = new Producto();
        producto.setId(1);
        producto.setNombre("PrimerProducto");
        producto.setDescripcion("Descripción del primer producto");
        producto.setPrecio(12.34);

        model.addAttribute("producto", producto);

        return "home"; //Se pone el nombre de la página html que quiere que se redireccione (resources/templates/home.html)
    }

    @GetMapping("/lista")
    public String mostrarListado(Model model){
        List<String> productos = new ArrayList<>();
        productos.add("Primer Producto");
        productos.add("Segundo Producto");
        productos.add("Tercer Producto");
        productos.add("Cuarto Producto");

        model.addAttribute("productos", productos);

        return "lista";
    }

}
