public class Znaika extends Citizen implements Decide {
    public Znaika(String name) {
        super(name);
    }
    public String decide(){
        return "решил";
    }
    public void decideFirmly(String firmly){
        System.out.print(toString()+" "+firmly+" "+decide());
    }

    public void goToGreenCity(String move,String greenCity){
        System.out.println(" "+move+" "+greenCity);
    }
    public void znaikaStandOnHisOwn(){
        System.out.println(toString()+" "+"стоял на своем");
    }
    public void znaikaGoToDeath(String certain,String death){
        System.out.println(toString()+" "+"идет на "+certain+" "+death);
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Znaika znaika = (Znaika)obj;
        return this.getName() == znaika.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}