package be.vdab.hfdst10.oefeningen;

public class Personenwagen extends Voertuig {

    int aantalDeuren = 4;
    int aantalPassagiers = 5;

    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        if (aantalDeuren >= 0) this.aantalDeuren = aantalDeuren;
        if (aantalPassagiers >= 0) this.aantalPassagiers = aantalPassagiers;
    }

    @Override
    public double getKyotoScore() {
        return (gemVerbruik*pk)/aantalPassagiers;
    }

    @Override
    public String toString() {
        return aantalDeuren + ", " + aantalPassagiers + ", " + polishouder + ", " + kostprijs + ", " + pk + ", " + gemVerbruik + ", " + nummerplaat;
    }


    @Override
    public String toon() {
        return "Personenwagen{" +
                "aantalDeuren=" + aantalDeuren +
                ", aantalPassagiers=" + aantalPassagiers +
                ", polishouder='" + polishouder + '\'' +
                ", kostprijs=" + kostprijs +
                ", pk=" + pk +
                ", gemVerbruik=" + gemVerbruik +
                ", nummerplaat='" + nummerplaat + '\'' +
                '}';
    }


}
