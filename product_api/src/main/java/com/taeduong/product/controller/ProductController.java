package com.taeduong.product.controller;

import com.taeduong.product.VO.Account;
import com.taeduong.product.service.IPorductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.taeduong.product.domain.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private final IPorductService productService;
    private final RestTemplate restTemplate;

    @PostMapping("")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        ProductDto createdProductDto = productService.create(productDto);
        return new ResponseEntity<>(createdProductDto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        ProductDto productDto = productService.findById(id);
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<Page<?>> getAllProducts(Pageable pageable) {
        Page<ProductDto> productDtos = (Page<ProductDto>) productService.fillAll(pageable);
        return new ResponseEntity<>(productDtos, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
        if (!productDto.getId().equals(id)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        ProductDto updatedProductDto = productService.update(productDto);
        return new ResponseEntity<>(updatedProductDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDto> deleteProduct(@PathVariable Long id) {
        ProductDto deletedProductDto = productService.delete(id);
        return new ResponseEntity<>(deletedProductDto, HttpStatus.OK);
    }

    @GetMapping("get-user")
    public ResponseEntity<?> getUser() {
        Account account = restTemplate.getForObject("http://localhost:9001/api/accounts/1",Account.class);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
