package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {

    Account findAccountById(Integer id);

    List<Account> findAll();
}
