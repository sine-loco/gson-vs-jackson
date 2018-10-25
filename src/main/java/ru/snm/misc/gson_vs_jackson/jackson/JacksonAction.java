package ru.snm.misc.gson_vs_jackson.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.snm.misc.gson_vs_jackson.dto.Simple;

/**
 * @author sine-loco
 */
public class JacksonAction {
    public String serializeAsIs( Simple simple ) {
        try {
            return new ObjectMapper().writeValueAsString( simple );
        } catch ( JsonProcessingException e ) {
            throw new RuntimeException( e );
        }
    }
}
