package org.example.inject.dto.impl;

public class Newspaper extends AbstractPeriodic {

    public Newspaper() {
    }

    public Newspaper(String name) {
        super(name);
    }

    public Newspaper(boolean periodic, String name) {
        super(periodic, name);
    }
}
