package br.com.projetos.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetos.vendas.dtos.VendaDTO;
import br.com.projetos.vendas.services.VendaService;

@Controller
@RequestMapping("vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public ResponseEntity<VendaDTO> realizarVenda(@RequestBody VendaDTO vendaDTO) {
	return new ResponseEntity<VendaDTO>(vendaService.realizarVenda(vendaDTO), HttpStatus.CREATED);
    }

}
