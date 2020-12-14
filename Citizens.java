public class Citizens implements Think {

    public void citizensDissuadeZnaika(String dissuade,String z){
        System.out.println(toString()+" "+dissuade+" "+z);
    }
    public void think(){
        System.out.println(toString()+" "+"считали:");
    }
    public void sayGoodbyeZnaika(String withTears,String sayGoodbye,String z){
        System.out.println(toString()+" "+withTears+" "+sayGoodbye+z);
    }

    @Override
    public String toString(){
        return "жители";
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

