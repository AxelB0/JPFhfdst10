package be.vdab.hfdst10.oefeningen;

public class Vrachtwagen extends Voertuig {

    float maxLading = 10000F;

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        this.maxLading = maxLading;
    }

    public float getMaxLading() {
        return maxLading;
    }

    public void setMaxLading(float maxLading) {
        if (maxLading >= 0) this.maxLading = maxLading;
        else this.maxLading = 10000F;
    }

    @Override
    public double getKyotoScore() {
        return (gemVerbruik*pk)/(maxLading/1000);
    }

    @Override
    public String toString() {
        return maxLading + ", " + polishouder + ", " + kostprijs + ", " + pk + ", " + gemVerbruik + ", " + nummerplaat;
    }

    @Override
    public String toon() {
        return "Vrachtwagen{" +
                "maxLading=" + maxLading +
                ", polishouder='" + polishouder + '\'' +
                ", kostprijs=" + kostprijs +
                ", pk=" + pk +
                ", gemVerbruik=" + gemVerbruik +
                ", nummerplaat='" + nummerplaat + '\'' +
                '}';
    }


}
