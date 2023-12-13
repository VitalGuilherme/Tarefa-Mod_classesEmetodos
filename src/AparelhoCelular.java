/**
 * @author VitalGuilherme
 */

public class AparelhoCelular {
    public AparelhoCelular() {
    }

    public static void main(String[] args) {
        System.out.println("Samsung Galaxy");
        fichaTecnica fichaTecnica = new fichaTecnica();
        fichaTecnica.alturaDoAparelho("Altura do aparelho 16cm");
        System.out.println(fichaTecnica.getAltura());
        fichaTecnica.comprimentoDoAparelho("Comprimento do aparelho 8cm");
        System.out.println(fichaTecnica.getComprimento());
        fichaTecnica.larguraDoAparelho("Largura do aparelho 1cm");
        System.out.println(fichaTecnica.getLargura());
    }
}
