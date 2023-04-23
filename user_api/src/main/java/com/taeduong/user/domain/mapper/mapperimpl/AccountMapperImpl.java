package com.taeduong.user.domain.mapper.mapperimpl;

import com.taeduong.user.domain.dto.AccountDto;
import com.taeduong.user.domain.mapper.servicemapper.IAccountMapperService;
import com.taeduong.user.domain.model.Account;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AccountMapperImpl implements IAccountMapperService {
    private final ModelMapper mapper;

    @Override
    public Account toEntity(AccountDto dto) {
        return mapper.map(dto,Account.class);
    }

    @Override
    public AccountDto toDto(Account entity) {
        return mapper.map(entity,AccountDto.class);
    }
}
