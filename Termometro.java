package poo;

public class Termometro {
    Double temperatura=0.0;
    public void subir(double grados){
        this.temperatura=grados;
    }
    public void bajar(double grados){
        this.temperatura=grados;
    }
    public void mostrarTemperatura(){
        System.out.println(" La temperatura es de "+ temperatura);
    }
    public static void main(String[] args) {
        Termometro termometro=new Termometro();
        termometro.mostrarTemperatura();
        termometro.subir(35);
        termometro.mostrarTemperatura();
        termometro.bajar(24);
        termometro.mostrarTemperatura();
    }
}
