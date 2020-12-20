public class InheritanceSample extends SampleProgram {

    public void Run() {
        Animal mammal2 = new Mammal();
        Mammal human2 = new Human();
        mammal2.action();
        mammal2.howl();
        human2.action();
        human2.howl();
//        human2.speak()

    }

    private class Animal {
        public void action() {
            System.out.println(" can move.");

        }

        public void howl() {
            System.out.println(" can cry.");
        }

    }

    private class Mammal extends Animal {
        public void action() {
            System.out.println(" I can move like an animal.");
        }
    }


    private class Human extends Mammal {
        public void action() {
            System.out.println(" can move delicately.");
        }

        public void speak() {
            System.out.println(" can speak.");
        }
    }

}
