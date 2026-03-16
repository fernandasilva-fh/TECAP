package fatec.com.product.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fatec.com.product.models.Product;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping ("/products")
public class ProductController {
    
    @GetMapping
    public ArrayList<Product> getProducts(){

        Product p1 = new Product();
        p1.setId(1L);
        p1.setName("Notebook");
        p1.setPrice(3500.00);
        p1.setDescription("Notebook com tela de 15.6 polegadas, 256GB SSD");

        Product p2 = new Product();
        Product p3 = new Product();

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);


        return products;
    }
    
}
    //declarar uma variavel do tipo Product
        //criar um objeto do tipo Product e atribui a  variavel 
        // o new sinaliza a criação de um objeto
        // p1 nome da variavel 

