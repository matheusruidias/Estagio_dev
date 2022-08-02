package com.mycompany.testedensenv;

public class Pergunta4 {

    public static void main(String[] args) {

        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double soma = 0;
        float porcentagem = 0;

        soma = sp + rj + mg + es + outros;
        
        porcentagem=(float) ((sp *100)/soma);
        
        System.out.println("SP: "+porcentagem+"%");
        
        porcentagem=(float) ((rj *100)/soma);
        
        System.out.println("RJ: "+porcentagem+"%");
        
        porcentagem=(float) ((mg *100)/soma);
        
        System.out.println("MG: "+porcentagem+"%");
        
        porcentagem=(float) ((es *100)/soma);
        
        System.out.println("ES: "+porcentagem+"%");
        
        porcentagem=(float) ((outros *100)/soma);
        
        System.out.println("Outros: "+porcentagem+"%");
    }

}
