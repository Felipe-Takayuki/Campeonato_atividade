# Campeonato

Esse projeto é uma foi uma atividade proposta pelo professor para simular um campeonato com pelo menos 9 times.

Nesse projeto era necessário duas classes uma para partida e outra para os times

# a classe **`Partida`** conta com as seguintes informações:

```java
    int codigo;
    String data;
    Time mandante;
    Time visitante;
    int golsMandante;
    int golsVisitantes;
    boolean confirmada;
    boolean realizada;
```

e o seu construtor apenas `int codigo, String data, Time mandante, Time visitante` pois o resto será definido de outras formas 

```java
public Partida(int codigo, String data, Time mandante, Time visitante) {
        this.codigo = codigo;
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;
 
    }
```

outras formas

verificação se a partida pode ser confirmada

```java
public boolean isConfirmada() {
        if(this.mandante.serie == this.visitante.serie){
            confirmada = true;
        }
        else {
            confirmada = false;
        }
        return confirmada;
    }
```

definição da quantidade de gols:

```java
public void definirResultado(){ 
        if(isConfirmada() == true && realizada == false){
         Random numGols = new Random();
         golsMandante = numGols.nextInt(7);
         golsVisitantes = numGols.nextInt(7);
         mandante.registrarResultado(golsMandante, golsVisitantes);
         visitante.registrarResultado(golsVisitantes, golsMandante);
         realizada = true;// realizada começa como false
        } else {
            System.out.println("não é possível definir o resultado");
        }
    }
```

getters e setters modificados

```java
public boolean isRealizada() {
        return realizada = false;
    }
```

```java
public boolean isConfirmada() {
        if(this.mandante.serie == this.visitante.serie){
            confirmada = true;
        }
        else {
            confirmada = false;
        }
        return confirmada;
    }
```

---

# e a classe **`Time`** será composta pelas informações:

```java
    int codigo;
    String Nome;
    String Cidade;
    int anoFundacao;
    String serie;
    Boolean estadioProprio;
    int golsFeitos;
    int golsSofridos;
    int vitorias;
    int empates;
    int derrotas;
```

e o construtor:

```java
public Time(int codigo, String nome, String cidade, int anoFundacao, String serie, Boolean estadioProprio) {
        this.codigo = codigo;
        this.Nome = nome;
        this.Cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.serie = serie;
        this.estadioProprio = estadioProprio;

    }
```

Getters e Setters modificados:

```java
public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = 0;
    }
```

```java
public void setGolsFeitos(int golsFeitos) {
        this.golsFeitos = 0;
    }
```

```java
public void setVitorias(int vitorias) {
        this.vitorias = 0;
    }
```

```java
public void setEmpates(int empates) {
        this.empates = 0;
    }
```

```java
public void setDerrotas(int derrotas) {
        this.derrotas = 0;
    }
```

funções especiais 

registra se o time venceu, empatou ou perdeu

```java
public void registrarResultado(int gf, int gs) {
        this.golsFeitos = gf;
        this.golsSofridos = gs;
        if (gf > gs) {
            this.vitorias++;
        } else if (gf == gs) {
            this.empates++;
        } else {
            this.derrotas++;
        }
    }
```

mostra as informações do time

```java
public void apresentar() {
        linha();
        System.out.println("Código do time: " + getCodigo());
        System.out.println("Nome do time: " + getNome());
        System.out.println("Cidade do time: " + getCidade());
        System.out.println("Ano de fundação do time: " + getAnoFundacao());
        System.out.println("Série do time: " + getSerie());
        if (this.estadioProprio == true) {
            System.out.println("Estádio próprio: sim");
        } else {
            System.out.println("Estádio próprio: não");
        }
        System.out.println("gols feitos: " + getGolsFeitos());
        System.out.println("gols sofridos" + getGolsSofridos());
        System.out.println("vitórias: " + getVitorias());
        System.out.println("empates: " + getEmpates());
        System.out.println("derrotas: " + getDerrotas());
        linha();
    }
```

---

## `função MAIN`

na função principal criamos os times e as partidas apresentamos os times e os resultados das partidas 

```java
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
```
