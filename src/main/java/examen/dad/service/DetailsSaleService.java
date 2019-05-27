package examen.dad.service;

import examen.dad.model.Details_Sale;
import examen.dad.repository.DetailsSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsSaleService {

    private DetailsSaleRepository detailsSaleRepository;

    @Autowired
    public DetailsSaleService(DetailsSaleRepository detailsSaleRepository) {
        this.detailsSaleRepository = detailsSaleRepository;
    }

    public Details_Sale createDetails(Details_Sale details_sale) {
        return detailsSaleRepository.save(details_sale);
    }
}
