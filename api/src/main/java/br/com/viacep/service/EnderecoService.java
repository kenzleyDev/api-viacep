package br.com.viacep.service;

import br.com.viacep.client.ViacepClient;
import br.com.viacep.domain.Endereco;
import br.com.viacep.dto.EnderecoDTO;
import br.com.viacep.utils.FreteUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class EnderecoService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ViacepClient viacepClient;

    public ResponseEntity<EnderecoDTO> buscarCep(String cep) {

        if(!ObjectUtils.isEmpty(cep)) {

            EnderecoDTO enderecoDTO = new EnderecoDTO();
            Endereco enderecoViaCepClient = this.viacepClient.getEnderecoViaCepClient(cep);
            modelMapper.map(enderecoViaCepClient, enderecoDTO);

            enderecoDTO.setFrete(FreteUtil.buscaValorFretePorEstado(enderecoDTO.getUf()));

            return ResponseEntity.ok(enderecoDTO);
        }

        return ResponseEntity.notFound().build();
    }

}
