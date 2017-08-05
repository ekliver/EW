/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.clasesAuxiliares;

/**
 *
 * @author Pc
 */
public class Funciones {

    public String Numeros_Letras(double x_numero) {

        Integer x_entero;
        Integer x_dec;
        String x_texto, x_texto_w, x_terna;
        Integer x1, x2, x3;
        String[] x_let_1 = new String[30];
        String[] x_let_2 = new String[10];
        String[] x_let_3 = new String[10];

        x_numero = Math.abs(x_numero);

        x_let_1[1] = "uno ";
        x_let_1[2] = "dos ";
        x_let_1[3] = "tres ";
        x_let_1[4] = "cuatro ";
        x_let_1[5] = "cinco ";
        x_let_1[6] = "seis ";
        x_let_1[7] = "siete ";
        x_let_1[8] = "ocho ";
        x_let_1[9] = "nueve ";
        x_let_1[10] = "diez ";
        x_let_1[11] = "once ";
        x_let_1[12] = "doce ";
        x_let_1[13] = "trece ";
        x_let_1[14] = "catorce ";
        x_let_1[15] = "quince ";
        x_let_1[16] = "dieciseis ";
        x_let_1[17] = "diecisiete ";
        x_let_1[18] = "dieciocho ";
        x_let_1[19] = "diecinueve ";
        x_let_1[20] = "veinte ";
        x_let_1[21] = "veintiun ";
        x_let_1[22] = "veintidos ";
        x_let_1[23] = "veintitres ";
        x_let_1[24] = "veinticuatro ";
        x_let_1[25] = "veinticinco ";
        x_let_1[26] = "veintiseis ";
        x_let_1[27] = "veintisiete ";
        x_let_1[28] = "veintiocho ";
        x_let_1[29] = "veintinueve ";
        x_let_2[1] = "diez ";
        x_let_2[2] = "veinte ";
        x_let_2[3] = "treinta ";
        x_let_2[4] = "cuarenta ";
        x_let_2[5] = "cincuenta ";
        x_let_2[6] = "sesenta ";
        x_let_2[7] = "setenta ";
        x_let_2[8] = "ochenta ";
        x_let_2[9] = "noventa ";
        x_let_3[1] = "ciento ";
        x_let_3[2] = "doscientos ";
        x_let_3[3] = "trescientos ";
        x_let_3[4] = "cuatrocientos ";
        x_let_3[5] = "quinientos ";
        x_let_3[6] = "seiscientos ";
        x_let_3[7] = "setecientos ";
        x_let_3[8] = "ochocientos ";
        x_let_3[9] = "novecientos ";

        x_entero = (int) x_numero;

        if (x_entero == 0) {
            x_texto = "cero ";
        } else {
            x_texto = "";
            x1 = x_entero.toString().length();
            x2 = 1;
            x3 = 0;
            x_texto_w = "";
            x_terna = "";
            while (x1 > 0) {

                x_terna = x_entero.toString().charAt(x1 - 1) + x_terna;

                // se completa la terna
                if ((x2 == 3) || (x1 == 1)) {
                    x2 = 0;
                    x3++;
                    while (x_terna.length() < 3) {
                        x_terna = "0" + x_terna;
                    }
                    if (!x_terna.substring(0, 1).equals("0")) {
                        x_texto_w = x_let_3[Integer.parseInt(String.valueOf(x_terna.charAt(0)))];
                    }
                    if (Integer.parseInt(x_terna.substring(1, 3)) > 0) {
                        if (Integer.parseInt(x_terna.substring(1, 3)) <= 29) {
                            x_texto_w = x_texto_w + x_let_1[Integer.parseInt(x_terna.substring(1, 3))];
                        } else {
                            x_texto_w = x_texto_w + x_let_2[Integer.parseInt(x_terna.substring(1, 2))];
                            if (!x_terna.substring(2, 3).equals("0")) {
                                x_texto_w = x_texto_w + "y " + ((x_let_1[Integer.parseInt(x_terna.substring(2, 3))].equals("un")) ? "uno" : x_let_1[Integer.parseInt(x_terna.substring(2, 3))]);
                            }

                        }
                    } else {
                        if (Integer.parseInt(x_terna) == 100) {
                            x_texto_w = "cien ";
                        }
                    }

                    if ((x3 == 2) || (x3 == 4)) {
                        if (Integer.parseInt(x_terna) == 0) {
                            if (x_texto.length() == 0) {
                                x_texto_w = "DE ";
                            }
                        } else {
                            x_texto_w = (x_texto_w.equals("uno") ? "Un mil " : x_texto_w + "Mil ");
                        }
                    } else {
                        if ((x3 == 3) || (x3 == 5)) {
                            if (Integer.parseInt(x_terna) == 1) {
                                x_texto_w = x_texto_w + "millon ";

                            } else {
                                x_texto_w = x_texto_w + "millones ";
                            }
                        }
                    }

                    x_texto = x_texto_w + x_texto;
                    x_texto_w = "";
                    x_terna = "";

                }

                x1--;
                x2++;
            }
        }

//   Trabajo con los decimales - csoriano
        if (!x_texto.equals("")) {
            if ((x_entero == 1) && (x_texto.substring(x_texto.length() - 3, x_texto.length() - 1).equals("es"))) {
                x_texto = x_texto.substring(0, x_texto.length() - 2);
            }

            x_dec = (int) Math.round((x_numero - x_entero) * 100);

            x_texto = (x_texto.equals("un") ? "uno" : x_texto) + "y " + x_dec + "/100 ";
        }

        return x_texto.toUpperCase();
    }
}
