
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        
        System.out.println("Escolha a forma geometrica- 1-Circulo, 2-retangulo, 3-triangulo,4-poligono regular, 5-cubo,6-esfera,7-cilindro,8-prisma");
        int escolhaUsuario = meuScanner.nextInt();

        GeometriaPlana obj = new GeometriaPlana();
        GeometriaEspacial obj2 = new GeometriaEspacial();

        switch (escolhaUsuario) {
            case 1:
                System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                int escolhaUsuario2 = meuScanner.nextInt();

                System.out.println("Qual o raio?");
                double raio = meuScanner.nextDouble();

                if (escolhaUsuario2 == 1) {
                    double area_do_circulo = obj.areaCirculo(raio);
                    System.out.println(area_do_circulo);
                } else if (escolhaUsuario2 == 2) {
               
                }

                break;
            
            case 5:
                System.out.println("Deseja qual opção: 1-volume ou 2-area da superfície?");
                int escolhaUsuario3 = meuScanner.nextInt();

                System.out.println("Qual a medida da aresta?");
                double aresta = meuScanner.nextDouble();
                if (escolhaUsuario3 == 1) {
                    double volume_do_cubo = obj2.volumeCubo(aresta);
                    System.out.println(volume_do_cubo);
                } else if (escolhaUsuario3 == 2) {
                    double area_superficial_do_cubo = obj2.areaSuperficialCubo(aresta);
                    System.out.println(area_superficial_do_cubo);
                }
                break;
            
            case 6:
                System.out.println("Deseja qual opção: 1-volume ou 2-area da superfície?");
                int escolhaUsuario4 = meuScanner.nextInt();

                System.out.println("Qual a medida do raio?");
                double raioEsfera = meuScanner.nextDouble();
                if (escolhaUsuario4 == 1) {
                    double volume_da_esfera = obj2.volumeEsfera(raioEsfera);
                    System.out.println(volume_da_esfera);
                } else if (escolhaUsuario4 == 2) {
                    double area_superficial_da_esfera = obj2.areaSuperficialEsfera(raioEsfera);
                    System.out.println(area_superficial_da_esfera);
                }
                break;

            case 7:
                System.out.println("Deseja qual opção: 1-volume ou 2-area da superfície?");
                int escolhaUsuario5 = meuScanner.nextInt();

                System.out.println("Qual a medida do raio?");
                double raioCilindro = meuScanner.nextDouble();
                System.out.println("Qual a medida da altura?");
                double alturaCilindro = meuScanner.nextDouble();
                if (escolhaUsuario5 == 1) {
                    double volume_do_cilindro = obj2.volumeCilindro(raioCilindro, alturaCilindro);
                    System.out.println(volume_do_cilindro);
                } else if (escolhaUsuario5 == 2) {
                    double area_superficial_do_cilindro = obj2.areaSuperficialCilindro(raioCilindro, alturaCilindro);
                    System.out.println(area_superficial_do_cilindro);
                }
                break;

            case 8:
                System.out.println("Deseja qual opção: 1-volume ou 2-area da superfície?");
                int escolhaUsuario6 = meuScanner.nextInt();

                System.out.println("Qual a medida da area?");
                double areaPrisma = meuScanner.nextDouble();
                System.out.println("Qual a medida da altura?");
                double alturaPrisma = meuScanner.nextDouble();
                if (escolhaUsuario6 == 1) {
                    double volume_do_prisma = obj2.volumePrisma(areaPrisma, alturaPrisma);
                    System.out.println(volume_do_prisma);
                } else if (escolhaUsuario6 == 2) {
                    System.out.println("Qual a medida do perimetro?");
                    double perimetroPrisma = meuScanner.nextDouble();
                    double area_superficial_do_prisma = obj2.areaSuperficialPrisma(areaPrisma, perimetroPrisma, alturaPrisma);
                    System.out.println(area_superficial_do_prisma);
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}