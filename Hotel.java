/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hello VIỆT
 */
public class Hotel {
    private List<Person> persons = new ArrayList<>();
    
    public void add(Person person) {
        this.persons.add(person);
    }
    public void delete(String passport) {
        if(!(this.persons.size() == 0)) {
            boolean searched = false;
            for(int i =0;i < persons.size();i++) {
                if(persons.get(i).getPassport().equals(passport)) {
                    persons.remove(i);
                    searched = true;
                    break;
                }
            }
            if(!searched) {
                System.out.println("Khong co ten trong danh sach");
            }
        }else {
            System.out.println("Danh Sach Trong ");
        }
    }
    
    public int calculator(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if(person == null) {
            return 0;
        }
        return person.getRoom().getPrice()*person.getNumberRent();
    }
    
    public void show() {
        persons.forEach(p ->System.out.println(p.toString()) );
    }

  
    
}
