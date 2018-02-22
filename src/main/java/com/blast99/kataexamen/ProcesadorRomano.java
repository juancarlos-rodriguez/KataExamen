package com.blast99.kataexamen;

public class ProcesadorRomano {

    public static int convierte(String texto) {

        int resultado = 0;

        if (texto.equals("")) {
            return 0;
        }

        char valor;

        for (int i = 0; i < texto.length(); i++) {

            valor = texto.charAt(i);

            switch (valor) {
                case 'I':
                    resultado += 1;
                    break;

                case 'V':
                    resultado += 5;
                    break;

                case 'X':
                    resultado += 10;
                    break;

                case 'L':
                    resultado += 50;
                    break;

                case 'C':
                    resultado += 100;
                    break;

                case 'D':
                    resultado += 500;
                    break;

                case 'M':
                    resultado += 1000;
                    break;


            }
        }

        return resultado;

    }
}
