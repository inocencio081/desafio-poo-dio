package src.br.com.dio.desafio_poo.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    @Override
    public double CalcularXp() {
        return xp_padrao * 10d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria { " +
                ", titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                "data=" + data + '\'' + '\'' +
                "XP=" + CalcularXp() + '\'' +
                 '}';
    }


}
