package br.com.viacep.client;

import br.com.viacep.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ViacepClient {

    @Value("${endpoint.cep}")
    private String endpoint;

    @Autowired
    private RestTemplate restTemplate;


    public Endereco getEnderecoViaCepClient(String cep) {
        return restTemplate.getForObject(endpoint + cep + "/json/", Endereco.class);
    }


}
