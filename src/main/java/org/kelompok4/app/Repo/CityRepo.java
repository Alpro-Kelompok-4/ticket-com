package org.kelompok4.app.Repo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CityRepo {
    private final ObjectMapper mapper = new ObjectMapper();
    String path = System.getProperty("user.dir") + "\\CityModel_1.json";
    
    public void create(CityModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            JsonNode node = mapper.valueToTree(model);
            
            ((ArrayNode) root).add(node);
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<CityModel> getAll() {
        ArrayList<CityModel> list = new ArrayList<>();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                list.add(mapper.treeToValue(node, CityModel.class));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public CityModel get(String id) {
        CityModel model = new CityModel();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                if (node.path("cityCode").asText().equals(id)) {
                    model = mapper.treeToValue(node, CityModel.class);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void update(CityModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("cityCode").asText().equals(model.getCityCode())) {
                    ((ArrayNode) root).set(i, mapper.valueToTree(model));
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(CityModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("cityCode").asText().equals(model.getCityCode())) {
                    ((ArrayNode) root).remove(i);
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
