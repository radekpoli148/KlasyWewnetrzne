/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klasywewnetrzne;

public class Klasywewnetrzne {

    public static void main(String[] args)
    {
        A zewnetrzna =new A(); //instancja klasy zewnetrznej
        
        A.B tmp = zewnetrzna.new B(); //instancja klasy zagniezdzonej
        
        A.C tmp2 = new A.C(); //klasę zagniezdzoną statyczną można stworzyć
                              //bez instancji klasy zewnętzrnej
    }
    
}

class A
{
    A()
    {
        System.out.println("Jestem z klasy zewnetrznej A");
    }
    class B 
    {
        B()
        {
            System.out.println("Jestem z klasy zagnieżdżonej B");
        }
        void cos()
        {
            test = 5;
        }
        private int tmp;
    }
    
    static class C
    {
        C()
        {
            System.out.println("Jestem z klasy zagniezdzonej C");
        }
    }
    void cos2()
    {
        //tmp = 2; nie mozna dzialac na zmiennych klasy wewnetrznej
        //cos(); nie mozna wywolac metody klacy wewnetrznej
        
        B obj = new B(); //mozna wywolac objekt klasy
    }
    
    private int test;
}