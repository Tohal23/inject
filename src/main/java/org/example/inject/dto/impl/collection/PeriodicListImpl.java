package org.example.inject.dto.impl.collection;

import org.example.inject.dto.Periodic;
import org.example.inject.dto.PeriodicList;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PeriodicListImpl extends ArrayList<Periodic> implements PeriodicList {

    @Override
    public PeriodicList getPeriodic() {
        return (PeriodicList) this.stream()
                .filter((Periodic::isPeriodic))
                .collect(Collectors.toList());
    }
}