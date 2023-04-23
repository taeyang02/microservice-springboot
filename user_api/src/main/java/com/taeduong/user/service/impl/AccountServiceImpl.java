package com.taeduong.user.service.impl;

import com.taeduong.user.domain.dto.AccountDto;
import com.taeduong.user.domain.mapper.servicemapper.IAccountMapperService;
import com.taeduong.user.domain.model.Account;
import com.taeduong.user.reponsitory.AccountRepository;
import com.taeduong.user.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements IAccountService {
    private final AccountRepository accountRepository;
    private final IAccountMapperService mapper;

    @Override
    public AccountDto create(AccountDto dto) {
        Account account = mapper.toEntity(dto);
        accountRepository.save(account);
        return mapper.toDto(account);
    }

    @Override
    public AccountDto update(AccountDto dto) {
        Account account = mapper.toEntity(dto);
        accountRepository.save(account);
        return mapper.toDto(account);
    }

    @Override
    public AccountDto delete(Long aLong) {
        Account account = accountRepository.findById(aLong).orElse(null);
        account.setStatus(false);
        accountRepository.save(account);
        return mapper.toDto(account);
    }

    @Override
    public Page<?> fillAll(Pageable pageable) {
        Page<Account> accounts = accountRepository.findAll(pageable);
        return accounts;
    }

    @Override
    public AccountDto findById(Long aLong) {
        Account account = accountRepository.findById(aLong)
                .orElseThrow(() -> new RuntimeException("Account not found"));
        return mapper.toDto(account);
    }
}
