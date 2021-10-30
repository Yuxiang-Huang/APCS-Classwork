public class Tester{
  public static void main (String[] args){
      Animal myAnimal =  new Animal ("bark", 13, "Katty");
      System.out.println(myAnimal.getName());
      myAnimal.speak();
      Bird myBird = new Bird ("chacha", 11, "Parrot", 12, "blue");
      myBird.speak();
      Animal a1= new Animal("meow", 10, "Catty");

      Bird b1= new Bird("tweeter", 60, "Birdy", 2, "black");

      //Bird is a type of animal but animal is not a type of bird.
      //Bird b2= new Animal("moo", 320, "NotCow");

      Animal a2= new Bird("Bruh", -19, "IHaveAWeirdAge", 15, "red");
  }
}
