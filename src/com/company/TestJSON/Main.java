package com.company.TestJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat("Murka", 4);
        Dog dog = new Dog("Haski", 5, 3.45f);
        House house = new House();


        house.addList(cat);
        house.addList(dog);

        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(writer, house);
        System.out.println(writer.toString());

    }

    static class House{
        public List<Pet> ourHousePets = new ArrayList<Pet>();

        public void addList(Pet pet) {this.ourHousePets.add(pet);}
       // public List<Pet> getList() {return ourHousePets;}
    }
}
