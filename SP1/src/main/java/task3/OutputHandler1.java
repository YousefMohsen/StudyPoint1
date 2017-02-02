package task3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alkhozai
 */
public class OutputHandler1 {

    public OutputHandler1() {
    }
    
    
    public String toUpper(String inStr){

        return   inStr.toUpperCase();
   
    }
    
    
        public String toLower(String inStr){

        return   inStr.toLowerCase();
   
    }
 public String reverse(String inStr){
     String result ="";
   for(int i=inStr.length()-1; i>=0; i--){
   result+=inStr.charAt(i);
   }
     
     
     return result; 
        
        }
    
    public String findType(String in){
   int index = in.indexOf("#");
    
    return in.substring(0, index);
    }
        public String findMessege(String in){
   int index = in.indexOf("#")+1;
    
    return in.substring(index);
    }
    public static void main(String[] args) {
        OutputHandler1 t = new OutputHandler1();
        
      String upper = "UPPER#Hello World";  
      String lower = "LOWER#Hello World";
      String reverse = "REVERSE#abcd";
      String translate = "TRANSLATE#hund";
        
     
      
     
       
  }
    
}
