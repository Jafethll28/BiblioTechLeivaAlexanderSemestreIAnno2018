/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jafeth Leiva
 */
public class Materials2 {
    
    String materialsId;
    String name;
    int quantity;
    String kind;
    int index;
    
    //creación de Mapa de Hash y Array para almacenar datos
    static ArrayList<String> data = new ArrayList<>();
    Map Materials = new HashMap();
    
    public void addMaterials(){
        //método registrar materiales
        data.add(materialsId);
        data.add(name);
        String quantity2 = Integer.toString(quantity);
        data.add(quantity2);
        data.add(kind);
        Materials.put(materialsId,data);
        //index++;
    }
    
}
