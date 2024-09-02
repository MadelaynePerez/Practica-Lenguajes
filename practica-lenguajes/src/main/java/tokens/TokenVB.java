/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokens;

/**
 *
 * @author DELL
 */
public class TokenVB {
    
    public String Nombre;
    public String Simbolo;
    public String Color;
    public TipoToken Tipo;

    public TokenVB(String Nombre, String Simbolo, String Color, TipoToken tipo) {
        this.Nombre = Nombre;
        this.Simbolo = Simbolo;
        this.Color = Color;
        this.Tipo = tipo;
    }
    
    public enum TipoToken{
        ARIMETICA,
        RELACION,
        LOGICOS,
        ASIGNACION,
        RESERVADOS,
        TIPO_DATOS,
        SQUARE,
        SIMBOLOS,
        COMENTARIO,
        IDENTIFICADOR,
        ERROR
    }
}
