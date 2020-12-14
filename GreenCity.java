public class GreenCity extends City {

    @Override
    public String toString(){
        return "Зеленый город";
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

