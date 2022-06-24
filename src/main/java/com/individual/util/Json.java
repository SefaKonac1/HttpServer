package com.individual.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Json {
    private static ObjectMapper myObjectMapper = defaultObjectMapper();

    private static ObjectMapper defaultObjectMapper() {
        ObjectMapper om = new ObjectMapper();
        // parsing not crash in case of this situation
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 

        return om;
    }

    public static JsonNode parse(String jsonSrc) throws JsonMappingException, JsonProcessingException {
        return myObjectMapper.readTree(jsonSrc);
    }

    /* json node to conf pojo*/
    public static <A> A fromJson(JsonNode node, Class<A> clazz) throws JsonProcessingException {
        return myObjectMapper.treeToValue(node, clazz);
    }

    public static JsonNode toJson(Object obj) {
        return myObjectMapper.valueToTree(obj);
    }

    public static String stringfy(JsonNode node) {
        return generateJson(node, false);
    }

    private static String generateJson(Object o, boolean pretty) throws JsonProcessingException {
        ObjectWriter objectWriter = myObjectMapper.writer();
        return objectWriter.writeValueAsString(o);
    }


}
