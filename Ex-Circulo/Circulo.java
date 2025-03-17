

public class Circulo 
{
    // atributo privvado
    private double raio;
    //metodo alterar raio
    public void setRaio (double r)
    {
        if (raio < 0){
           System.out.println(" O Raio não pode ser negativo!");
        } else {
                raio = r;
                }
    }
    //metodo informar raio
    public double getRaio()
    {
        return raio;
    }

    public double calcDiametro(){
        return 2 * raio;
    }

    public double calcArea() {
        return Math.PI * Math.pow(raio,2);
    }

    public double calcCircunferencia(){
        return 2 * Math.PI * raio;
    }


    // metodo exibir dados
    public void exibeDados()
    {
        System.out.println("Raio: " + getRaio());
        System.out.println("Diametro " + calcDiametro());
        System.out.println("Area: " + calcArea());
        System.out.println("Circunferencia: " + calcCircunferencia());
    }

    

}