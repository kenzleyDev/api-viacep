package br.com.viacep.controller;

import br.com.viacep.dto.EnderecoDTO;
import br.com.viacep.exception.CepNaoEncontradoException;
import br.com.viacep.service.EnderecoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @ApiOperation(value = "Retorna um Endereço e o valor do frete")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna um Endereço e o valor do frete"),
            @ApiResponse(code = 404, message = "Cep nao encontrado"),
            @ApiResponse(code = 400, message = "Cep invalido"),
    })
    @PostMapping("consultar-endereco")
    public ResponseEntity<EnderecoDTO> getEndereco(@RequestBody String cep) {
            return this.service.buscarCep(cep);
    }
}
