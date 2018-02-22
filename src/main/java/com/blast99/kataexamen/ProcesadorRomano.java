package com.blast99.kataexamen;

public class ProcesadorRomano {

    public int convierte(String texto) throws Exception {

        if (texto.equals("")) { return 0; }

        int resultado = 0;

        if (!cantidadAceptableChar(texto)) throw new Exception("El texto no tiene la cantidad aceptable de caracteres");

        if (!ordenDescendiente(texto)) throw new Exception("El texto no se encuentra de forma descendiente");

        for (int i = 0; i < texto.length(); i++) {
            resultado += retornaValorUnidad(texto.charAt(i));
        }

        return resultado;
    }

    public boolean cantidadAceptableChar(String texto) {

        int cantidadI = 0, cantidadL = 0, cantidadD = 0, cantidadX = 0, cantidadC = 0;

        for (int i = 0; i < texto.length(); i++) {
            switch (texto.charAt(i)) {
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

            if (cantidadI > 3 || cantidadL > 1 || cantidadD > 1 || cantidadX > 3 || cantidadC > 3) return false;

        }
        return true;
    }

    public boolean ordenDescendiente(String texto) {

        if (texto.length() >= 2) {
            for (int i = 0; i < texto.length(); i++) {
                if ((i + 1) == texto.length()) return true;
                if (retornaValorUnidad(texto.charAt(i)) < retornaValorUnidad(texto.charAt(i+1))) return false;
            }
        }

        return true;
    }

    public int retornaValorUnidad(char c) {
        int result;

        switch (c) {
            case 'I':
                result = 1;
                break;

            case 'V':
                result = 5;
                break;

            case 'X':
                result = 10;
                break;

            case 'L':
                result = 50;
                break;

            case 'C':
                result = 100;
                break;

            case 'D':
                result = 500;
                break;

            case 'M':
                result = 1000;
                break;

            default:
                result = 0;
                break;
        }

        return result;
    }
}
