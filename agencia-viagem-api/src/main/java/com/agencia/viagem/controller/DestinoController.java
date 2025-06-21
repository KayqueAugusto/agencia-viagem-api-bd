package com.agencia.viagem.controller;

import com.agencia.viagem.dto.AvaliacaoDTO;
import com.agencia.viagem.model.Destino;
import com.agencia.viagem.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    @Autowired
    private DestinoService service;

    @PostMapping
    public Destino cadastrar(@RequestBody Destino destino) {
        return service.cadastrar(destino);
    }

    @GetMapping
    public List<Destino> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/pesquisar")
    public List<Destino> pesquisar(@RequestParam String termo) {
        return service.pesquisar(termo);
    }

    @GetMapping("/{id}")
    public Destino buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PatchMapping("/{id}/avaliar")
    public Destino avaliar(@PathVariable Long id, @RequestBody AvaliacaoDTO dto) {
        return service.avaliar(id, dto.getNota());
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
