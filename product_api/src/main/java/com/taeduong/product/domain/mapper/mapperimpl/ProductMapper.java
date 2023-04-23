package com.taeduong.product.domain.mapper.mapperimpl;

import com.taeduong.product.domain.dto.ProductDto;
import com.taeduong.product.domain.mapper.servicemapper.IProductMapper;
import com.taeduong.product.domain.model.Product;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductMapper implements IProductMapper {

    private final ModelMapper modelMapper;
    @Override
    public Product toEntity(ProductDto dto) {
        return modelMapper.map(dto, Product.class);
    }

    @Override
    public ProductDto toDto(Product entity) {
        return modelMapper.map(entity, ProductDto.class);
    }
}
