package Criminals.Util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenerateTable {

    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");

        factory.close();
    }
}
