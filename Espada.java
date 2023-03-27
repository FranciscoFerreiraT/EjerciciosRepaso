public class Espada extends Arma{
    
    public Espada (){
    }

    public Espada(double damage, double multiplicador, double distancia,double tiempo_para_damage){

        super(damage,multiplicador,distancia,tiempo_para_damage);
    }

    public double doing_damage(double distancia_enemigo){

        double espada_damage = getDistancia()*getDamage()*(getDistancia()-distancia_enemigo);

        return espada_damage;
    }
}