package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObjectWrapperInternal {
    private List<ObjectInternal> values;

    @SuppressWarnings("unchecked")
    @JsonProperty("values")
    private void unpackNested(Map<String, ObjectInternal> innerValues) {
       values = new ArrayList<>(innerValues.values());
    }
}
