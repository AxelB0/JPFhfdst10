package be.vdab.hfdst10.oefeningen;

public abstract class Voertuig {

    public String polishouder = "onbepaald";
    public float kostprijs = 0.0F;
    public int pk = 0;
    public float gemVerbruik = 0.0F;
    public String nummerplaat = "onbepaald";



    public Voertuig() {
    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        if (polishouder != null && !polishouder.isBlank()) this.polishouder = polishouder;
        if (kostprijs > 0) this.kostprijs = kostprijs;
        if (pk > 0) this.pk = pk;
        if (gemVerbruik > 0) this.gemVerbruik = gemVerbruik;
        if (nummerplaat != null && !nummerplaat.isBlank()) this.nummerplaat = nummerplaat;
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        this.polishouder = polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        this.kostprijs = kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public void setGemVerbruik(float gemVerbruik) {
        this.gemVerbruik = gemVerbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    public abstract double getKyotoScore();


    @Override
    public String toString() {
        return polishouder + ", " + kostprijs + ", " + pk + ", " + gemVerbruik + ", " + nummerplaat;
    }

    public String toon() {
        return "Voertuig{" +
                "polishouder='" + polishouder + '\'' +
                ", kostprijs=" + kostprijs +
                ", pk=" + pk +
                ", gemVerbruik=" + gemVerbruik +
                ", nummerplaat='" + nummerplaat + '\'' +
                '}';
    }




}
