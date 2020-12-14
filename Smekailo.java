public class Smekailo extends Citizen {

    public Smekailo(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }
    public void smekailoSay(){
        System.out.println(toString()+" "+"сказал:");
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
        Smekailo smekailo = (Smekailo)obj;
        return this.getName() == smekailo.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }



}
