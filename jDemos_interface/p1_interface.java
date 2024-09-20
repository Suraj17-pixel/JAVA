package jDemos_interface;

interface if1 {
    public void add();
}

interface if2 {
    public void add();
}

class demo implements if1, if2 {
    @Override
    public void add() 
    {
        System.out.println("Add method implemented.");
    }
}

public class p1_interface {
    public static void main(String[] args) {
        demo d = new demo();
        d.add();
    }
}
