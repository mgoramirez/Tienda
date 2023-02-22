/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.Tienda.controller;

/**
 *
 * @author Asus
 */
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index(Model model){
        List<Persona> listaPersona= personaService.getAllPersona();
        model.addAtrubutte("titulo","Tabla Personas");
        model.addAtributte("personas", listaPersona);
        return "personas";
    }
    
    @GetMapping(/"personaN")
    public String crearPersona(Model model){
        List<Pais>listaPaises=paisService.listCountry();
        model.addAtribute(persona, new Persona());
        model.addAtributte("paises",);
        return "crear"
    }
    
}
