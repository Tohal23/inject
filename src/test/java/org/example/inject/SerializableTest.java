package org.example.inject;

import org.example.inject.dto.PeriodicList;
import org.example.inject.dto.impl.Book;
import org.example.inject.dto.impl.Booklet;
import org.example.inject.dto.impl.collection.PeriodicListImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class SerializableTest {

    @Test
    public void checkPeriodicSerializable() throws IOException, ClassNotFoundException {
        PeriodicListImpl periodicListSerializable = new PeriodicListImpl();
        periodicListSerializable.add(new Book(true, "Name book", "Author1"));
        periodicListSerializable.add(new Booklet(true, "Name booklet"));
        periodicListSerializable.add(new Book(false, "Name book2", "Author2"));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("person.out"));
        objectOutputStream.writeObject(periodicListSerializable);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("person.out"));
        PeriodicList periodicListDeseializable = (PeriodicList) objectInputStream.readObject();
        objectInputStream.close();

        String periodicListSerializableStr = periodicListSerializable.toString();
        String periodicListDeseializableStr = periodicListDeseializable.toString();

        System.out.println(periodicListDeseializableStr);
        System.out.println(periodicListSerializableStr);

        Assert.assertNotEquals(periodicListDeseializableStr, periodicListSerializableStr);
    }

}
