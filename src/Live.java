public abstract class Live implements Livable{
    private String where;
    private String adress;
    private int numbOfPeople;


    public Live(String where, String adress, int numbOfPeople) {
        this.where = where;
        this.adress = adress;
        this.numbOfPeople = numbOfPeople;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Live(String where, int numbOfPeople) {
        this.where = where;
        this.numbOfPeople = numbOfPeople;
    }

    protected Live() {
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getNumbOfPeople() {
        return numbOfPeople;
    }

    public void setNumbOfPeople(int numbOfPeople) {
        this.numbOfPeople = numbOfPeople;
    }

    public abstract void live();
    public abstract void liveAt();

    @Override
    public void pay() {

    }

    @Override
    public String toString() {
        return "Live{" +
                "where='" + where + '\'' +
                ", adress='" + adress + '\'' +
                ", numbOfPeople=" + numbOfPeople +
                '}';
    }
}
