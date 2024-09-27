package com.svgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    private static Connection conn;
    private static Statement state;
    public static void main(String[] args) {
        createDB();
        menu();
    }

    public static void createDB() {
        String url = "jdbc:sqlite:./src/main/resources/users.db";
        try{
            conn = DriverManager.getConnection(url);
            state = conn.createStatement();
            String query = "CREATE TABLE users(userId TEXT, password TEXT, role TEXT)";
            state.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("You Suck");
            System.out.println(e);
        }

    }

    public static void menu() {
        System.out.println("1. Create User")
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        if (choice.equals("1")) {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            System.out.print("Role: ");
            String role = input.nextLine();
        }
    }

    public static void createUser(String u, String p, String r) {
        
    }
}
        /*try {
            Connection conn = DriverManager.getConnection(url);
            Statement state = conn.createStatement();

            String query = "UPDATE FirstName='Garfield',LastName='Andrew' WHERE FirstName='Andrew' AND LastName = 'Adams'";
            state.executeUpdate(query);

            query = "SELECT * FROM employees";
            state.executeUpdate(query);

            
        } catch(Exception e) {
            System.out.println(e);
        }*/