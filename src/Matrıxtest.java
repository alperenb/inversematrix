/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alperen
 */
public class Matrıxtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Matrıx demo= new Matrıx();
      demo.create_Matrıx();
      demo.display_Matrıx();
        System.out.println("Determinant :"+demo.calculate_Determinant());
       
        demo.display_IM();
    
    
     
        // TODO code application logic here
    }
    
}
