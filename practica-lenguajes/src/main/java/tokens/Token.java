/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokens;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Token {

    public static ArrayList<TokenVB> tokenValidos = new ArrayList<>();

    public static void InicializarTokens() {
        tokenValidos.add(new TokenVB("Suma", "+", "#FF33FF", TokenVB.TipoToken.ARIMETICA));
        tokenValidos.add(new TokenVB("Resta", "-", "#C19A6B", TokenVB.TipoToken.ARIMETICA));
        tokenValidos.add(new TokenVB("Exponente", "^", "#fCD0B4", TokenVB.TipoToken.ARIMETICA));
        tokenValidos.add(new TokenVB("Division", "/", "#B4D941", TokenVB.TipoToken.ARIMETICA));
        tokenValidos.add(new TokenVB("Modulo", "Mod", "#D9AB41", TokenVB.TipoToken.ARIMETICA));
        tokenValidos.add(new TokenVB("Multiplicacion", "*", "#D80073", TokenVB.TipoToken.ARIMETICA));

        tokenValidos.add(new TokenVB("Igual", "==", "#6A00FF", TokenVB.TipoToken.RELACION));
        tokenValidos.add(new TokenVB("Diferente", "<>", "#3F2212", TokenVB.TipoToken.RELACION));
        tokenValidos.add(new TokenVB("Mayor que", ">", "#D9D441", TokenVB.TipoToken.RELACION));
        tokenValidos.add(new TokenVB("Menor que", "<", "#D94A41", TokenVB.TipoToken.RELACION));
        tokenValidos.add(new TokenVB("Mayor o igual que ", ">=", "#E3C800", TokenVB.TipoToken.RELACION));
        tokenValidos.add(new TokenVB("Menor o igual que ", "<=", "#E3C800", TokenVB.TipoToken.RELACION));

        tokenValidos.add(new TokenVB("y", "And", "#414ED9", TokenVB.TipoToken.LOGICOS));
        tokenValidos.add(new TokenVB("o", "Or", "#41D95D", TokenVB.TipoToken.LOGICOS));
        tokenValidos.add(new TokenVB("negacion", "Not", "#A741D9", TokenVB.TipoToken.LOGICOS));

        tokenValidos.add(new TokenVB("Asignacion Compuesta", "+=", "#FFFFFF", TokenVB.TipoToken.ASIGNACION));
        tokenValidos.add(new TokenVB("Asignacion Compuesta", "-=", "#FFFFFF", TokenVB.TipoToken.ASIGNACION));
        tokenValidos.add(new TokenVB("Asignacion Compuesta", "*=", "#FFFFFF", TokenVB.TipoToken.ASIGNACION));
        tokenValidos.add(new TokenVB("Asignacion Compuesta", "/=", "#FFFFFF", TokenVB.TipoToken.ASIGNACION));
        tokenValidos.add(new TokenVB("Asignacion Simple", "=", "#41D9D4", TokenVB.TipoToken.ASIGNACION));

        tokenValidos.add(new TokenVB("Palabra Reservada", "Module", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "End", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Sub", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Main", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Dim", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "As", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Integer", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "String", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Boolean", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Double", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Char", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Console.WriteLine", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Console.ReadLine", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "If", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Elseif", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Else", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Then", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "While", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Do", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Loop", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "For", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "To", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Next", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Function", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Return", "#60A917", TokenVB.TipoToken.RESERVADOS));
        tokenValidos.add(new TokenVB("Palabra Reservada", "Const", "#60A917", TokenVB.TipoToken.RESERVADOS));

        tokenValidos.add(new TokenVB("Entero", "0", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "1", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "2", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "3", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "4", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "5", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "6", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "7", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "8", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Entero", "9", "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS));

        tokenValidos.add(new TokenVB("Cadena", "\"", "#E51400", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Booleano", "True", "#FA6800", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Booleano", "False", "#FA6800", TokenVB.TipoToken.TIPO_DATOS));
        tokenValidos.add(new TokenVB("Caracter", "'", "#0050EF", TokenVB.TipoToken.TIPO_DATOS));

        tokenValidos.add(new TokenVB("Comentario", "‘", "#B3B3B3", TokenVB.TipoToken.COMENTARIO));

        tokenValidos.add(new TokenVB("Parentesis", "(", "#9AD8DB", TokenVB.TipoToken.SIMBOLOS));
        tokenValidos.add(new TokenVB("Parentesis", ")", "#9AD8DB", TokenVB.TipoToken.SIMBOLOS));
        tokenValidos.add(new TokenVB("Llaves", "{", "#DBD29A", TokenVB.TipoToken.SIMBOLOS));
        tokenValidos.add(new TokenVB("Corchetes", "[", "#DBA49A", TokenVB.TipoToken.SIMBOLOS));
        tokenValidos.add(new TokenVB("Corchetes", "]", "#DBA49A", TokenVB.TipoToken.SIMBOLOS));
        tokenValidos.add(new TokenVB("Coma", ",", "#B79ADB", TokenVB.TipoToken.SIMBOLOS));
        tokenValidos.add(new TokenVB("Punto", ".", "#9ADBA6", TokenVB.TipoToken.SIMBOLOS));
    }

    public static TokenVB ObtenerToken(String token) {
        for (TokenVB tokenvb : tokenValidos) {
            if (tokenvb.Simbolo.equals(token)) {
                return tokenvb;
            }
        }

        if (token.trim().length() == 0) {
            return null;
        }

        if (token.startsWith("‘")) {
            return new TokenVB("Comentario", "‘", "#B3B3B3", TokenVB.TipoToken.COMENTARIO);
        }

        if (token.startsWith("Square.Color")) {
            String[] tmp = token.split("\\,");
            String color = tmp[0].replace("Square.Color(", "");
            return new TokenVB("Square", token, color, TokenVB.TipoToken.SQUARE);
        }

        if (esIdentificadorValido(token)) {
            return new TokenVB("Identificador", token, "#FFD300", TokenVB.TipoToken.IDENTIFICADOR);
        }
        
        if(esDecimal(token)){
            return new TokenVB("Decimal", token, "#FFFF88", TokenVB.TipoToken.TIPO_DATOS);
        }
        
        if(esEntero(token)){
            return new TokenVB("Entero", token, "#1BA1E2", TokenVB.TipoToken.TIPO_DATOS);
        }
        
        return new TokenVB("ERROR", token, "#FF0000", TokenVB.TipoToken.ERROR);
    }

    public static boolean esIdentificadorValido(String input) {
        boolean esValido = true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c) || c == '_') {
                continue;
            } else if (Character.isDigit(c) && i > 0) {
                continue;
            } else {
                esValido = false;
                break;
            }
        }
        return esValido;
    }

    public static boolean esEntero(String str) {
        for (char c : str.toCharArray()) {
            if (!esDigitoValido(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean esDecimal(String token) {
        int puntoCount = 0;
        for (char c : token.toCharArray()) {
            if (c == '.') {
                puntoCount++;
                if (puntoCount > 1) {
                    return false;
                }
            } else if (!esDigitoValido(c)) {
                return false;
            }
        }
        return puntoCount == 1; 
    }

    private static boolean esDigitoValido(char c) {
        for (TokenVB token : tokenValidos) {
            if (token.Simbolo.equals(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
