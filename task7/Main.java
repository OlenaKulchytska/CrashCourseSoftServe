package task7;

public class Main {


    public static void main(String[] args) {
        Bird[] birds;
        birds = new Bird[4];
        birds[0]= new Eagle();
        birds[1]= new Pinguin();
        birds[2]= new Chicken();
        birds[3]= new Swallow();
        for (int i =0; i< birds.length;i++) {
            System.out.println(birds[i]);
        }
        birds[0].fly();
        birds[1].fly();
        birds[2].fly();
        birds[3].fly();
    }
}
