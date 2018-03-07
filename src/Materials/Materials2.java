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
    static Map<String,ArrayList> Materials = new HashMap();
    static ArrayList<String> materialsOnLoan = new ArrayList<>();
    public static Map<String,ArrayList> MaterialsLoan = new HashMap();
    
    public void addMaterials(){
        //método registrar materiales
        /*
        ArrayList<String> data = new ArrayList<>();
        data.add(materialsId);
        data.add(name);
        String quantity2 = Integer.toString(quantity);
        data.add(quantity2);
        data.add(kind);
        Materials.put(materialsId,data);*/
    }
    //Constructor
    public Materials2(String materialsId, String name, int quantity, String kind) {
        this.materialsId = materialsId;
        this.name = name;
        this.quantity = quantity;
        this.kind = kind;
    }
    
    public boolean validateName(String name){
        //Método para validar que un estudiante este registrado
        Materials.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            System.out.println(key);
            //String value = entry.getValue();
        });
        System.out.println("\n");
        return Materials.containsKey(name);
    }
    
    
    public void subtractQuantity(String name2){
        //Metodo para restar la cantidad disponible de material
        Materials.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            System.out.println(key);
            ArrayList value = entry.getValue();
            System.out.println(value);
            int aux = Integer.parseInt((String) value.get(1));
            System.out.println(aux);
            aux--;
            value.set(1,Integer.toString(aux));
            System.out.println(value);
        });
    }
    
    
    
    public void addMaterialsOnLoan(String studentId, String materialName){
        //Metodo almacenar que materiales están en préstamo
        materialsOnLoan.add(materialName);
        materialsOnLoan.add("3");  //dias de préstamo
        MaterialsLoan.put(studentId,materialsOnLoan);
    }
    //prueba de datos
    public void printear(){
        System.out.println(name + materialsId);
    }
    
}
