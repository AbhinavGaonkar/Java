/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author pc tech
 */
public class MethodOverloading {
   
    private int add(int a,int b)
    {
        return a+b;
    }
    private int add(byte a,int b)
    {
        return a+b;
    }
    private double add(double a,int b,int c)
    {
        return a+b+c;
    }
    private int add(int... number){
          int result=0;
        for(int x : number)
        {
            result+=x;
        }
        return result;
    }        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MethodOverloading mo=new MethodOverloading();
        System.out.println(mo.add(10,10));
        System.out.println(mo.add(9,255));
        System.out.println(mo.add(10.0,1,700));
        System.out.println(mo.add(1,2,3,4,5,6,7,8,9,10));
    }
    
}
