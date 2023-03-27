public class Equipo {
  
 


    public String accionEspecial;

   private enum Rareza {FRECUENTE,INFRECUENTE,RARO,MITICO,LEGENDARIO}
    private String nombre; 
    private Rareza nivel_rareza;
    private int nivel;
    Equipo(){}

    public Equipo(int nivel_rareza, int nivel, String nombre) {
        this.nivel_rareza = asignar_rareza(nivel_rareza);
        this.nivel = nivel;
        this.nombre = nombre;
    }

  
    private Rareza asignar_rareza(int rareza){
        switch(rareza){
            case 0:
                return Rareza.FRECUENTE;
            case 1:
                return Rareza.INFRECUENTE;
            case 2:
                return Rareza.RARO;
            case 3:
                return Rareza.MITICO;
            case 4:
                return Rareza.LEGENDARIO;
            default:
                return Rareza.FRECUENTE;
        }
    }

    public Rareza getNivel_rareza() {
        return nivel_rareza;
    }

    public void setNivel_rareza(Rareza nivel_rareza) {
        this.nivel_rareza = nivel_rareza;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;        
    }
}