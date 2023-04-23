package com.taeduong.product.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService <T,ID>{
    T create(T dto);
    T update(T dto);
    T delete(ID id);
    Page<?> fillAll(Pageable pageable);
    T findById(ID id);
}
