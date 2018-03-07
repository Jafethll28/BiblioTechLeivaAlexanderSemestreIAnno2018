/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materials;

import static Materials.Materials2.Materials;
import java.util.ArrayList;

/**
 *
 * @author Jafeth Leiva
 */
public class AudioVisual extends Materials2{
    
    public AudioVisual(String materialsId, String name, int quantity, String kind) {
        super(materialsId, name, quantity, kind);
    }
    
    public void addAudio(){
        //método registrar libros
        ArrayList<String> data = new ArrayList<>();
        data.add(name);
        String quantity2 = Integer.toString(quantity);
        data.add(quantity2);
        data.add(kind);
        Materials.put(materialsId,data);
    }
    
    public void printear(){
        System.out.println(name + materialsId);
    }
    
}
