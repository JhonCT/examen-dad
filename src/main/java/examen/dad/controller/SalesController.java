package examen.dad.controller;

import examen.dad.model.Details_Sale;
import examen.dad.model.Person;
import examen.dad.model.Product;
import examen.dad.model.Sale;
import examen.dad.service.DetailsSaleService;
import examen.dad.service.PersonsService;
import examen.dad.service.ProductsService;
import examen.dad.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SalesController {

    private ProductsService productsService;
    private PersonsService personsService;
    private SalesService salesService;
    private DetailsSaleService detailsSaleService;

    @Autowired
    public SalesController(ProductsService productsService, PersonsService personsService, SalesService salesService, DetailsSaleService detailsSaleService) {
        this.productsService = productsService;
        this.personsService = personsService;
        this.salesService = salesService;
        this.detailsSaleService = detailsSaleService;
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return productsService.getProducts();
    }

    @GetMapping("getProduct/{code}")
    public Product findByCodeProduct(@PathVariable("code")String code) {
        return productsService.getProduc(code);
    }

    @GetMapping("/getPersons")
    public List<Person> getPersons() {
        return personsService.getPersons();
    }

    @GetMapping("/getPerson/{dni}")
    public Person getPersons(@PathVariable("dni")String dni) {
        return personsService.getPerson(dni);
    }

    @PostMapping("/doSale")
    public Sale doSale(@RequestBody Sale sale) {
        return salesService.doSale(sale);
    }

    @PostMapping("/detailsSale")
    public Details_Sale detailsSale(@RequestBody Details_Sale details_sale) {
        System.out.println(details_sale.toString());
        return detailsSaleService.createDetails(details_sale);
    }
}
