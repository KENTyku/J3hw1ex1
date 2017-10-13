/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3hw1ex1;
/**
 *
 * @author user
 */
public class ArrayObj {
    Obj[] ar;
    ArrayObj(Obj[] ar){
       this.ar = ar;
    }
    /*void arraySet(Obj a0,Obj a1){
            ar[0]=a0;
            ar[1]=a1;
    }
    */
    ArrayObj arrayChange(ArrayObj mas){
            Obj c = mas.ar[0];
            mas.ar[0] = mas.ar[1];
            mas.ar[1] = c;
            return mas;
    }	
}
