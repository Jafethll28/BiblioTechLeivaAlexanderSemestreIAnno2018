/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materials;

import java.util.ArrayList;

/**
 *
 * @author Jafeth Leiva
 */
public class Book extends Materials2{
    String editorial;
    String author;

    public Book(String editorial, String author, String materialsId, String name, int quantity, String kind) {
        super(materialsId, name, quantity, kind);
        this.editorial = editorial;
        this.author = author;
    }
    
    public void addBook(){
        //método registrar libros
        ArrayList<String> data = new ArrayList<>();
        data.add(name);
        String quantity2 = Integer.toString(quantity);
        data.add(quantity2);
        data.add(kind);
        data.add(editorial);
        data.add(author);
        Materials.put(materialsId,data);
    }
    
    public void printear(){
        System.out.println(editorial + name + materialsId);
    }
    
}
