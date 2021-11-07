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
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while(true) {
            System.out.println("-----------------------------------------------");
            System.out.println("1: Them khach hang vao khach san");
            System.out.println("2: Xoa khach hang bang ma passport");
            System.out.println("3: Tinh tien thue phong cua khach hang");
            System.out.println("4: show thong tin");
            System.out.println("5: Thoat chuong trinh");
            System.out.println("-----------------------------------------------");
            int choose;
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                   Person person = new Person();
                   person.inputInfo();
                   hotel.add(person);
                    break;
                 case 2:
                     System.out.println("Nhap passport cua khach hang muon xoa");
                     hotel.delete(input.nextLine());
                    break;
                 case 3:
                     System.out.println("Nhap ma passport");
                     int money = hotel.calculator(input.nextLine());
                     System.out.println("So tien quy khach het la : "+ money);
                    break;
                case 4:
                    hotel.show();
                    break;
                case 5:
                    return;
                    
                default:
                    System.out.println("Nhap sai ");
                    
            }
        }
    }
}
