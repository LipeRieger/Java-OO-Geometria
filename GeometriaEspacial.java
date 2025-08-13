public class GeometriaEspacial extends Geometria{
    public double aresta;
    public double perimetro;

    //CUBO
    public double volumeCubo(double aresta) {
        return aresta * aresta * aresta;
    }

    public double areaSuperficialCubo(double aresta) {
        return 6 * (aresta * aresta);
    }

    //ESFERA
    public double volumeEsfera(double raio) {
        return (4/3) * pi * (raio * raio * raio);
    }

    public double areaSuperficialEsfera(double raio) {
        return 4 * pi * (raio * raio);
    }

    //CILINDRO
    public double volumeCilindro(double raio, double altura) {
        return pi * (raio * raio) * altura;
    }

    public double areaSuperficialCilindro(double raio, double altura) {
        return 2 * pi * raio * (altura + raio);
    }

    // PRISMA
    public double volumePrisma(double area, double altura) {
        return area * altura;
    }

    public double areaSuperficialPrisma(double area, double perimetro, double altura) {
        return 2 * area + perimetro * altura;
    }
}
