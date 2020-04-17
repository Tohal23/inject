package org.example.inject.dto.impl;

import java.io.Serializable;

public class Booklet extends AbstractPeriodic implements Serializable {

    public Booklet() {
    }

    public Booklet(String name) {
        super(name);
    }

    public Booklet(boolean periodic, String name) {
        super(periodic, name);
    }

}
