package com.blast99.kataexamen;

public class ProcesadorRomano {

    public int convierte(String texto) throws Exception {

        int resultado = 0;
        char valor;

        if (texto.equals("")) {
            return 0;
        }

        if (!cantidadAceptableChar(texto)) {
            throw new Exception("El texto no tiene la cantidad aceptable de caracteres");
        }

        if (!ordenDescendiente(texto)) {
            throw new Exception("El texto no se encuentra de forma descendente");
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

    public static boolean ordenDescendiente(String texto) {
        int actual;
        int siguiente;
        char valorActual;
        char valorSiguiente;

        if (texto.length() >= 2) {
            for (int i = 0; i < texto.length(); i++) {

                valorActual = texto.charAt(i);
                switch (valorActual) {
                    case 'I':
                        actual = 1;
                        break;

                    case 'V':
                        actual = 5;
                        break;

                    case 'X':
                        actual = 10;
                        break;

                    case 'L':
                        actual = 50;
                        break;

                    case 'C':
                        actual = 100;
                        break;

                    case 'D':
                        actual = 500;
                        break;

                    case 'M':
                        actual = 1000;
                        break;

                    default:
                        actual = 0;
                        break;
                }





                ////
//                actual = texto.charAt(i);
                if ((i + 1) == texto.length()) {
                    return true;
                }
//                siguiente = texto.charAt(i+1);

                valorSiguiente = texto.charAt(i+1);
                switch (valorSiguiente) {
                    case 'I':
                        siguiente = 1;
                        break;

                    case 'V':
                        siguiente = 5;
                        break;

                    case 'X':
                        siguiente = 10;
                        break;

                    case 'L':
                        siguiente = 50;
                        break;

                    case 'C':
                        siguiente = 100;
                        break;

                    case 'D':
                        siguiente = 500;
                        break;

                    case 'M':
                        siguiente = 1000;
                        break;

                    default:
                        siguiente = 0;
                        break;
                }

                if (actual < siguiente) {
                    return false;
                }
            }
        }

        return true;

    }
}
