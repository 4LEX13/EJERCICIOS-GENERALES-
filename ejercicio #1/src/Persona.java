/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class Persona {

    private String nomnre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

  

    public Persona(int edad, String sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nomnre, int edad, String sexo, double peso, double altura) {
        this.nomnre = nomnre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    
    
    public String getNomnre() {
        return nomnre;
    }

    public void setNomnre(String nomnre) {
        this.nomnre = nomnre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    Persona(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String esMayor() {
        int edad;
        edad = this.edad;
        if (edad < 18) {
            return "Es menor de edad";
        } else {
            return "Es mayor de edad";
        }
    }
}
    

    
