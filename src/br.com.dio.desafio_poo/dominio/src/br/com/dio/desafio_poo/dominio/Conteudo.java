package src.br.com.dio.desafio_poo.dominio;

public abstract class Conteudo {

    protected static final double xp_padrao = 10d;
    String titulo;
    String descricao;

    public abstract double CalcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
