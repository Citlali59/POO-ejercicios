package poo;

public class Lampara {
    boolean encendido=false;
    public void encender(){
        this.encendido=true;
    }
    public void apagar(){
        this.encendido=false;
    }

    public String estado(){
        if(this.encendido){
            return "La lampara esta encendida";
        }
        else{
            return "La lampara esta apagada";
        }
    }
    public static void main(String[] args) {
        Lampara lampara=new Lampara();
        System.out.println(lampara.estado());
        lampara.encender();
        System.out.println(lampara.estado());
        lampara.apagar();
        System.out.println(lampara.estado());
    }
    
}
