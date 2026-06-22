package com.transflower.Repositories;

import java.io.IOException;
import java.util.List;

import com.transflower.Models.Account;
import com.transflower.Models.Operation;

public interface AccountRepository {
    public List<Account> getAll();
    public void save(List<Account> accounts);
    public List<Operation> getAllOperation() throws IOException;
    public void saveOperation(List<Operation> operations);
}
