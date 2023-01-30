package entrega;
public class Estudiante implements Comparable<Estudiante> {
    String nombre;
    int altura;
    int edad;

    public Estudiante (String nombre, int altura, int edad){
        this.nombre=nombre;
        this.altura=altura;
        this.edad=edad;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Estudiante " +
                "nombre = " + nombre +
                ", edad = " + edad +
                ", altura = " + altura;
    }

    public int compareTo (Estudiante o){
        int resultado;
        if (this.getAltura() > o.getAltura()){
            resultado = -1;
        } else if (this.getAltura() < o.getAltura()) {
            resultado = 1;
        } else if (this.getEdad() > o.getEdad()){
            resultado = -1;
        } else if (this.getEdad() < o.getEdad()){
            resultado = 1;
        }
        else {
            resultado = 0;
        }
        return resultado;
    }
}
