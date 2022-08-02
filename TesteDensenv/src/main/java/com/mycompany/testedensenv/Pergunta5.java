package com.mycompany.testedensenv;

public class Pergunta5 {

    public static void main(String[] args) {
        String str = "Matheus";
        System.out.println(str);
        char[] str2 = str.toCharArray();
        int inicio = 0;
        int fim = str2.length - 1;
        char aux;
        while (fim > inicio) {
            aux = str2[inicio];
            str2[inicio] = str2[fim];
            str2[fim] = aux;
            fim--;
            inicio++;
        }
        str = new String(str2);
        System.out.println(str);
    }

}
