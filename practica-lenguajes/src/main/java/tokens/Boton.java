/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokens;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author DELL
 */
public class Boton extends JButton{
    
    public TokenVB Token;
    public int Fila;
    public int Columna;
    
    public Boton(TokenVB token, int fila, int columna) {
        this.Columna = columna;
        this.Fila = fila;
        this.Token = token;
    }
    
    public Boton(){}
    
    public void setColor(){
        if(this.Token == null) {
            this.setBackground(Color.WHITE);
        }else{
            Color color = Color.decode(this.Token.Color);
            this.setBackground(color);
        }
    }
}
