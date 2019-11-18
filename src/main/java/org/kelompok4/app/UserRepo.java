package org.kelompok4.app;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UserRepo {
    private static final ObjectMapper mapper = new ObjectMapper();
    public UserRepo(){

    }
    public ArrayList<UserModel> readJson() {
        String path = System.getProperty("user.dir") + "\\User.json";
        ArrayList<UserModel> userList = new ArrayList<>();
        
        // Read Json
        try {
            JsonNode rootArray = mapper.readTree(new File(path));
            
            for (JsonNode root : rootArray) {
                String id = root.path("id").asText();               // get id
                String nama = root.path("nama").asText();       // get nama
                String noHP = root.path("noHP").asText();       // get noHP
                String email = root.path("email").asText();             // get email
                String password = root.path("password").asText();       // get password
                boolean isAdmin = root.path("isAdmin").asBoolean();     // get isAdmin
                
                UserModel user = new UserModel();
                user.setNoKTP(id);
                user.setNama(nama);
                user.setNoHP(noHP);
                user.setEmail(email);
                user.setPassword(password);
                user.setAdmin(isAdmin);
                userList.add(user);
            }
            
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return userList;
    }
    
}
