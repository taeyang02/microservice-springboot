package com.taeduong.user.service;

import com.taeduong.user.domain.dto.AccountDto;
import com.taeduong.user.service.base.IBaseService;
import org.springframework.stereotype.Service;

@Service
public interface IAccountService extends IBaseService<AccountDto,Long> {

}
