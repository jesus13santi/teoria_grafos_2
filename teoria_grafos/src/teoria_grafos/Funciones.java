/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria_grafos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Funciones {
    public Funciones(){
        
    }
    public Lista leer_csv(String filepath) {
        Lista personas = new Lista();
        String line;
        String pelicula_csv = "";
        String path = filepath;
        //String path = "test\\cliente.csv"; Lee el csv clientes
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.createNewFile();
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    
                    if (!line.isEmpty()) {
                        pelicula_csv += line + "\n";
                    }

                }
               
                if (!"".equals(pelicula_csv)) {
                    String[] pelicula_split = pelicula_csv.split("\n");
                    String texto=pelicula_split[0];
                    for (int i = 0; i < pelicula_split.length ; i++) {
                        //System.out.println(pelicula_split[0]);
                        
                        if (!pelicula_split[i].equals(texto)) {
                            String[] cliente = pelicula_split[i].split(",");
                            personas.Insertar_final(Integer.parseInt(cliente[0]),cliente[1], Integer.parseInt(cliente[2]));

                        }

                    }

                }
                br.close();
                JOptionPane.showMessageDialog(null, "Exitos al Leer");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al leer");

        }

        return personas;
    }
    
}
