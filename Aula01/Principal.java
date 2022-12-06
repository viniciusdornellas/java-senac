package Aula01;

import java.util.Date;

import Aula01.Entidades.Agencia;
import Aula01.Entidades.Cliente;
import Aula01.Entidades.Conta;


public class Principal{
    
   public static void main(String[] args) {

    Agencia agFacSenac = new Agencia(0023, "8132314545", "faculdade@bancosenac.com");
    Cliente clienteVinicius = new Cliente("Vinicius Dornellas", "111.222.333-00", "vinidornellass@gmail.com", "819744486225", new Date(2001, 05, 27));
    Conta contaVinicius = new Conta(123, clienteVinicius, agFacSenac, 2.50, 10);
    System.out.println(contaVinicius.getSaldo());
   }
}