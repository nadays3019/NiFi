package com.example.demo.dto;

public class ResponseDTO<T> {
    private Header header;
    private T body;

    // Constructor
    public ResponseDTO(Header header, T body) {
        this.header = header;
        this.body = body;
    }

    // Getter & Setter
    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}