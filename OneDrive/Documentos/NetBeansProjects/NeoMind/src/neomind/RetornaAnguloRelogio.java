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
public class RetornaAnguloRelogio {

    public long RetornaAnguloRelogio(GregorianCalendar horario){//Acessa os atributos da classe GregorianCalendar
        
        if (horario.getHora() > 24 || horario.getHora() < 0 || horario.getMinuto() >59 || horario.getMinuto() < 0){//Horário válido
        System.out.println("Favor digitar horário válido.");
        }
        else{
            if (horario.getHora() >12){//Tratativa para horas acima de 12
                horario.setHora(horario.getHora()-12);
            }
            if (horario.getHora() <= horario.getMinuto()/5){//Caso o ponteiro da hora seja <= ao ponteiro dos minutos
                horario.setDistancia((horario.getMinuto()/5)-horario.getHora());//Calcula a distancia entre os ponteiros
                horario.setGrau(((horario.getMinuto()-(horario.getHora()*5))*horario.getDistancia()));//Calcula o grau a partir da distancia
                //System.out.println("Entrada 1");
                //System.out.println("A distância é " + horario.getDistancia());
                //System.out.println("São " + horario.getGrau() + " graus");
            }
            else{//Caso o ponteiro da hora seja > ao ponteiro dos minutos
                horario.setDistancia((horario.getMinuto()/5)-(horario.getHora()-12));
                horario.setGrau((((12-horario.getHora())*5)+horario.getMinuto())*horario.getDistancia());
                //System.out.println("Entrada 2");
                //System.out.println("A distância é " + horario.getDistancia());
                //System.out.println("São " + horario.getGrau() + " graus");
            }
        }
        return horario.getGrau();
    }
    
}
