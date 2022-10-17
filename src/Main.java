import java.util.HashSet;
import java.util.Set;

public class Main {
    private Set<Products> productsSet = new HashSet<>();
    public void addP(Products p){
        if(productsSet.contains(p)){
            System.out.println(p.getName() + " уже куплен");
        }
    }
    public static void main(String[] args) {
        Main m=new Main();
        Products apple = new Products("Яблоки", 11.11f, 1.11f);
        Products banana = new Products("Бананы", 11.11f, 1.11f);
        Products banana1 = new Products("Бананы", 22.22f, 2.22f);
        m.productsSet.add(apple);
        m.productsSet.add(banana);
        m.productsSet.add(banana1);
        m.addP(banana1);

        System.out.println(m.productsSet);
    }
}
