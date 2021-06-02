/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujirect;

/**
 *
 * @author MOKLET-1
 */
public class UjiRect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rect baru1 = new Rect (1,1,4,4);
        Rect baru2 = new Rect (2,3,5,6);
        
        System.out.println("2,3 is inside the union");
        System.out.println(baru1+" union "+baru2+" ="+baru1.union(baru2));
        System.out.println(baru1+" intersect "+baru2+" ="+baru1.intersection(baru2));
        
        System.out.println(baru1.intersection(baru2)+" Digeser Sejauh (3,3)");
        baru1.move(3,3);
        baru2.move(3,3);
        System.out.println(baru1.intersection(baru2));
        
    }
    
}
