package com.microservices.msclientes.domain;

import java.time.LocalDate;

public record ClienteSaveRequest(
        String nome,
        String cpf,
        LocalDate dataNascimento,
        String email

) {
    public Cliente toModel () {
        return new Cliente(nome,cpf,dataNascimento,email);
    }
}
