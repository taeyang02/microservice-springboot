package com.taeduong.user.controller;
import com.taeduong.user.domain.dto.AccountDto;
import com.taeduong.user.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final IAccountService accountService;

    @PostMapping
    public ResponseEntity<AccountDto> create(@RequestBody AccountDto dto) {
        AccountDto createdAccount = accountService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> update(@PathVariable("id") Long id, @RequestBody AccountDto dto) {
        AccountDto updatedAccount = accountService.update(dto);
        return ResponseEntity.ok(updatedAccount);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AccountDto> delete(@PathVariable("id") Long id) {
        AccountDto deletedAccount = accountService.delete(id);
        return ResponseEntity.ok(deletedAccount);
    }

    @GetMapping("")
    public ResponseEntity<Page<AccountDto>> getAll(@RequestParam(defaultValue = "0") int page,
                                                   @RequestParam(defaultValue = "10") int size) {
        Page<AccountDto> accounts = (Page<AccountDto>) accountService.fillAll(PageRequest.of(page, size));
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(accountService.findById(id));
    }
}
