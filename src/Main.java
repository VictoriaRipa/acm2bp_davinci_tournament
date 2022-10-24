import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        Date comienzoDeCursada = new Date(2022, 7, 18);
        Date finDeCursada = new Date(2022, 11, 5);
        Date fechaParcial = new Date(2022, 8, 29);

        Season torneoDaVinci = new Season(
            "Torneo 2022, 2do cuatri",
            comienzoDeCursada,
            finDeCursada
        );
        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(new Player("profe Poo", "Goalkeeper"));
        profesPoo.addPlayer(new Player("profe ux", "Defender"));
        profesPoo.addPlayer(new Player("profe pw1", "Goalkeeper"));
        profesPoo.addPlayer(new Player("profe pw1", "Defender"));
        profesPoo.addPlayer(new Player("profe adp", "Defender"));

        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(new Player("Estudiante Poo", "Goalkeeper"));
        estudiantesPoo.addPlayer(new Player("Estudiante ux", "Goalkeeper"));
        estudiantesPoo.addPlayer(new Player("Estudiante pw1", "Goalkeeper"));
        estudiantesPoo.addPlayer(new Player("Estudiante pw1", "Goalkeeper"));
        estudiantesPoo.addPlayer(new Player("Estudiante adp", "Goalkeeper"));

        Match primerParcial = new Match(
            "Aula 116",
            fechaParcial,
            profesPoo,
            estudiantesPoo
        );

    }
}
