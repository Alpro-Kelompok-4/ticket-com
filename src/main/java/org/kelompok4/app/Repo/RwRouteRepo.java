package org.kelompok4.app.Repo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RwRouteRepo {
    private final ObjectMapper mapper = new ObjectMapper();
    String path = System.getProperty("user.dir") + "\\RwRouteModel.json";
    
    public void create(RwRouteModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            JsonNode node = mapper.valueToTree(model);
            
            ((ArrayNode) root).add(node);
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<RwRouteModel> getAll() {
        ArrayList<RwRouteModel> list = new ArrayList<>();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                list.add(mapper.treeToValue(node, RwRouteModel.class));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public RwRouteModel get(String id) {
        RwRouteModel model = new RwRouteModel();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                if (node.path("rwRouteCode").asText().equals(id)) {
                    model = mapper.treeToValue(node, RwRouteModel.class);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void update(RwRouteModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("rwRouteCode").asText().equals(model.getRwRouteCode())) {
                    ((ArrayNode) root).set(i, mapper.valueToTree(model));
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(RwRouteModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("rwRouteCode").asText().equals(model.getRwRouteCode())) {
                    ((ArrayNode) root).remove(i);
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
