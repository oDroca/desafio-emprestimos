package dev.odroca.desafio_emprestimos.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record LoansRequestDTO(
    @NotNull
    @Positive
    Integer age,
    @NotNull
    String cpf,
    @NotNull
    String name,
    @NotNull
    @Positive
    Double income,
    @NotNull
    String location
) {}
