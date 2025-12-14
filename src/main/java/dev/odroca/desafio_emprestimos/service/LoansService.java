package dev.odroca.desafio_emprestimos.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import dev.odroca.desafio_emprestimos.dto.LoansModel;
import dev.odroca.desafio_emprestimos.dto.LoansRequestDTO;
import dev.odroca.desafio_emprestimos.dto.LoansResponseDTO;

@Service
public class LoansService {
    
    public LoansResponseDTO postLoans(LoansRequestDTO loansRequest) {
        Set<LoansModel> loans = new HashSet<>();

        Double income = loansRequest.income();
        
        if (loansRequest.location().equals("SP")) {
            if ((income > 3000.00 && income < 5000.00 || income > 5000.00) && loansRequest.age() < 30) {
                loans.add(new LoansModel("PERSONAL", 4));
                loans.add(new LoansModel("GUARANTEED", 3));
            }
        }

        if (income <= 3000.00 || income > 3000.00) {
            loans.add(new LoansModel("PERSONAL", 4));
            loans.add(new LoansModel("GUARANTEED", 3));
        }
        
        if (income >= 5000.00) {
            loans.add(new LoansModel("CONSIGNMENT", 2));
        }


        return new LoansResponseDTO(loansRequest.name(), loans);
    }
    
}
