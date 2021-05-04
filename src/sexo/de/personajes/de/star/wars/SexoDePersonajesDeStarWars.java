/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sexo.de.personajes.de.star.wars;

import java.util.Scanner;

/**
 *
 * @author Santiago Vela
 */
public class SexoDePersonajesDeStarWars {

    public static void Personajes() {

        // Arreglo matriz de personajes de star wars
        
        aPersonajes = new String[16][3];
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male";
    }

    public static void sexo(String genero) {
        sexo = genero;
        for (int i = 0; i < aPersonajes.length; i++) {
            if (aPersonajes[i][2].equals(sexo)) {
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el genero:");
        System.out.println("male, female, n/a, hermaphrodite");
        String genero = entrada.nextLine();
        Personajes();
        sexo(genero);
        
    }

    static String[][] aPersonajes;
    
    static String sexo;

}
