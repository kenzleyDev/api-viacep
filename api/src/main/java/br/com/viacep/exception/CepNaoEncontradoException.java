package br.com.viacep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CepNaoEncontradoException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity cepNaoEncontrado(Exception e) {
        return new ResponseEntity("Cep nao encontrado!", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity cepNaoIdentificado(Exception e) {
        return new ResponseEntity("Não foi possível consultar o cep informado, por favor, verifique o cep e tente novamente!", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity cepInvalido(Exception e) {
        return new ResponseEntity("Cep inválido!", HttpStatus.NOT_FOUND);
    }
}
