package day5.capg;

interface Sayable{  
     String say();  
}  
public class FuncInt{  
public static void main(String[] args) {  
    Sayable s=()->  "I have nothing to say.";  
    
    System.out.println(s.say());  
}  
}  