package org.kelompok4.app.Repo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class BookingRepo {
    private final ObjectMapper mapper = new ObjectMapper();
    String path = System.getProperty("user.dir") + "\\BookingModel_1.json";
    
    public void create(BookingModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            JsonNode node = mapper.valueToTree(model);
            
            ((ArrayNode) root).add(node);
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<BookingModel> getAll() {
        ArrayList<BookingModel> list = new ArrayList<>();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                list.add(mapper.treeToValue(node, BookingModel.class));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public BookingModel get(String id) {
        BookingModel model = new BookingModel();
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (JsonNode node : root) {
                if (node.path("bookingCode").asText().equals(id)) {
                    model = mapper.treeToValue(node, BookingModel.class);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void update(BookingModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("bookingCode").asText().equals(model.getBookingCode())) {
                    ((ArrayNode) root).set(i, mapper.valueToTree(model));
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void delete(BookingModel model) {
        try {
            JsonNode root = mapper.readTree(new File(path));
            for (int i = 0; i < root.size(); i++) {
                if (root.get(i).path("bookingCode").asText().equals(model.getBookingCode())) {
                    ((ArrayNode) root).remove(i);
                }
            }
            mapper.writeValue(new File(path), root);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
