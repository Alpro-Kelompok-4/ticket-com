package org.kelompok4.app.Repo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RwStationRepo {
    private final ObjectMapper mapper = new ObjectMapper();
    String path = System.getProperty("user.dir") + "\\RwStationModel_1.json";
    
    public void create(RwStationModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            JsonNode node = mapper.valueToTree(model);
            
            ((ArrayNode) root).add(node);
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<RwStationModel> getAll() {
        ArrayList<RwStationModel> list = new ArrayList<>();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                list.add(mapper.treeToValue(node, RwStationModel.class));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public RwStationModel get(String id) {
        RwStationModel model = new RwStationModel();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                if (node.path("rwStationCode").asText().equals(id)) {
                    model = mapper.treeToValue(node, RwStationModel.class);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void update(RwStationModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("rwStationCode").asText().equals(model.getRwStationCode())) {
                    ((ArrayNode) root).set(i, mapper.valueToTree(model));
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(RwStationModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("rwStationCode").asText().equals(model.getRwStationCode())) {
                    ((ArrayNode) root).remove(i);
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
