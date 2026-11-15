package poo;

public class Reproductor {
    String cancion="Sangre !";
    boolean reproduciendo=false;

    public void reproducir(String cancion){
        this.cancion=cancion;
        this.reproduciendo=true;
    }
    public void pausar(){
        this.reproduciendo=false;
    }
    public void estado(){
        if(this.reproduciendo){
            System.out.println("La cancion se esta reproduciendo "+this.cancion);
        }
        else{
            System.out.println("la cancion esta en pausa");
        }
    }
    public static void main(String[] args) {
        Reproductor reproductor=new Reproductor();
        reproductor.estado();
        reproductor.reproducir("Sangre !");
        reproductor.estado();
        reproductor.pausar();
       
    }
}
