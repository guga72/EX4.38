package br.edu.ifsp.spo.lp1a3.sp3013324.cap4;

public class Criptografia {
    int prim;
    int segu;
    int te;
    int qua;
    
    public Criptografia(int pri, int seg, int ter, int quar){
        this.prim = pri;
        this.segu = seg;
        this.te = ter;
        this.qua = quar;
}
    public void descriptografar(){
        this.prim = this.prim + 3;
        this.segu = this.segu + 3;
        this.te = this.te + 3;
        this.qua = this.qua + 3;
        if(this.prim >= 10.00){
            this.prim = this.prim - 10;
        }
        if(this.segu >= 10.00){
            this.segu = this.segu - 10;
        }
        if(this.te >= 10.00){
            this.te = this.te - 10;
        }
        if(this.qua >= 10.00){
            this.qua = this.qua - 10;
        }
        System.out.println("Descriptografado: " + this.prim + "" + this.segu + "" + this.te + "" + this.qua);
    }
}
