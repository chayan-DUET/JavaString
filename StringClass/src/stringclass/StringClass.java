/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass;

/**
 *
 * @author Chayan_pc
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="Dhaka";
       // String s="D";
        //s1=s+s1;
        String s2="Dhaka";
        //String s2=new String("Dhaka");
        
        if(s1==s2)
        {
            System.out.println("== check object refarence:");
        }
        else
        {
            System.out.println("s1&s2 are not same oject");
        }
        if(s1.equals(s2))
        {
            System.out.println("equl oparator check same valu");
        }
        else
        {
            System.out.println("not same");
        }
        
        
        
        String s3=new String("string");
        String s4=new String("string");
        //s3=s4;
        if(s3==s4)
        {
            System.out.println("s3 and s4 is same");
        }
        else
        {
            System.out.println("s3 and s4 not same");
        }
        
        //--------------Buffer class-------------
        StringBuffer sb=new StringBuffer("Dhaka");
          sb.append(" Bangldesh");
          System.out.println(sb);
          
          //---------------string-----------------
          
          String s="Dhaka";
          s=s.concat(" Bangladesh");
          System.out.println(s);
    }
}
