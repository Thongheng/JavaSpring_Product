package org.rupp.products.Controller;

import org.rupp.products.Entity.Product;
import org.rupp.products.Services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/Product/")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProduct(){
        return productService.getProduct();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable("id") int id){
        return productService.getProductById(id);
    }

    @PostMapping()
    public void addNewProduct(@RequestBody Product product){
        productService.addNewProduct(product);
    }

    @PutMapping()
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
}
