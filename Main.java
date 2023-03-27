public class Main {

    public static void main(String[] args) {
        Arma Armax = new Arma(1,2,6,3);
        Armadura Armadurax = new Armadura();
        Botas Botasx = new Botas(3,2);
        Casco Cascox = new Casco(10,6);
        Espada Espadax = new Espada(3,5,7,7);
        Hacha Hachax = new Hacha(5,3,1,1,6);
        Lanza Lanzax = new Lanza(5,2,3,2,2);

        Equipo Array [] = new Equipo[7];
        Array[0]=Armax;
        Array[1]=Armadurax;
        Array[2]=Botasx;
        Array[3]=Cascox;
        Array[4]=Espadax;
        Array[5]=Hachax;
        Array[6]=Lanzax;

        for (int i=0; i<Array.length; i++){
            System.out.println(Array[i]);
        }
    }
}