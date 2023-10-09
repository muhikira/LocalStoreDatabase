package com.example.localstoredatabase.service;

import com.example.localstoredatabase.dto.ProductDTO;
import com.example.localstoredatabase.entity.Product;
import com.example.localstoredatabase.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    @Override
    public Product createProduct(ProductDTO productDto) {
        Product product = new Product ();
        product.setProductName (productDto.getProductName ());
        product.setProductDesc (productDto.getProductDesc ());
        product.setProdManfacName (productDto.getProdManfacName ());

        return productRepository.save (product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll ();
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById (productId).orElse (null);
    }

    @Override
    public Product updateProduct(Long productId, ProductDTO productDto) {
        Product existingProduct = productRepository.findById (productId).orElse (null);
        if (existingProduct != null){
            existingProduct.setProductName (productDto.getProductName ());
            existingProduct.setProductDesc (productDto.getProductDesc ());
            existingProduct.setProdManfacName (productDto.getProdManfacName ());
            return productRepository.save (existingProduct);
        }else
        // Handle the case where the project doesn't exist
        return null;

    }

    @Override
    public void deleteProduct(Long productId) {productRepository.deleteById (productId);

    }
}
