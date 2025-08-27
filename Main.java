import java.util.Scanner;

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String NEGRITO = "\u001B[1m";
    public static final String SUBLINHADO = "\u001B[4m";

    public static void main(String[] args) {
        GeometriaPlana obj = new GeometriaPlana();
        GeometriaEspacial obj2 = new GeometriaEspacial();
        Scanner meuScanner = new Scanner(System.in);    
        
        int escolhaUsuario;
        do{
            
            System.out.println(NEGRITO + "Escolha a forma geometrica- \n 1-Circulo \n 2-retangulo \n 3-triangulo \n 4-poligono regular \n 5-cubo \n 6-esfera \n 7-cilindro \n 8-prisma"+ RESET);
            escolhaUsuario = meuScanner.nextInt();
                switch (escolhaUsuario) {

                case 0:
                    break;

                case 1:
                    System.out.println("Deseja qual opção: 1-area, 2-perimetro? ou 3-voltar ao menu principal");
                    int escolhaUsuario2 = meuScanner.nextInt();

                    if(escolhaUsuario2 == 3) break;

                    System.out.println("Qual o raio?");
                    double raio = meuScanner.nextDouble();  

                    if (escolhaUsuario2 == 1) {
                        double area_do_circulo = obj.areaCirculo(raio);
                        System.out.println(area_do_circulo);
                    } else if (escolhaUsuario2 == 2) {
                        double perimetroCirculo = obj.perimetroCirculo(raio);
                        System.out.println(perimetroCirculo);
                    }
                    System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario2b = meuScanner.nextInt();
                    if (escolhaUsuario2b == 1){
                        break;
                    }else if(escolhaUsuario2b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                
                case 2:
                    System.out.println("Deseja qual opção: 1-volume, 2-area da superfície? ou 3-voltar ao menu principal");
                    int escolhaUsuario3 = meuScanner.nextInt();
                    if(escolhaUsuario3 == 3) break;
                    System.out.println("Qual a medida da aresta?");
                    double aresta = meuScanner.nextDouble();
                    if (escolhaUsuario3 == 1) {
                        double volume_do_cubo = obj2.volumeCubo(aresta);
                        System.out.println(volume_do_cubo);
                    } else if (escolhaUsuario3 == 2) {
                        double area_superficial_do_cubo = obj2.areaSuperficialCubo(aresta);
                        System.out.println(area_superficial_do_cubo);
                    }
                    System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario3b = meuScanner.nextInt();
                    if (escolhaUsuario3b == 1){
                        break;
                    }else if(escolhaUsuario3b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                case 3:
                    System.out.println("Deseja qual opção: 1-volume ou 2-area da superfície?");
                    int escolhaUsuario4 = meuScanner.nextInt();
                    if(escolhaUsuario4 == 3) break;
                    System.out.println("Qual a medida do raio?");
                    double raioEsfera = meuScanner.nextDouble();
                    if (escolhaUsuario4 == 1) {
                        double volume_da_esfera = obj2.volumeEsfera(raioEsfera);
                        System.out.println(volume_da_esfera);
                    } else if (escolhaUsuario4 == 2) {
                        double area_superficial_da_esfera = obj2.areaSuperficialEsfera(raioEsfera);
                        System.out.println(area_superficial_da_esfera);
                    }
                    System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario4b = meuScanner.nextInt();
                    if (escolhaUsuario4b == 1){
                        break;
                    }else if(escolhaUsuario4b == 2){
                        escolhaUsuario = 0;
                    }
                    break;

                case 4:
                    System.out.println("Deseja qual opção: 1-volume ou 2-area da superfície?");
                    int escolhaUsuario5 = meuScanner.nextInt();
                    if(escolhaUsuario5 == 3) break;
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
                    System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario5b = meuScanner.nextInt();
                    if (escolhaUsuario5b == 1){
                        break;
                    }else if(escolhaUsuario5b == 2){
                        escolhaUsuario = 0;
                    }
                    break;

                case 5:
                    System.out.println("Deseja qual opção: 1-volume ou 2-area da superfície?");
                    int escolhaUsuario6 = meuScanner.nextInt();
                    if(escolhaUsuario6 == 3) break;
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
                    System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario6b = meuScanner.nextInt();
                    if (escolhaUsuario6b == 1){
                        break;
                    }else if(escolhaUsuario6b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                case 6:
                    System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                    int escolhaUsuario7 = meuScanner.nextInt();
                    if(escolhaUsuario7 == 3) break;
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
                    System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario7b = meuScanner.nextInt();
                    if (escolhaUsuario7b == 1){
                        break;
                    }else if(escolhaUsuario7b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                case 7:
                    System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                    int escolhaUsuario8 = meuScanner.nextInt();
                    if(escolhaUsuario8 == 3) break;
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
                    System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario8b = meuScanner.nextInt();
                    if (escolhaUsuario8b == 1){
                        break;
                    }else if(escolhaUsuario8b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                    case 8: 
                        System.out.println("Deseja qual opção: 1-area ou 2-perimetro?");
                        int escolhaUsuario9 = meuScanner.nextInt();
                        if(escolhaUsuario9 == 3) break;
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
                        System.out.println("deseja voltar ao menu ou sair \n 1-voltar ao menu principal ou 2-sair");
                    int escolhaUsuario9b = meuScanner.nextInt();
                    if (escolhaUsuario9b == 1){
                        break;
                    }else if(escolhaUsuario9b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }while (escolhaUsuario != 0);  
    }
}