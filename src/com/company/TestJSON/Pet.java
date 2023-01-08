package com.company.TestJSON;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property="TYPE")
//@JsonSubTypes({
//        @JsonSubTypes.Type(value=Cat.class, name="cat"),
//        @JsonSubTypes.Type(value=Dog.class, name="dog")
//})
public class Pet {
    protected String name;

}
