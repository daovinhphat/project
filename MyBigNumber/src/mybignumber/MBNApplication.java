/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;


public class MBNApplication implements IReceiver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String draft = sc.next();
        String s1 = sc.next();
        String s2 = sc.next();
        MBNApplication app = new MBNApplication();
        MyBigNumber mbn = new MyBigNumber(app);
        String result = mbn.sum(s1, s2);
        System.out.println("Final result: " + result);
    }
    
    public void print(String s){
        System.out.print(s);
        
    }
}
