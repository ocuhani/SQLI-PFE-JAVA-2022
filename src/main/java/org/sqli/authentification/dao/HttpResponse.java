package org.sqli.authentification.dao;

import java.util.Date;

public class HttpResponse {
    private String error;

    public HttpResponse(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
