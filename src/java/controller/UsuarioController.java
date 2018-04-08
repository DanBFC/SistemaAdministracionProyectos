/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
/**
 *
 * @author daniel
 */
@Controller
public class UsuarioController{
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String mostrarPantallaInicioSesion(){
       System.out.println("Lámeme la panocha, puta");
       return "PantallaInicioSesion";
    }
    
    @RequestMapping(value="/principal", method = RequestMethod.GET)
    public String mostrarPantallaPrincipal(){
        return "PantallaPrincipal";
    }
    
    @RequestMapping(value="principal/salir", method = RequestMethod.GET)
    public String salir (HttpServletRequest request, 
            HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().
                getAuthentication();
        
        if(auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
    return "redirect:/iniciarsesion?salir";
    }
}
