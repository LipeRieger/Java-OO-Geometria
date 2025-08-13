
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Escolha a formula geometrica- 1-Circulo, 2-retangulo, 3-triangulo,4-poligono regular, 5-cubo,6-esfera,7-cilindro,8-prisma");
        int escolhaUsuario = meuScanner.nextInt();

        if(escolhaUsuario>0 && escolhaUsuario<5){
            
            
        }else if (escolhaUsuario>4 && escolhaUsuario<8){
            
        }else{
            System.out.println("Opcao invalida");
        }
    }
}