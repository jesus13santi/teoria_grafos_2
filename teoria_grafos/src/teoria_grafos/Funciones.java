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
        Lista personas = new Lista("Lista nueva");
        String line;
        String peliculas_csv = "";
        String path = filepath;
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
                        peliculas_csv += line + "\n";
                    }

                }
               
                if (!"".equals(peliculas_csv)) {
                    String[] peliculas_split = peliculas_csv.split("\n");
                    for (int i = 0; i < peliculas_split.length ; i++) {
                        if (!peliculas_split[i].equals("id,title,year")&& !peliculas_split[i].isEmpty()) {
                            String[] pelicula = peliculas_split[i].split(",");
                            personas.Insertar_final(Integer.parseInt(pelicula[1]),(pelicula[0]), Integer.parseInt(pelicula[2]));

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
