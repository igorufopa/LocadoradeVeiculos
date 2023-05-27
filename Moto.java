package com.mycompany.locadoradeveiculos;
public class Moto extends Veiculo{
    private int cilindrada;
    private String tipodemotor;

    public Moto(String modelo, String marca, String placa, String cor, int anodefabricao, int cilindrada, 
            String tipodemotor) {
        super(modelo, marca, placa, cor, anodefabricao);
        this.cilindrada = cilindrada;
        this.tipodemotor = tipodemotor;
    }

    

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipodemotor() {
        return tipodemotor;
    }

    public void setTipodemotor(String tipodemotor) {
        this.tipodemotor = tipodemotor;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "cilindrada=" + cilindrada + ", tipodemotor=" + tipodemotor + '}';
    }
    
    
    
}