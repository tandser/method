package ru.tandser.method.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonObjectMapper extends ObjectMapper {

    private static final ObjectMapper instance = new JacksonObjectMapper();

    private JacksonObjectMapper() {
        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static ObjectMapper getInstance() {
        return instance;
    }
}