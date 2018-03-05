/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materials;

import Students.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jafeth Leiva
 */
public class Materials2 {
    //Atributos
    String materialsId;
    String name;
    int quantity;
    String kind;
    int index;

    public void setMaterialsId(String materialsId) {
        this.materialsId = materialsId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void setData(ArrayList<String> data) {
        Materials2.data = data;
    }

    public void setMaterials(Map Materials) {
        this.Materials = Materials;
    }

    public static void setMaterialsOnLoan(ArrayList<String> materialsOnLoan) {
        Materials2.materialsOnLoan = materialsOnLoan;
    }

    public void setMaterialsLoan(Map MaterialsLoan) {
        this.MaterialsLoan = MaterialsLoan;
    }

    public String getMaterialsId() {
        return materialsId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getKind() {
        return kind;
    }

    public int getIndex() {
        return index;
    }

    public static ArrayList<String> getData() {
        return data;
    }

    public Map getMaterials() {
        return Materials;
    }

    public static ArrayList<String> getMaterialsOnLoan() {
        return materialsOnLoan;
    }

    public Map getMaterialsLoan() {
        return MaterialsLoan;
    }
    
    //creación de Mapa de Hash y Array para almacenar datos
    static ArrayList<String> data = new ArrayList<>();
    Map Materials = new HashMap();
    static ArrayList<String> materialsOnLoan = new ArrayList<>();
    Map MaterialsLoan = new HashMap();
    
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
    
    
    public void loan(){
        /*String x = "hola";
        Student student = new Student();
        if(student.validateId(x)==true){
            
        }*/
        
        
    }
}
