package com.example.graphqlserver.schematype;

public class Genera {

    String id;

    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genera(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Genera getGenerabyId(String id) {
        return new Genera(id, "name");
    }
}
