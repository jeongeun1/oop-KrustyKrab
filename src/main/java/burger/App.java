package burger;
public class App {
    public static void main(String[] args) {

        Hamburger hb= new Hamburger();
        System.out.println(hb);

        JellyPatty hb1 = new JellyPatty();
        System.out.println(hb1.getSauce());

        NastyPatty hb2 = new NastyPatty();
        System.out.println(hb2.getSauce2());



    }
}
