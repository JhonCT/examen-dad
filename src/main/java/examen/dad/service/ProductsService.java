package examen.dad.service;

import examen.dad.model.Product;
import examen.dad.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    private ProductRepository productRepository;

    @Autowired
    public ProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProduc(String code) {
        return productRepository.findProductByCode(code);
    }
}
