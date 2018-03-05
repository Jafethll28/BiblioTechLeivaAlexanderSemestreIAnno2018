/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * @author Monserrath
 */


public class Student {
    String studentId;
    String name;
    String career;
    float fine;
    //int index;
    
    //Creacion de array y mapa de Hash para almacenar datos
    static ArrayList<String> data = new ArrayList<>();
    Map Students = new HashMap();
    
    
    public void addStudent(){
        //Método de registrar estudiante
        data.add(name);
        data.add(career);
        String fine2 = Float.toString(fine);
        data.add(fine2);
        Students.put(studentId,data);
        
    }
    
    public String getId(){
        return studentId;
    }
    
    public boolean validateId(String Id){
        //Método para validar que un estudiante este registrado
        for (Object key : Students.keySet()){
            if(studentId == key){
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
