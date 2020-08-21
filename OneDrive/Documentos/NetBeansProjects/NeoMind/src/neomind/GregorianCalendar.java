/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neomind;

/**
 *
 * @author marce
 */
public class GregorianCalendar {//Definidos atributos e seus respectivos getters e setters
    private long hora, minuto, distancia, grau;
    
    public long getHora (){
        return this.hora;
    }
    public void setHora (long h){
        this.hora = h;
    }
    public long getMinuto (){
        return this.minuto;
    }
    public void setMinuto (long m){
        this.minuto = m;
    }
    public long getDistancia (){
        return this.distancia;
    }
    public void setDistancia (long d){
        this.distancia = d;
    }
    public long getGrau (){
        return this.grau;
    }
    public void setGrau (long g){
        this.grau = g;
    }    
}
