package examen.dad.controller;

import examen.dad.model.Person;
import examen.dad.model.Product;
import examen.dad.service.PersonsService;
import examen.dad.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SalesController {

    private ProductsService productsService;
    private PersonsService personsService;

    @Autowired
    public SalesController(ProductsService productsService, PersonsService personsService) {
        this.productsService = productsService;
        this.personsService = personsService;
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

    @PostMapping("/sales")
    public String sales() {
        return "venta";
    }

}
