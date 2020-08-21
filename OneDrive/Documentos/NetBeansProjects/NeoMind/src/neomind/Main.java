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
public class Main {
    
    public static void main(String[] args) {
        
        GregorianCalendar entrada = new GregorianCalendar();//Realizado instanciamento para utilizar os setters
        entrada.setHora(0);
        entrada.setMinuto(15);   
        RetornaAnguloRelogio saida = new RetornaAnguloRelogio();//Utilizado instanciamento para acessar o metodo que calcula o grau
        System.out.println("Grau calculado: "+saida.RetornaAnguloRelogio(entrada));

        /*
                 Valores Limites Para Hora
        '-------------------------------------------'
        ' ENTRADA '            SAIDA                ' 
        '-------------------------------------------'
        '   -1    '        Valor Inválido           '
        '-------------------------------------------'
        '    0    '        Valor Válido             '
        '-------------------------------------------'
        '    24   '        Valor Válido             '
        '-------------------------------------------'
        '    25   '        Valor Inválido           '
        '-------------------------------------------'
        
        /////////////////////////////////////////////
        
                Valores Limites Para Minuto
        '-------------------------------------------'
        ' ENTRADA '            SAIDA                ' 
        '-------------------------------------------'
        '   -1    '        Valor Inválido           '
        '-------------------------------------------'
        '    0    '        Valor Válido             '
        '-------------------------------------------'
        '    59   '        Valor Válido             '
        '-------------------------------------------'
        '    60   '        Valor Inválido           '
        '-------------------------------------------'
        
        */  
    } 
}
