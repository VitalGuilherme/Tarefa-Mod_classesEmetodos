/**
 * @author VitalGuilherme
 * @version 1.0
 */

public class fichaTecnica {
    private String comprimento;
    private String largura;
    private String altura;

    public fichaTecnica() {
    }

    public String getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getLargura() {
        return this.largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getAltura() {
        return this.altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void alturaDoAparelho(String altura) {
        this.setAltura(altura);
    }

    public void comprimentoDoAparelho(String comprimento) {
        this.setComprimento(comprimento);
    }

    public void larguraDoAparelho(String largura) {
        this.setLargura(largura);
    }
}
