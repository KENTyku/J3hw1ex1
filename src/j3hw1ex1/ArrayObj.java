/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3hw1ex1;
/**
 *
 * @author Yuri Tveritin
 */
public class ArrayObj {
    Obj[] ar;
    ArrayObj(Obj[] ar){
       this.ar = ar;
    }
    ArrayObj arrayChange(ArrayObj mas){
            Obj c = mas.ar[0];
            mas.ar[0] = mas.ar[1];
            mas.ar[1] = c;
            return mas;
    }	
}
