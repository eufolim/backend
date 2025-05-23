package com.example_mercado.mercado.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example_mercado.mercado.models.Produto;



@RestController
@RequestMapping("")
public class MercadoController {
    private final List<Produto> produtos = new ArrayList<>();

    public MercadoController(String[] args) {
        Produto novo = new Produto("notebook", "dell", 4000.00);
        produtos.add(novo);
    }

    @GetMapping("/produtos")
    public List<Produto> getProdutos(@RequestParam String param) {
        return produtos;
    }

    @PostMapping("/produtos")
    public Produto addProduto(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }
    
    
}
