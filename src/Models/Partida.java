package Models;

import java.util.Random;

public class Partida {
    int codigo;
    String data;
    Time mandante;
    Time visitante;
    int golsMandante;
    int golsVisitantes;
    boolean confirmada;
    boolean realizada;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Time getMandante() {
        return mandante;
    }
    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }
    public Time getVisitante() {
        return visitante;
    }
    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }
    public int getGolsMandante() {
        return golsMandante;
    }
    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }
    public int getGolsVisitantes() {
        return golsVisitantes;
    }
    public void setGolsVisitantes(int golsVisitantes) {
        this.golsVisitantes = golsVisitantes;
    }
    public boolean isConfirmada() {
        if(this.mandante.serie == this.visitante.serie){
            confirmada = true;
        }
        else {
            confirmada = false;
        }
        return confirmada;
    }
    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }
    public boolean isRealizada() {
        return realizada = false;
    }
    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
    public Partida(int codigo, String data, Time mandante, Time visitante) {
        this.codigo = codigo;
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;
        this.realizada = false;
        this.golsMandante = 0;
        this.golsVisitantes = 0;
    }
    public Partida(){}
    public void definirResultado(){ 
        if(isConfirmada() == true && realizada == false){
         Random numGols = new Random();
         golsMandante = numGols.nextInt(7);
         golsVisitantes = numGols.nextInt(7);
         mandante.registrarResultado(golsMandante, golsVisitantes);
         visitante.registrarResultado(golsVisitantes, golsMandante);
         realizada = true;
        } else {
            System.out.println("não é possível definir o resultado");
        }
    }
    public void apresentarResultado(){
        if(realizada == true){
            mandante.linha();
            System.out.println("código da partida " + codigo);
            System.out.println("Time mandante: " + mandante.Nome + " quantidade de gols feitos: " + mandante.golsFeitos);
            System.out.println("Time visitante: "+ visitante.Nome + " quantidade de gols feitos: " + visitante.golsFeitos );
            System.out.println("Time mandante vitórias: " +mandante.vitorias + " Time visitante vitórias: " + visitante.vitorias);
            mandante.linha();
        }else {
            System.out.println("essa partida não é possível de ser realizada");
        }
    }
}
 