/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springweb.controllers;

import com.tecsup.springweb.model.Programa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author SABADO-MANHANA
 */
@Controller
@RequestMapping(value = {"/", "pruebas", "test"})
//@RequestMapping("/")
public class TestController {

    @ModelAttribute
    public void listado(Model model) {
        model.addAttribute("nombres", new String[]{"jose", "jorge"});
    }

    @RequestMapping("parametros")
    public String parametros(@RequestParam(required = false, defaultValue = "") String nombres,String apellidos, Model model) {
        model.addAttribute("nombresCompleto", nombres + " " + apellidos);
        return "test/informacion";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo", "Hola TECSUP");
        model.addAttribute("contenido", "Bienvenidos al curso Spring Framework");

        Programa programa = new Programa();
        programa.setDescripcion("Programa Prueba");
        model.addAttribute("programa", programa);
        return "test/index";
    }

    /**
     * @RequestMapping(method = RequestMethod.GET) public ModelAndView index() {
     * Map<String, Object> retorno = new HashMap<String, Object>();
     * retorno.put("titulo", "Hola TECSUP"); retorno.put("contenido",
     * "Bienvenidos al curso Spring Framework"); return new
     * ModelAndView("test/index", retorno); }
*
     */
    @RequestMapping("informacion")
    public String alternativo() {
        return "test/informacion";
    }

    @RequestMapping(value = {"info", "prueba"})
    public String pruebas() {
        return "test/pruebas";
    }
    
    @RequestMapping("programa")
    public String programa() {
        return "test/programa";
    }
    
    @RequestMapping("programaAjax")
    public String programaAjax() {
        return "test/programaAjax";
    }
    
    @ResponseBody
    @RequestMapping("guardarPrograma")
    public String guardarPrograma(Programa programa){
        return programa.getNombre() + " " + programa.getCodigo();
    }
            
}
