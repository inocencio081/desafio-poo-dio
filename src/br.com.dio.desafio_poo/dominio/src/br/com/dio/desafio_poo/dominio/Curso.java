package src.br.com.dio.desafio_poo.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double CalcularXp() {
        return xp_padrao * 10d;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                "XP=" + CalcularXp() + '\'' +
                '}';
    }
}
