package com.mycompany.stock.system.frontadmin.api;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ApiClientPost extends ApiClient {
    
    public static JsonObject post(String endpoint, Object data) throws IOException
    {
        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String json = gson.toJson(data);
        try (OutputStream os = conn.getOutputStream()) {
            os.write(json.getBytes(StandardCharsets.UTF_8));
        }
        return readResponse(conn);
    }
    
    private static JsonObject readResponse(HttpURLConnection conn) throws IOException
    {
        int responseCode = conn.getResponseCode();
        InputStream responseStream = (responseCode >= 200 && responseCode < 300)
                ? conn.getInputStream()
                : conn.getErrorStream();
        
        try(BufferedReader in = new BufferedReader(new InputStreamReader(responseStream)))
        {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null)
            {
                response.append(line);
            }
            return gson.fromJson(response.toString(), JsonObject.class);
        }
    }
}
