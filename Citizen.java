public abstract class Citizen {
    public String name;
    public Citizen(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String toString();

    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

