package com.tap.tfl.insuranceApp.InsuranceApp.Repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Policy;

public class PolicyRepository {

    private static final String FILE_NAME="";
    private ObjectMapper objectMapper=new ObjectMapper();
    
    public List<Policy> GetAllPolicies()
    {
        try{
            File file =new File(FILE_NAME);
            if(!file.exists()){
                return new ArrayList<>();
            }
            return objectMapper.readValue(file,new TypeReference<List<Policy>>(){});
        }
        catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
        // string fileName = @"C:\TAP\MygitRepo\.NET\InsuranceRestAPIApp\InsuranceRestAPIApp\Data\policies.json";
        // string jsonString = File.ReadAllText(fileName);
        // var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
        // List<Policy>? policies = JsonSerializer.Deserialize<List<Policy>>(jsonString, options);
        // return policies;
    }


    public boolean saveAllPolicies(List<Policy> policies)
    {
        boolean status=false;
        try {
            objectMapper.writeValue(new File(FILE_NAME),policies);
            status=true;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }
        
        // bool status = false;
        // string fileName = @"C:\TAP\MygitRepo\.NET\InsuranceRestAPIApp\InsuranceRestAPIApp\Data\policies.json";
        // var options = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
        // string jsonString = JsonSerializer.Serialize(policies, options);
        // File.WriteAllText(fileName, jsonString);
        // status = true;
        // return status;
    }
}
