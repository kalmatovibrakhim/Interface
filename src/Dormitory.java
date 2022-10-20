public class Dormitory extends Live{
    public Dormitory() {
    }

    public Dormitory(String where, String adress, int numbOfPeople) {
        super(where, adress, numbOfPeople);
    }

    public Dormitory(String where, int numbOfPeople) {
        super(where, numbOfPeople);
    }

    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }



    @Override
    public String getWhere() {
        return super.getWhere();
    }

    @Override
    public void setWhere(String where) {
        super.setWhere(where);
    }

    @Override
    public int getNumbOfPeople() {
        return super.getNumbOfPeople();
    }

    @Override
    public void setNumbOfPeople(int numbOfPeople) {
        super.setNumbOfPeople(numbOfPeople);
    }

    @Override
    public void live() {
        System.out.println(getNumbOfPeople()+" live at dormitory "+getWhere());
    }
    @Override
    public void liveAt() {
        System.out.println(getWhere()+" at adress "+getAdress());
    }

    @Override
    public void pay() {
        System.out.println("Dormitory livers pay rent");
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "where='" + getWhere() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", numbOfPeople=" + getNumbOfPeople() +
                '}';
    }
}
