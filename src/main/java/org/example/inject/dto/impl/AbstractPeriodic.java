package org.example.inject.dto.impl;

import org.example.inject.dto.Periodic;

import java.io.Serializable;

public abstract class AbstractPeriodic implements Periodic, Serializable {

    protected boolean periodic = false;
    protected String name;

    public AbstractPeriodic() {
    }

    public AbstractPeriodic(String name) {
        this.name = name;
    }

    public AbstractPeriodic(boolean periodic, String name) {
        this.periodic = periodic;
        this.name = name;
    }

    @Override
    public boolean isPeriodic() {
        return periodic;
    }

    public void setPeriodic(boolean periodic) {
        this.periodic = periodic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractPeriodic{" +
                "name='" + name + '\'' +
                '}';
    }
}