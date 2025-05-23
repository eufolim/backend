package com.estudantes_web.estudantes_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.estudantes_web.estudantes_web.models.Estudante;

@RestController
@RequestMapping("estudante")
@EnableWebMvc
public class EstudanteController {
    List<Estudante> lista = new ArrayList<>();

    @PostMapping("/cadastrar")
    public String postMethodName(@ModelAttribute Estudante estudante) {
        lista.add(estudante);
        return "Estudante Adicionado";
    }

    @GetMapping("/test")
    public String getMethodName() {
        return "test";
    }
    

    @GetMapping("/listar/")
    public List<Estudante> listarEstudantes(@RequestParam String param) {
        return lista;
    }
    
    @GetMapping("/listar/{id}")
    public Estudante buscarEstudante(@PathVariable Integer id) {
        Estudante response = null;
        for (Estudante estudante : lista) {
            if(estudante.getCodigo().equals(id)){
                response = estudante;
                break;
            }
        }
        return response;
    }
    

}
