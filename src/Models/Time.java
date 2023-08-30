package Models;

public class Time {
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        if (serie.toUpperCase() == "A" || serie.toUpperCase() == "B" || serie.toUpperCase() == "C") {
            this.serie = serie;
        } else {
            System.out.println("Série inválida");
        }
    }

    public Boolean getEstadioProprio() {
        return estadioProprio;
    }

    public void setEstadioProprio(Boolean estadioProprio) {
        this.estadioProprio = estadioProprio;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(int golsFeitos) {
        this.golsFeitos = 0;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = 0;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = 0;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = 0;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = 0;
    }

    public Time(int codigo, String nome, String cidade, int anoFundacao, String serie, Boolean estadioProprio) {
        this.codigo = codigo;
        this.Nome = nome;
        this.Cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.serie = serie;
        this.estadioProprio = estadioProprio;

    }

    public void registrarResultado(int gf, int gs) {
        this.golsFeitos += gf;
        this.golsSofridos += gs;
        if (gf > gs) {
            this.vitorias++;
        } else if (gf == gs) {
            this.empates++;
        } else {
            this.derrotas++;
        }
    }

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

    public void linha() {
        System.out.println("=========================================================");
    }
}
