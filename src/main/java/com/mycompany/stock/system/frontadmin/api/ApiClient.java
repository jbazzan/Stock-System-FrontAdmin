package com.mycompany.stock.system.frontadmin.api;

import com.google.gson.Gson;

public class ApiClient {
    protected static final String BASE_URL = "http://127.0.0.1:8000/api";
    public static final Gson gson = new Gson();
}
