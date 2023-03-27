public class Lanza extends Arma{

    private int distancia_arma;

    public Lanza (){
    }

    public Lanza (double damage, double multiplicador, double distancia,double tiempo_para_damage, int distancia_arma) {

        super (damage,multiplicador,distancia,tiempo_para_damage);

        this.distancia_arma=distancia_arma;
    }

    public double doing_damage(double distancia_enemigo){

        if(distancia_enemigo == distancia_arma | distancia_enemigo == (distancia_arma/2)){

            double lanza_damage= getMultiplicador()*getDamage();

            return lanza_damage;
        }
        return 0;
    }
}