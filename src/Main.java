public class Main {
    public static void main(String[] args) {
        suma (3, 4 , 5);

        Coche Micoche = new Coche();
        Micoche.masPuertas();
        System.out.println(Micoche.puertas);


    }
    //primera parte
    public static void suma(int a, int b, int c){
        System.out.println(a+b+c);
    }

    //segunda parte
    static class Coche {
        public int puertas = 5;

        public void masPuertas(){
            this.puertas++;
        }
    }
}
