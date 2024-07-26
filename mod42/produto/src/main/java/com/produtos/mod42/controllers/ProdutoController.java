package com.produtos.mod42.controllers;


import com.produtos.mod42.model.ProdutoModel;
import com.produtos.mod42.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/produtos")
    public ResponseEntity<ProdutoModel> salvarProduto(@RequestBody ProdutoModel produto) {
        var produtoModel = new ProdutoModel();
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<ProdutoModel>> listarTodosProdutos() {
        List<ProdutoModel> produtos = produtoRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(produtos);
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<ProdutoModel> listarUmProduto(@PathVariable(value = "id") UUID id) {
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(produto.get());
    }

    @PutMapping("/produtos/{id}")
    public ResponseEntity<Object> updateProduto(@PathVariable(value = "id") UUID id,
                                                @RequestBody ProdutoModel produtoModel) {
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        var produtoModelAtual = produto.get();
        return ResponseEntity.status(HttpStatus.OK).body("Produto alterado com sucesso");
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Object> deleteProduto(@PathVariable(value = "id") UUID id) {
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        produtoRepository.delete(produto.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso");
    }
}
