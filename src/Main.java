import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {

        out.println("Desfile de relaciones entre objetos a continuacion: ");

        out.println("-");

        Persona p1 = new Persona("Romario", "Salas Cerdas");
        Persona p2 = new Persona("Valeria", "Solis Mora");

        Pasaporte pas1 = new Pasaporte("12345", "Costarricense",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2030, 1, 1),
                true);
        p1.sacarPasaporte(pas1);

        Pasaporte pas2 = new Pasaporte("54321", "Costarricense",
                LocalDate.of(2010, 1, 1),
                LocalDate.of(2015, 1, 1),
                false);
        p2.sacarPasaporte(pas2);

        p1.tomarVuelo("Italia (no Espania, jaja)");
        p2.tomarVuelo("Uruguay");

        out.print("--");

        Mascota m1 = new Mascota("Max", "perro", 5);
        p1.adoptarMascota(m1);
        p2.adoptarMascota(m1);

        out.println("\nMascotas jugando:");
        p1.jugarConMascota();
        p2.jugarConMascota();

        out.print("---");

        String[] metales = {"Hierro", "Acero", "Cobre"};
        MaquinaSoldar maq1 = new MaquinaSoldar("Outstanding Machine", "123BOOF", 12321, metales);

        MaquinaSoldar maq2 = new MaquinaSoldar("Useless Machine", "FOOB321", 23422, metales);

        out.println("\nIntento de soldar:");
        p1.soldarConMaquina(maq2, "Titanio");
        p2.soldarConMaquina(maq1, "Hierro");
    }
}