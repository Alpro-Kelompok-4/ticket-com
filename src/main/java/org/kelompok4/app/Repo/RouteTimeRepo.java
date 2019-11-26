package org.kelompok4.app.Repo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import org.kelompok4.app.Model.RouteTimeModel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RouteTimeRepo {
    private final ObjectMapper mapper = new ObjectMapper();
    String path = System.getProperty("user.dir") + "\\RouteTimeModel.json";
    
    public void create(RouteTimeModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            JsonNode node = mapper.valueToTree(model);
            
            ((ArrayNode) root).add(node);
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void create(ArrayList<RouteTimeModel> list){
        try {
            JsonNode root = mapper.valueToTree(list);
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<RouteTimeModel> getAll() {
        ArrayList<RouteTimeModel> list = new ArrayList<>();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                list.add(mapper.treeToValue(node, RouteTimeModel.class));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public RouteTimeModel get(String id) {
        RouteTimeModel model = new RouteTimeModel();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                if (node.path("routeTimeCode").asText().equals(id)) {
                    model = mapper.treeToValue(node, RouteTimeModel.class);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void update(RouteTimeModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("routeTimeCode").asText().equals(model.getRouteTimeCode())) {
                    ((ArrayNode) root).set(i, mapper.valueToTree(model));
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(ArrayList<RouteTimeModel> list){
        deleteAll();
        create(list);
    }
    
    public void delete(RouteTimeModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("routeTimeCode").asText().equals(model.getRouteTimeCode())) {
                    ((ArrayNode) root).remove(i);
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteAll(){
        try {
            JsonNode root = mapper.readTree(new File(path));
            ((ArrayNode) root).removeAll();
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
