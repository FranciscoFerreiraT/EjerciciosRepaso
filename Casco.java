public class Casco extends Armadura{

    public Casco(){
    }

    public Casco (double defensa, double multiplicador){
        super(defensa,multiplicador);
    }

    public String accionEspecial (boolean proyectil){

        if(proyectil = true){
            System.out.println("Casco existe");
        }else{
            System.out.println("Casco no existe");
        }
        return "";
    }
}