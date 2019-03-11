package br.edu.ifsp.spo.lp1a3.sp3013324.cap4;

import java.util.Scanner;

public class BrEduIfspSpoLp1a3Sp3013324Cap4 {

    public static void main(String[] args) {
        int dado;
        int pri;
        int seg;
        int ter;
        int quar;
        
        Scanner x = new Scanner(System.in);
        System.out.print("Digite um número de 4 digitos:");
        dado = x.nextInt();
        pri = dado / 1000;
        quar = dado % 10;
        ter = (dado/ 10) % 10;
        seg = (dado/100) % 10;
        pri = (pri + 7) % 10;
        quar = (quar + 7) % 10;
        ter = (ter + 7) % 10;
        seg = (seg + 7) % 10;
        System.out.println("Criptografado: " + ter +""+ quar +""+ pri +""+ seg);
        Criptografia cripto = new Criptografia(pri,seg,ter,quar);
        cripto.descriptografar();
        //dividir 1000 -- numero mod 10 -- dividir por 10 e mod 10 -- dividir 10 e mod 10
    }
    
}
