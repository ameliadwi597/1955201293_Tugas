/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class arraymultidimensi {
    public static void main(String[] args) {
        int[][]bil ={{1,2,3}, {4,5,6}, {7,8,9} };
        
        for (int b=0; b<3; b++){
            System.out.println("{");
            for (int k=0; k<3; k++){
                System.out.println("bil[b][k]");
            }
            System.out.println("}");
            System.out.println();
        }
        
    }
    
}
