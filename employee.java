public class employee {
    String ID;
    String name;
    int age;

    public employee(){}
    public employee(String ID, String name , int age ){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setAge(int age ){
        this.age = age;
    }
    public String getEmployeeId(){
        return ID;
    }
    public String getName(){
        return name ;
    }
    public int getAge(){
        return age;
    }

    

    
}
