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
public class BeameryInternalContact {
    private BeameryObjectWrapperInternal tags;
    private BeameryObjectWrapperInternal languages;
    private BeameryObjectWrapperInternal links;
    private BeameryObjectWrapperInternal phoneNumbers;
    private BeameryObjectWrapperInternal skills;
    private BeameryObjectWrapperInternal emails;
    private Set<String> middleNames;
}
