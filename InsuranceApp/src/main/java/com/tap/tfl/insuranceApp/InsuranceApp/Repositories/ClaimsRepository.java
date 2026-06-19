package com.tap.tfl.insuranceApp.InsuranceApp.Repositories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;

public class ClaimsRepository {

    private static final String FILE_NAME =
            "C:\\TAP\\MygitRepo\\.NET\\InsuranceRestAPIApp\\InsuranceRestAPIApp\\Data\\claims.json";

    private ObjectMapper objectMapper = new ObjectMapper();
    
    public List<Claim> getAllRegisterClaim() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            return objectMapper.readValue(file, new TypeReference<List<Claim>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public boolean saveRegisterClaim(List<Claim> claims) {
        try {
            objectMapper.writeValue(new File(FILE_NAME), claims);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}