public class House extends Live {
    public House() {
    }

    public House(String where, String adress, int numbOfPeople) {
        super(where, adress, numbOfPeople);
    }

    public House(String where, int numbOfPeople) {
        super(where, numbOfPeople);
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
        System.out.println(getNumbOfPeople()+" people live in "+getWhere());
    }

    @Override
    public void liveAt() {
        System.out.println(getWhere()+" at adress "+getAdress());
    }

    @Override
    public void pay() {
        System.out.println("House livers pay utilities");
    }

    @Override
    public String toString() {
        return "House{" +
                "where='" + getWhere() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", numbOfPeople=" + getNumbOfPeople() +
                '}';
    }
}
