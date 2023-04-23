package com.taeduong.product.domain.mapper.servicemapper;

import com.taeduong.product.domain.dto.ProductDto;
import com.taeduong.product.domain.mapper.base.IModelMapper;
import com.taeduong.product.domain.model.Product;
import org.springframework.stereotype.Component;

public interface IProductMapper extends IModelMapper<ProductDto, Product> {
}
