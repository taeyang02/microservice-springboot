package com.taeduong.product.service.impl;

import com.taeduong.product.domain.dto.ProductDto;
import com.taeduong.product.domain.mapper.mapperimpl.ProductMapper;
import com.taeduong.product.domain.model.Product;
import com.taeduong.product.service.IPorductService;
import com.taeduong.product.reponsitory.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements IPorductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductDto create(ProductDto dto) {
        Product product = productMapper.toEntity(dto);
        product = productRepository.save(product);
        return productMapper.toDto(product);
    }

    @Override
    public ProductDto update(ProductDto dto) {
        Optional<Product> optionalProduct = productRepository.findById(dto.getId());
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(dto.getName());
            product.setDescription(dto.getDescription());
            product.setPrice(dto.getPrice());
            product = productRepository.save(product);
            return productMapper.toDto(product);
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    @Override
    public ProductDto delete(Long id) {
        Product productold = productRepository.findById(id).orElse(null);
        productold.setStatus(false);
        Product product = productRepository.save(productold);
        return productMapper.toDto(product);

    }

    @Override
    public Page<?> fillAll(Pageable pageable) {
        Page<Product> products = productRepository.findAll(pageable);
        return products;
    }

    @Override
    public ProductDto findById(Long aLong) {
        Optional<Product> optionalProduct = productRepository.findById(aLong);
        if (optionalProduct.isPresent()) {
            return productMapper.toDto(optionalProduct.get());
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
