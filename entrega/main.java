package entrega;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        Estudiante[] estu = new Estudiante[5];
        Estudiante est1 = new Estudiante("Patr1", 170, 12 );
        Estudiante est2 = new Estudiante("Manuel", 173, 43);
        Estudiante est3 = new Estudiante("Javier", 189, 72);
        Estudiante est4 = new Estudiante("Alicia", 168, 52);
        Estudiante est5 = new Estudiante("Alberto", 189, 35);

        estu[0]=est1;
        estu[1]=est2;
        estu[2]=est3;
        estu[3]=est4;
        estu[4]=est5;
        System.out.println("Sin ordenar.");
        for (int i = 0; i < estu.length; i++){
            System.out.println(estu[i].toString());
        }
        Arrays.sort(estu);
        System.out.println("\n" + "Ordenado");
        for (int i = 0; i < estu.length; i++){
            System.out.println(estu[i].toString());
        }
    }
}
