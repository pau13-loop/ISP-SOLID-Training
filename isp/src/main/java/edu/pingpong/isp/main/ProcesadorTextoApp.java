package edu.pingpong.isp.main;

import edu.pingpong.isp.isp.ProcesadorTexto;

public class ProcesadorTextoApp {
    public static void main(String[] args) {

        ProcesadorTexto procesador = new ProcesadorTexto();

        // Adding the sentence
        procesador.nueva("This");
        procesador.nueva("is");
        procesador.nueva("an");
        procesador.nueva("ISP");
        procesador.nueva("Java");
        procesador.nueva("Kata");

        // Printing the sentence we just added before
        System.out.println("\n===============Trial Sentence===============\n");
        System.out.println("\t" + procesador.texto());

    }
}
