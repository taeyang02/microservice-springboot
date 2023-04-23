package com.taeduong.user.domain.mapper.servicemapper;

import com.taeduong.user.domain.dto.AccountDto;
import com.taeduong.user.domain.mapper.base.IModelMapper;
import com.taeduong.user.domain.model.Account;
import org.springframework.stereotype.Component;

public interface IAccountMapperService extends IModelMapper<AccountDto, Account> {
}
