package com.transflower.Repositories;

import java.io.File;
import java.io.IOException;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.transflower.Models.Accounts;
import com.transflower.Models.Operation;

public class AccountRepository {

    private static final String file_name = "D:\\TAP\\GITHUB\\Java_Programming\\BankingApp\\src\\main\\java\\com\\transflower\\data\\account.json";
    private static final String transfer_file = "D:\\TAP\\GITHUB\\Java_Programming\\BankingApp\\src\\main\\java\\com\\transflower\\data\\operation.json";

    private ObjectMapper objectMapper = new ObjectMapper();
    Scanner sc = new Scanner(in);

    public List<Accounts> getAll() {
        try {
            File file = new File(file_name);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return objectMapper.readValue(file, new TypeReference<List<Accounts>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<Accounts> getAllOprations() {
        try {
            File file = new File(transfer_file);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return objectMapper.readValue(file, new TypeReference<List<Accounts>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void save(List<Accounts> accounts) throws IOException {
        File file = new File(file_name);
        objectMapper.writeValue(file, accounts);
    }

    public void saveOperation(List<Operation> operations) throws IOException {
        File file = new File(transfer_file);
        objectMapper.writeValue(file, operations);
    }

    public List<Operation> getAllOperation() {
        try {
            File file = new File(transfer_file);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return objectMapper.readValue(file, new TypeReference<List<Operation>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
