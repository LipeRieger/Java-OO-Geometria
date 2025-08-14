
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        
        System.out.println("Escolha a forma geometrica- 1-Circulo, 2-retangulo, 3-triangulo,4-poligono regular, 5-cubo,6-esfera,7-cilindro,8-prisma");
        int escolhaUsuario = meuScanner.nextInt();

        GeometriaPlana obj = new GeometriaPlana();

        switch (escolhaUsuario) {
            case 1:
                System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                int escolhaUsuario2 = meuScanner.nextInt();

                System.out.println("Qual o raio?");
                double raio = meuScanner.nextDouble();

                if (escolhaUsuario2 == 1) {;
                    double area_do_circulo = obj.areaCirculo(raio);
                    System.out.println(area_do_circulo);
                } else if (escolhaUsuario2 == 2) {
                    double perimetroCirculo = obj.perimetroCirculo(raio);
                    System.out.println(perimetroCirculo);
                }
                break;
            case 2:
                System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                int escolhaUsuario3 = meuScanner.nextInt();

                System.out.println("Qual e a base?");
                double base = meuScanner.nextDouble();

                System.out.println("Qual a altura?");
                double altura = meuScanner.nextDouble();

                if (escolhaUsuario3 == 1) {
                    double areaDoRetangulo = obj.areaRetangulo(base, altura);
                    System.out.println(areaDoRetangulo);
                break;
                } else if (escolhaUsuario3 == 2) {
                    double  perimetroRetangulo = obj.perimetroRetangulo(base, altura);
                    System.out.println(perimetroRetangulo);
                }
                break;
            case 3:
                System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                int escolhaUsuario4 = meuScanner.nextInt();

                if(escolhaUsuario4 == 1){
                    System.out.println("Qual e a base?");
                    double baseTrinagulo = meuScanner.nextDouble();

                    System.out.println("Qual a altura?");
                    double alturaTriangulo = meuScanner.nextDouble();

                    double areaDoTriangulo = obj.areaTriangulo(baseTrinagulo, alturaTriangulo);
                    System.out.println(areaDoTriangulo);
                }else if(escolhaUsuario4 == 2){
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
                case 4: 
                    System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                    int escolhaUsuario5 = meuScanner.nextInt();
                    
                    if(escolhaUsuario5 == 1){
                        System.out.println("numero de lados");
                        double numeroDeLados = meuScanner.nextDouble();

                        System.out.println("comprimento do lado");
                        double comprimentoDoLado = meuScanner.nextDouble();

                        double PerimetoPoligono = obj.PerimetoPoligono(numeroDeLados, comprimentoDoLado);
                    }else if(escolhaUsuario5 == 2){
                        System.out.println("perimetro");
                        double perimetro = meuScanner.nextDouble();

                        System.out.println("apotema");
                        double apotema = meuScanner.nextDouble();

                        double areaPoligono = obj.areaPoligono(perimetro, apotema);
                    }
            default:
                throw new AssertionError();
        }
    }
}