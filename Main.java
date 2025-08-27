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
            
            System.out.println(NEGRITO + "-- ESCOLHA UMA FORMA GEOMÉTRICA --\n-- GEOMETRIA PLANA --\n 1 - Círculo\n 2 - Retângulo\n 3 - Triangulo\n 4 - Poligono Regular\n-- GEOMETRIA ESPACIAL --\n 5 - Cubo\n 6 - Esfera\n 7 - Cilindro\n 8 - Prisma\n-- SISTEMA --\n 0 - Sair"+ RESET);
            escolhaUsuario = meuScanner.nextInt();
                switch (escolhaUsuario) {

                case 0:
                    break;

                case 1:
                    System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Área\n 2 - Perímetro\n 3 - Voltar");
                    int escolhaUsuario2 = meuScanner.nextInt();

                    if(escolhaUsuario2 == 3) break;

                    System.out.print("Insira a medida do raio: ");
                    double raio = meuScanner.nextDouble();  

                    if (escolhaUsuario2 == 1) {
                        double area_do_circulo = obj.areaCirculo(raio);
                        System.out.println("A área do círculo é: " + area_do_circulo);
                    } else if (escolhaUsuario2 == 2) {
                        double perimetroCirculo = obj.perimetroCirculo(raio);
                        System.out.println("O perímetro do círculo é: " + perimetroCirculo);
                    }
                    System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2 - Sair");
                    int escolhaUsuario2b = meuScanner.nextInt();
                    if (escolhaUsuario2b == 1){
                        break;
                    }else if(escolhaUsuario2b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                
                case 2:
                    System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Área\n 2 - Perímetro");
                    int escolhaUsuario7 = meuScanner.nextInt();
                    if(escolhaUsuario7 == 3) break;
                    System.out.print("Insira a medida da base: ");
                    double base = meuScanner.nextDouble();

                    System.out.print("Insira a medida da altura: ");
                    double altura = meuScanner.nextDouble();

                    if (escolhaUsuario7 == 1) {
                        double areaDoRetangulo = obj.areaRetangulo(base, altura);
                        System.out.println("A área do retângulo é: " + areaDoRetangulo);
                    break;
                    } else if (escolhaUsuario7 == 2) {
                        double  perimetroRetangulo = obj.perimetroRetangulo(base, altura);
                        System.out.println("O perímetro do retângulo é: " + perimetroRetangulo);
                    }
                    System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2 - Sair");
                    int escolhaUsuario7b = meuScanner.nextInt();
                    if (escolhaUsuario7b == 1){
                        break;
                    }else if(escolhaUsuario7b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                case 3:
                    System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Área\n 2 - Perímetro");
                    int escolhaUsuario8 = meuScanner.nextInt();
                    if(escolhaUsuario8 == 3) break;
                    if(escolhaUsuario8 == 1){
                        System.out.print("Insira a medida da base: ");
                        double baseTrinagulo = meuScanner.nextDouble();

                        System.out.print("Insira a medida da altura: ");
                        double alturaTriangulo = meuScanner.nextDouble();

                        double areaDoTriangulo = obj.areaTriangulo(baseTrinagulo, alturaTriangulo);
                        System.out.println(areaDoTriangulo);
                    }else if(escolhaUsuario8 == 2){
                        System.out.print("Insira a medida do 1° lado: ");
                        double lado1 = meuScanner.nextDouble();
                        System.out.print("Insira a medida do 2° lado> ");
                        double lado2 = meuScanner.nextDouble();
                        System.out.print("Insira a medida do 3° lado: ");
                        double lado3 = meuScanner.nextDouble();

                        double perimetroTriangulo = obj.perimetroTriangulo(lado1, lado2, lado3);
                        System.out.println(perimetroTriangulo);
                    }
                    System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2 - Sair");
                    int escolhaUsuario8b = meuScanner.nextInt();
                    if (escolhaUsuario8b == 1){
                        break;
                    }else if(escolhaUsuario8b == 2){
                        escolhaUsuario = 0;
                    }
                    break;

                case 4:
                        System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Área\n 2 - Perímetro");
                        int escolhaUsuario9 = meuScanner.nextInt();
                        if(escolhaUsuario9 == 3) break;
                        if(escolhaUsuario9 == 1){
                            System.out.print("Insira o número de lados: ");
                            double numeroDeLados = meuScanner.nextDouble();

                            System.out.print("Insira o comprimento do lado: ");
                            double comprimentoDoLado = meuScanner.nextDouble();

                            double PerimetoPoligono = obj.PerimetoPoligono(numeroDeLados, comprimentoDoLado);
                        }else if(escolhaUsuario9 == 2){
                            System.out.print("Insira a medida do perímetro: ");
                            double perimetro = meuScanner.nextDouble();

                            System.out.print("Insira a medida da apótema: ");
                            double apotema = meuScanner.nextDouble();

                            double areaPoligono = obj.areaPoligono(perimetro, apotema);
                        }
                        System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2 - Sair");
                    int escolhaUsuario9b = meuScanner.nextInt();
                    if (escolhaUsuario9b == 1){
                        break;
                    }else if(escolhaUsuario9b == 2){
                        escolhaUsuario = 0;
                    }
                    break;

                case 5:
                    System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Volume\n 2 - Área da Superfície\n 3 - Voltar");
                    int escolhaUsuario3 = meuScanner.nextInt();
                    if(escolhaUsuario3 == 3) break;
                    System.out.print("Insira a medida da aresta: ");
                    double aresta = meuScanner.nextDouble();
                    if (escolhaUsuario3 == 1) {
                        double volume_do_cubo = obj2.volumeCubo(aresta);
                        System.out.println("O volume do cubo é: " + volume_do_cubo);
                    } else if (escolhaUsuario3 == 2) {
                        double area_superficial_do_cubo = obj2.areaSuperficialCubo(aresta);
                        System.out.println("A área superficial do cubo é: " + area_superficial_do_cubo);
                    }
                    System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2- Sair");
                    int escolhaUsuario3b = meuScanner.nextInt();
                    if (escolhaUsuario3b == 1){
                        break;
                    }else if(escolhaUsuario3b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                case 6:
                    System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Volume\n 2 - Área da Superfície");
                    int escolhaUsuario4 = meuScanner.nextInt();
                    if(escolhaUsuario4 == 3) break;
                    System.out.print("Insira a medida do raio: ");
                    double raioEsfera = meuScanner.nextDouble();
                    if (escolhaUsuario4 == 1) {
                        double volume_da_esfera = obj2.volumeEsfera(raioEsfera);
                        System.out.println("O volume da esfera é: " + volume_da_esfera);
                    } else if (escolhaUsuario4 == 2) {
                        double area_superficial_da_esfera = obj2.areaSuperficialEsfera(raioEsfera);
                        System.out.println("A área superficial da esfera é: " + area_superficial_da_esfera);
                    }
                    System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2 - Sair");
                    int escolhaUsuario4b = meuScanner.nextInt();
                    if (escolhaUsuario4b == 1){
                        break;
                    }else if(escolhaUsuario4b == 2){
                        escolhaUsuario = 0;
                    }
                    break;
                case 7:
                    System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Volume 2 - Área da Superfície");
                    int escolhaUsuario5 = meuScanner.nextInt();
                    if(escolhaUsuario5 == 3) break;
                    System.out.print("Insira a medida do raio: ");
                    double raioCilindro = meuScanner.nextDouble();
                    System.out.print("Insira a medida da altura: ");
                    double alturaCilindro = meuScanner.nextDouble();
                    if (escolhaUsuario5 == 1) {
                        double volume_do_cilindro = obj2.volumeCilindro(raioCilindro, alturaCilindro);
                        System.out.println("O volume do cilindro é: " + volume_do_cilindro);
                    } else if (escolhaUsuario5 == 2) {
                        double area_superficial_do_cilindro = obj2.areaSuperficialCilindro(raioCilindro, alturaCilindro);
                        System.out.println("A área superficial do cilindro é: " + area_superficial_do_cilindro);
                    }
                    System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2 - Sair");
                    int escolhaUsuario5b = meuScanner.nextInt();
                    if (escolhaUsuario5b == 1){
                        break;
                    }else if(escolhaUsuario5b == 2){
                        escolhaUsuario = 0;
                    }
                    break;

                case 8: 
                        System.out.println("\n-- ESCOLHA UMA OPERAÇÃO --\n 1 - Volume\n 2 - Área da Superfície");
                        int escolhaUsuario6 = meuScanner.nextInt();
                        if(escolhaUsuario6 == 3) break;
                        System.out.print("Insira a medida da área: ");
                        double areaPrisma = meuScanner.nextDouble();
                        System.out.print("Insira a medida da altura: ");
                        double alturaPrisma = meuScanner.nextDouble();
                        if (escolhaUsuario6 == 1) {
                            double volume_do_prisma = obj2.volumePrisma(areaPrisma, alturaPrisma);
                            System.out.println("O volume do primsta é: " + volume_do_prisma);
                        } else if (escolhaUsuario6 == 2) {
                            System.out.println("Qual a medida do perimetro?");
                            double perimetroPrisma = meuScanner.nextDouble();
                            double area_superficial_do_prisma = obj2.areaSuperficialPrisma(areaPrisma, perimetroPrisma, alturaPrisma);
                            System.out.println("A área superficial do prisma é: " + area_superficial_do_prisma);
                        }
                        System.out.println("\n-- SISTEMA --\n 1 - Voltar\n 2 - Sair");
                        int escolhaUsuario6b = meuScanner.nextInt();
                        if (escolhaUsuario6b == 1){
                            break;
                        }else if(escolhaUsuario6b == 2){
                            escolhaUsuario = 0;
                        }
                        break;
                default:
                    throw new AssertionError();
            }
        }while (escolhaUsuario != 0);  
    }
}