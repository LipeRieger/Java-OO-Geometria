public class GeometriaPlana extends Geometria {

    public double areaCirculo(double raio) {
        return pi * (raio * raio);
    }
    public double perimetroCirculo(double raio){
        return  2 * pi * raio;
    }
    public double areaRetangulo(double base, double altura){
        return base * altura;
    }
    public double perimetroRetangulo(double base, double altura){
        return  2 * (base + altura);
    }  
    public double areaTriangulo(double baseTrinagulo, double alturaTriangulo){
        return (baseTrinagulo * alturaTriangulo) / 2;
    }
    public double perimetroTriangulo(double lado1, double lado2, double lado3){
        return lado1 + lado2 + lado3;
    }
    public double areaPoligono(double numeroDeLados, double comprimentoDoLado ){
        return numeroDeLados*comprimentoDoLado;
    }
    public double PerimetoPoligono(double  perimetro, double apotema){
        return (perimetro * apotema)/2;
        
    }
}

