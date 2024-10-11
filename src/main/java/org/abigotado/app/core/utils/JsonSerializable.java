package org.abigotado.app.core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonSerializable {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static ObjectReader reader = mapper.readerFor(Object.class);
    public static ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
}
