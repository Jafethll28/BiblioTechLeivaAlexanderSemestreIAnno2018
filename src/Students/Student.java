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
    int index;
    /*
    static ArrayList<String> studentsId = new ArrayList<>();
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> careers = new ArrayList<>();
    static ArrayList<Float> fines = new ArrayList<>();
     */
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
    
}
