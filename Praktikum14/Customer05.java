package Praktikum14;

public class Customer05 {
    public int id;
    public String name;
    public Customer05() {
    }

    public Customer05(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return " ID: " + this.id + " Nama: " + this.name;
    }
}
