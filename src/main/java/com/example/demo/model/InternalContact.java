package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InternalContact {
    private ObjectWrapperInternal tags;
    private ObjectWrapperInternal languages;
    private ObjectWrapperInternal links;
    private ObjectWrapperInternal phoneNumbers;
    private ObjectWrapperInternal skills;
    private ObjectWrapperInternal emails;
    private Set<String> middleNames;
}
