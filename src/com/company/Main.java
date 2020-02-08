package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        User user = new User();
        for (int i = 0; ; i++) {
            System.out.println("Введите имя: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Введите возраст: ");
            int age = scanner.nextInt();


            try {
                user.setName();
                user.setAge();
            }catch (IllegalNameLengthExeption e ) {
                System.out.println(e.getMessage());
            }    catch (IllegalAgeExeption ie ){
                    System.out.println(ie.getMessage());
            }

        }
    }






    }

