public class Babies {

    public void BabiesFeedZnaika(String feed,String z){
        System.out.println(toString()+" "+feed+" "+z);
    }
    public void BabiesTakeZnaika(String take,String z,String outskirts){
        System.out.println(toString()+" "+take+" "+ z +" "+outskirts);
    }
    public void BabiesShowZnaika(String show,String z,String road,String greenCity){
        System.out.println(toString()+" "+show+" "+ z +" "+road+" в "+greenCity);
    }


    @Override
    public String toString(){
        return "малыши";
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

