package com.mycompany.stock.system.frontadmin.api;

import com.mycompany.stock.system.frontadmin.igu.LoginFrame;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClientDelete extends ApiClient{
    public static int delete(String endpoint) throws IOException {
        URL url = new URL(BASE_URL + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("DELETE");
        
        String token = LoginFrame.authToken;
        if (token != null && !token.isEmpty()) {
            conn.setRequestProperty("Authorization", "Bearer " + token);
        }
        
        System.out.println(conn.getResponseCode());

        return conn.getResponseCode(); // Para saber si fue 200, 204, 404, etc.
    }
}
