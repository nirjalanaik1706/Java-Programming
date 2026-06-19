package com.tap.tfl.insuranceApp.InsuranceApp.Repositories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Premium;

public class PremiumRepository {
    private static final String File_Path="";
    private ObjectMapper objectMapper=new ObjectMapper();

    public List<Premium> getAllPremiums(){
        try{
            File file=new File(File_Path);
            if(!file.exists()){
                return new ArrayList<>();
            }
            return objectMapper.readValue(file,new TypeReference<List<Premium>>(){});
        }
        catch(IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public boolean saveAllPremium(List<Premium> premiums)
    {
        boolean status = false;
        try {
            objectMapper.writeValue(new File(File_Path), premiums);
            status=true;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    }
}
