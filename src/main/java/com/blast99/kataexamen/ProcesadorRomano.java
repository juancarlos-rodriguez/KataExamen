package com.blast99.kataexamen;

public class ProcesadorRomano {

    public int convierte(String texto) {

        int resultado = 0;
        char valor;

        if (texto.equals("")) {
            return 0;
        }

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

                default:
                    resultado = 0;
                    break;
            }
        }

        return resultado;

    }

    public boolean cantidadAceptableChar(String texto) {

        int cantidadI = 0, cantidadL = 0, cantidadD = 0, cantidadX = 0, cantidadC = 0;
        char c;

        for (int i = 0; i < texto.length(); i++) {
            c = texto.charAt(i);
            switch (c) {
                case 'I':
                    cantidadI++;
                    break;

                case 'X':
                    cantidadX++;
                    break;

                case 'L':
                    cantidadL++;
                    break;

                case 'C':
                    cantidadC++;
                    break;

                case 'D':
                    cantidadD++;
                    break;

            }

            if (cantidadI > 3 || cantidadL > 1 || cantidadD > 1 || cantidadX > 3 || cantidadC > 3) {
                return false;
            }
        }
        return true;
    }
}
