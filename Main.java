
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
                    double perimetroCirculo = obj.perimetroCirculo(raio);
                    System.out.println(perimetroCirculo);
                }

                break;
            
            case 2:
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
            
            case 3:
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

            case 4:
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

            case 5:
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
            case 6:
                System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                int escolhaUsuario7 = meuScanner.nextInt();

                System.out.println("Qual e a base?");
                double base = meuScanner.nextDouble();

                System.out.println("Qual a altura?");
                double altura = meuScanner.nextDouble();

                if (escolhaUsuario7 == 1) {
                    double areaDoRetangulo = obj.areaRetangulo(base, altura);
                    System.out.println(areaDoRetangulo);
                break;
                } else if (escolhaUsuario7 == 2) {
                    double  perimetroRetangulo = obj.perimetroRetangulo(base, altura);
                    System.out.println(perimetroRetangulo);
                }
                break;
            case 7:
                System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                int escolhaUsuario8 = meuScanner.nextInt();

                if(escolhaUsuario8 == 1){
                    System.out.println("Qual e a base?");
                    double baseTrinagulo = meuScanner.nextDouble();

                    System.out.println("Qual a altura?");
                    double alturaTriangulo = meuScanner.nextDouble();

                    double areaDoTriangulo = obj.areaTriangulo(baseTrinagulo, alturaTriangulo);
                    System.out.println(areaDoTriangulo);
                }else if(escolhaUsuario8 == 2){
                    System.out.println("Qual é o lado 1?");
                    double lado1 = meuScanner.nextDouble();
                    System.out.println("Qual é o lado 2? ");
                    double lado2 = meuScanner.nextDouble();
                    System.out.println("Qual é o lado 3?");
                    double lado3 = meuScanner.nextDouble();

                    double perimetroTriangulo = obj.perimetroTriangulo(lado1, lado2, lado3);
                    System.out.println(perimetroTriangulo);
                }
                    break;
                case 8: 
                    System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                    int escolhaUsuario9 = meuScanner.nextInt();
                    
                    if(escolhaUsuario9 == 1){
                        System.out.println("numero de lados");
                        double numeroDeLados = meuScanner.nextDouble();

                        System.out.println("comprimento do lado");
                        double comprimentoDoLado = meuScanner.nextDouble();

                        double PerimetoPoligono = obj.PerimetoPoligono(numeroDeLados, comprimentoDoLado);
                    }else if(escolhaUsuario9 == 2){
                        System.out.println("perimetro");
                        double perimetro = meuScanner.nextDouble();

                        System.out.println("apotema");
                        double apotema = meuScanner.nextDouble();

                        double areaPoligono = obj.areaPoligono(perimetro, apotema);
                    }
                    break;
            default:
                throw new AssertionError();
        }
    }
}