package org.example.inject.dto.impl;

public class Magazine extends AbstractPeriodic {

    private String description;

    public Magazine(String description) {
        this.description = description;
    }

    public Magazine(String name, String description) {
        super(name);
        this.description = description;
    }

    public Magazine(boolean periodic, String name, String description) {
        super(periodic, name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
