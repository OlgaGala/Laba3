public class Show extends Actions{

    public String babiesShowZnaika(){
        return "показали";
    }
    public String babiesNotShowZnaika(){
        return "не показали";
    }

    @Override
    public String toString(){
        return "показали";
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
