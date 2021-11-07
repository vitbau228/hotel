/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class Person {
    private String name;
    private int age;
    private String passport;
    private Room room;
    private int numberRent;
    private Scanner input = new Scanner(System.in);

    public Person() {
    }

    public Person(String name, int age, String passport, Room room, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.room = room;
        this.numberRent = numberRent;
    }

    public void inputInfo() {
        System.out.println("Nhap ten khach hang");
        this.name = input.nextLine();
        System.out.println("Nhap tuoi khach hang");
        this.age=Integer.parseInt(input.nextLine());
        System.out.println("nhap ma so passport");
        this.setPassport(input.nextLine());
        System.out.println("Chon loai phong 1 ~ 3");
        int choose;
        
        choose = Integer.parseInt(input.nextLine());
        switch (choose) {
            case 1:
                 this.room = new RoomA();
                break;
            case 2:
                 setRoom( new RoomB());
                break;
            case 3:
                room = new RoomC();
                break;
            default:
                System.out.println("nhap sai loai phong roi");
        }
        System.out.println("Nhap so ngay muon thue");
        this.setNumberRent(input.nextInt());
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", passport=" + passport + ", room=" + room + ", numberRent=" + numberRent + '}';
    }
    
    
    
}
