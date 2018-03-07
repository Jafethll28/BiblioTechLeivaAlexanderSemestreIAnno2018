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
    
    static Map<String,ArrayList> hashStudents = new HashMap();

    public Student(String studentId, String name, String career) {
        this.studentId = studentId;
        this.name = name;
        this.career = career;
        this.fine = 0;
    }
    

    
    public void addStudent(){
        //Método de registrar estudiante
        ArrayList<String> data = new ArrayList<>();
        data.add(name);
        data.add(career);
        String fine2 = Float.toString(fine);
        data.add(fine2);
        hashStudents.put(studentId,data);
        
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }

    public void setStudents(Map Students) {
        this.hashStudents = Students;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCareer() {
        return career;
    }

    public float getFine() {
        return fine;
    }

    public Map getStudents() {
        return hashStudents;
    }
    
    
    public String getId(){
        return studentId;
    }
    
    public boolean validateId(String Id){
        //Método para validar que un estudiante este registrado
        hashStudents.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            System.out.println(key);
            //String value = entry.getValue();
        });
        System.out.println("\n");
        return hashStudents.containsKey(Id);
    }
}
    
/**
        for (Map.Entry<String, ArrayList> entry : hashStudents.entrySet()) {
            System.out.println(hashStudents.size());
            System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
            return true;
        }
        return false;
        * */