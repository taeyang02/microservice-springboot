package com.taeduong.user.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBaseService<T,ID>{
    T create(T dto);
    T update(T dto);
    T delete(ID id);
    Page<?> fillAll(Pageable pageable);
    T findById(ID id);
}
