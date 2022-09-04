public class Test {
    public static void main(String[] args) {
        /**
         * Creamos objetos de las clases Vaca, Gallinas,Hervivoros
         * para comprobar la sobrescritura del metodo queCome que creamos en la clase animal
         */
        Animal animal=new Animal();
        animal.queCome();
        System.out.println("..................................................");
        Vaca vaca= new Vaca();
        vaca.queCome();
        System.out.println("..................................................");
        Gallinas gallinas= new Gallinas();
        gallinas.queCome();
        System.out.println("..................................................");
        Hervivoros hervivoros= new Hervivoros();
        hervivoros.queCome();

    }
}
