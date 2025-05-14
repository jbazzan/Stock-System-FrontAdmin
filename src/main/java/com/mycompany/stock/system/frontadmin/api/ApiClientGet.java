package com.mycompany.stock.system.frontadmin.api;

import com.google.gson.JsonObject;
import com.mycompany.stock.system.frontadmin.igu.LoginFrame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClientGet extends ApiClient {
     public static JsonObject get(String endpoint) throws IOException {
        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        
        String token = LoginFrame.authToken;
        if (token != null && !token.isEmpty()) {
            conn.setRequestProperty("Authorization", "Bearer " + token);
        }

        try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            
            System.out.println("Response: " + response);

            return gson.fromJson(response.toString(), JsonObject.class);
        }
    }
}
