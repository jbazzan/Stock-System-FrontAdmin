package com.mycompany.stock.system.frontadmin.api;

import com.google.gson.JsonObject;
import com.mycompany.stock.system.frontadmin.igu.LoginFrame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClientPut extends ApiClient{
    public static JsonObject put(String endpoint, Object data) throws IOException {
        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        
        String token = LoginFrame.authToken;
        if (token != null && !token.isEmpty()) {
            conn.setRequestProperty("Authorization", "Bearer " + token);
        }

        String json = gson.toJson(data);
        try (OutputStream os = conn.getOutputStream()) {
            os.write(json.getBytes("utf-8"));
        }
        
        System.out.println("data send: " + data);

        return readResponse(conn);
    }

    private static JsonObject readResponse(HttpURLConnection conn) throws IOException {
        int responseCode = conn.getResponseCode();
        InputStream responseStream = (responseCode >= 200 && responseCode < 300)
                ? conn.getInputStream()
                : conn.getErrorStream();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(responseStream))) {
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
