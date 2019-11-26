package org.kelompok4.app.Repo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class TimeRepo {
    private final ObjectMapper mapper = new ObjectMapper();
    String path = System.getProperty("user.dir") + "\\TimeModel.json";
    
    public void create(TimeModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            JsonNode node = mapper.valueToTree(model);
            
            ((ArrayNode) root).add(node);
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<TimeModel> getAll() {
        ArrayList<TimeModel> list = new ArrayList<>();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                list.add(mapper.treeToValue(node, TimeModel.class));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public TimeModel get(String id) {
        TimeModel model = new TimeModel();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                if (node.path("timeCode").asText().equals(id)) {
                    model = mapper.treeToValue(node, TimeModel.class);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void update(TimeModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("timeCode").asText().equals(model.getTimeCode())) {
                    ((ArrayNode) root).set(i, mapper.valueToTree(model));
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(TimeModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("timeCode").asText().equals(model.getTimeCode())) {
                    ((ArrayNode) root).remove(i);
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
