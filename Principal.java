/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor aut1 = new Autor("William Shakespeare", 1564, "williamshake@hotmail.com");
        //Autor aut2 = new Autor();
        
        Livro liv1 = new Livro("Sonet 116", "Scipione", 1609);
        
        liv1.setEscritor(aut1);
        aut1.setObra(liv1);
        
        System.out.println("Obra: " + aut1.getObra().getTitulo());
        
        System.out.println("Escritor: " + liv1.getEscritor().getNome());
        
        
        
        
    }
    
}
