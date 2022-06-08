package com.UTN.TP.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "person")
public class Person {

    @Id
    private long id;

    private String name;

    private String lastname;
}
