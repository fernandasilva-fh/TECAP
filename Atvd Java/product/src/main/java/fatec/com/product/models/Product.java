package fatec.com.product.models;

//em java tudo que começa com letra MAIUSCULA  é class
//"long" = tipo primitivo só guarda um valor do tipo long,não guarda null 
//class sao inicializadas com null
public class Product {
    
    private Long id;
    private String name;
    private Double price;
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
