package com.example.mongo.mongoapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private int admNo;
    private String name;
    private String college;
    private String city;
}
