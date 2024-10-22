package be.vdab.hfdst10.oefeningen;

public class TestProgramma {
    public static void main(String[] args) {


        Personenwagen auto1 = new Personenwagen("Jeff", 34000, 150, 4.5F,"1ABC123", 4, 5);
        Vrachtwagen truck = new Vrachtwagen("Jeff", 150000, 380, 15F, "H34VYL04D",12000);

        System.out.println(auto1.getKyotoScore());
        System.out.println(truck.getKyotoScore());

        Voertuig[] voertuigen = new Voertuig[]{auto1, truck};

        for (var v: voertuigen){
            System.out.println(v.toString());
            System.out.println(v.toon());
        }

    }
}
