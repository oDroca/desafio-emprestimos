package dev.odroca.desafio_emprestimos.dto;

import java.util.Set;

public record LoansResponseDTO(
    String custome,
    Set<LoansModel> loans
) {}
