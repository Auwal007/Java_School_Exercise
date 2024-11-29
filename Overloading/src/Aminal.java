public class Aminal {
    public void eats(){
        System.out.println("Animal is eating");
    }
}
 class Cow extends Aminal {
     public void eats() {
         System.out.println("Cow is eating");
     }
     public static void main(String[] args) {
         Cow cow = new Cow();
         cow.eats();
     }
 }

 /*[- class main {
         public static void main(String[] args) {
             Cow cow = new Cow();
             cow.eats();
         }

 }*/