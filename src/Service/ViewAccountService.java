/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Account;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public interface ViewAccountService {

    List<Account> getAll();

    Account getOne(String username,String pass);

    String add(Account a);
}
