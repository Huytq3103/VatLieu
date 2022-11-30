/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Model.Account;
import Repository.AccountRepository;
import Service.ViewAccountService;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public class ViewAccountServiceImpl implements ViewAccountService {

    private AccountRepository ar = new AccountRepository();

    @Override
    public List<Account> getAll() {
        return ar.getAll();
    }

    @Override
    public Account getOne(String username, String pass) {
        return ar.getOne(username, pass);
    }

    @Override
    public String add(Account a) {
        if (ar.add(a)) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

}
