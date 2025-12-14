package dev.odroca.desafio_emprestimos.controller;

import org.springframework.web.bind.annotation.RestController;

import dev.odroca.desafio_emprestimos.dto.LoansRequestDTO;
import dev.odroca.desafio_emprestimos.dto.LoansResponseDTO;
import dev.odroca.desafio_emprestimos.service.LoansService;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/loans")
public class LoansController {
    
    LoansService loansService;

    public LoansController(LoansService loansService) {
        this.loansService = loansService;
    }
    
    @PostMapping("/customer-loans")
    public ResponseEntity<LoansResponseDTO> postLoans(@RequestBody @Valid LoansRequestDTO loansRequest) {
        LoansResponseDTO response = loansService.postLoans(loansRequest);
        return new ResponseEntity<LoansResponseDTO>(response, HttpStatus.OK);
    }
    
    
}
