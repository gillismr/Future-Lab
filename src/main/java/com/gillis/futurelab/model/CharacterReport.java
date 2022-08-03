package com.gillis.futurelab.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterReport {

    private String name;
    private String id;
    private List<String> aliases;
    private Instant birthDate;
    private String birthPlace;


}
