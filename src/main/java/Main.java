

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Main {
    public static void methodC() throws ExceptionC{
        System.out.println("inside the methodC...");
        
        throw new ExceptionC("my ExceptionC is thrown");
    }
         public static void methodB() throws ExceptionB{
        System.out.println("inside the methodC...");
         
        throw new ExceptionB("my ExceptionC is thrown");
        
    }
    public static void main(String[] args) {
        
        System.out.println("first line...before try");
        try{
            System.out.println("second line...top of try");
            methodC();
            System.out.println("third line...bottom of try");
        }catch (ExceptionA ea){
            System.out.println("fourth line...inside catch");
        }        
        finally {
            System.out.println("fifth line...inside finally");
        }
        System.out.println("sixth line line... last line of main");               
    }   
}
