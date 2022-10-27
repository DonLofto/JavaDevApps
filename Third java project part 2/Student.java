public class Student {//name of class
    private String name;// make name private
    private long id;// make ID private
    public Student(){}//  constructor with no arguements
    //constructor to initialise the instance variables student
    public Student(String name,long id){ this.name = name; this.id= id;}
    public String getName(){// returns name when execution of block is complete
        return name;
    }
    public void setName(String n) {// Register value under string name
        name = n;
    }
    public long getID(){//returns ID whens execution of block is complete
        return id;
    }
    public void setID(long i){// Register value under long name
        id = i;
    }
    public String toString(){
        return "Name:\t"+ name  + "\tID:\t" + id;
    } 
}  
  







    