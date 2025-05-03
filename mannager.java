public class mannager {
    employee[] e = new employee[10];

    public boolean insertEmployee(employee r){
        boolean IE = false;
        for (int i = 0; i<e.length ; i++){
            if (e[i] == null ){
              e[i] = r;
              IE = true;
              break;
            }
            
        }
        return IE;
    }

    public boolean removeEmployee( String ID2){
        boolean IE = false;
        for (int i  = 0 ; i<e.length ; i++){
            if (e[i] != null && e[i].getEmployeeId().equals(ID2)){              
                    e[i] = null;
                    IE = true;
                    break;              
            }
        }
        return IE;
    }
    
    public employee searchEmployee(String ID3){
       employee a = null;
         for(int i = 0 ; i<e.length ; i++){
             if(e[i] != null && e[i].getEmployeeId().equals(ID3)){               
                a = e[i];
               break;                
             }
         }
       return a;
    }

    public void showAll(){
        for (int i = 0 ; i<e.length ; i++){
           if (e[i] != null){
            System.out.println();
            System.out.println("\t\tEmployee name : "+ e[i].getName());
            System.out.println("\t\tEmployee age : "+ e[i].getAge());
            System.out.println("\t\tEmployee ID : "+ e[i].getEmployeeId());
            System.out.println("-------------------------------------------");
           }
        }
    }
    
}
