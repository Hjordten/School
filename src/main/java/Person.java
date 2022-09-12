public class Person {

    private double hoejde;
    private int vaegt;
    private int alder;

    public Person(double hoejde, int vaegt, int alder) {
        this.hoejde = hoejde;
        this.vaegt = vaegt;
        this.alder = alder;

    }


    public double getHoejde() { //get metoder har ALDRIG parameter, fordi den skal give noget retur.
        return hoejde; //man skriver det som den skal returnere
    }

    public int getVaegt(){ //get metoder har ALDRIG parameter, fordi den skal give noget retur.
        return vaegt; //man skriver det som den skal returnere
    }

    public void setHoejde(double hoejde) { //set metode som tillader os at sætte hoejden på et objekt, som vi definere i main
        this.hoejde = hoejde; //set metoden.
    }

    public void setVaegt(int vaegt) {
        this.vaegt = vaegt;
    }
    public double beregnBMI(){
        double bmi = vaegt / Math.pow(hoejde,2);
        return bmi;

    }

    public void harFødselsdag(){

    }
}
