public class Hacha extends Arma {

    private int distancia_arma2;

    public Hacha(){
    }

    public Hacha(double damage, double multiplicador, double distancia,double tiempo_para_damage,int distancia_arma2){

        super (damage,multiplicador,distancia,tiempo_para_damage);

        this.distancia_arma2=distancia_arma2;
    }

    public double doing_damage(double distancia_enemigo){

        if(distancia_enemigo == distancia_arma2){

            double hacha_damage = getDamage()*3;

            return hacha_damage;
        }
        return 0;
    }
}