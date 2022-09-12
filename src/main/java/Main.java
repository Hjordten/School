public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1.74, 77, 60); //atribute er her det som er i parentes. Altså, hoejde.

        System.out.println(p1.getHoejde() + " " + p1.getVaegt());
        p1.setHoejde(2.00);
        System.out.println(p1.getHoejde());
        System.out.println("");
        System.out.println(p1.beregnBMI());
    }
}
