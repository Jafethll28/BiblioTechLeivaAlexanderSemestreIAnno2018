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
    
    static ArrayList<String> names = new ArrayList<>();
    
    public AudioVisual(String materialsId, String name, int quantity, String kind) {
        super(materialsId, name, quantity, kind);
    }

    public void addAudio(){
        //método registrar materiales audioVisuales
        ArrayList<String> data = new ArrayList<>();
        names.add(name);
        data.add(materialsId);
        String quantity2 = Integer.toString(quantity);
        data.add(quantity2);
        data.add(kind);
        Materials.put(name,data);
    }

    public static ArrayList<String> getNames() {
        return names;
    }

    public static void setNames(ArrayList<String> names) {
        AudioVisual.names = names;
    }
     //prueba de datos
    public void printear(){
        System.out.println(name + materialsId);
    }
    
}
