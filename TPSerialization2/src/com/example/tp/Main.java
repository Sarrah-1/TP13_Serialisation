package com.example.tp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String filePath = "employees.ser";

        List<Employee> staff = new ArrayList<>();
        staff.add(new Employee(1, "Sara", 3000.0, "sara123"));
        staff.add(new Employee(2, "Amina", 3500.5, "amina123"));
        staff.add(new Employee(3, "Inas", 2800.75, "inas123"));

        try {
            SerializationUtil.serializeEmployees(filePath, staff);
            System.out.println("Sérialisation réussie dans " + filePath);
        } catch (IOException e) {
            System.err.println("Erreur de sérialisation : " + e.getMessage());
            return;
        }

        List<Employee> loaded;
        try {
            loaded = SerializationUtil.deserializeEmployees(filePath);
            System.out.println("Désérialisation réussie, objets restaurés :");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur de désérialisation : " + e.getMessage());
            return;
        }

        for (Employee emp : loaded) {
            System.out.println("  " + emp);
        }

        System.out.println("\nNote : le champ 'password' est transient, il n’a pas été enregistré → null.");
    }
}
