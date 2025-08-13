
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
               
                }
                break;
           
            default:
                throw new AssertionError();
        }
    }
}