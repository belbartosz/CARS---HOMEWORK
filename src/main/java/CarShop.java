import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String nazwa;
    private List<CarOffer> listaOfert = new ArrayList<CarOffer>();

    public CarShop() {
    }

    public CarShop(String nazwa, List<CarOffer> listaOfert) {
        this.nazwa = nazwa;
        this.listaOfert = listaOfert;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<CarOffer> getListaOfert() {
        return listaOfert;
    }

    public void setListaOfert(List<CarOffer> listaOfert) {
        this.listaOfert = listaOfert;
    }

    public void addOffer(CarOffer... oferty) {
        for (CarOffer i : oferty) {
            this.listaOfert.add(i);
        }
    }


    @Override
    public String toString() {
        System.out.println("oferty slepu " + getNazwa() + ":");
        for (int i = 0; i < listaOfert.size(); i++) {
            System.out.println(listaOfert.get(i));
        }
        return ".";
    }
}
