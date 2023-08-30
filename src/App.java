import Models.Partida;
import Models.Time;

public class App {
    public static void main(String[] args) throws Exception {
        Partida[] partidas = new Partida[6];

        Time[] times = new Time[9];
        times[0] = new Time(10, "time01", "cidade01", 2000, "A", false);
        times[1] = new Time(11, "time02", "cidade02", 2001, "A", false);
        times[2] = new Time(12, "time03", "cidade03", 2002, "B", false);
        times[3] = new Time(13, "time04", "cidade04", 2003, "B", false);
        times[4] = new Time(14, "time05", "cidade05", 2004, "B", false);
        times[5] = new Time(15, "time06", "cidade06", 2005, "C", false);
        times[6] = new Time(16, "time07", "cidade07", 2006, "C", false);
        times[7] = new Time(17, "time08", "cidade08", 2007, "A", false);
        times[8] = new Time(18, "time09", "cidade09", 2008, "A", false);

        partidas[0] = new Partida(10, "01/01/2020", times[0], times[1]);
        partidas[1] = new Partida(20, "02/02/2020", times[2], times[3]);
        partidas[2] = new Partida(30, "03/03/2020", times[4], times[5]);
        partidas[3] = new Partida(60, "06/06/2020", times[0], times[8]);
        partidas[4] = new Partida(40, "04/04/2020", times[7], times[0]);
        partidas[5] = new Partida(50, "05/05/2020", times[7], times[8]);
        for (int i = 0; i < times.length; i++) {
            times[i].apresentar();
        }
        for (int i = 0; i < partidas.length; i++) {
            partidas[i].definirResultado();
            partidas[i].apresentarResultado();
        }
    }
}