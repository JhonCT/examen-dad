package examen.dad.service;

import examen.dad.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

    private SaleRepository saleRepository;

    @Autowired
    public SalesService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }
}
