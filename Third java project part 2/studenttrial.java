public class studenttrial {// name of class
    public static void main (String [] args){// initialise method
        Student [] StudentArray = new Student[2];//create array
        StudentArray[0]=new Student("Jack",123);//assign variables to array
        StudentArray[1]=new Student("Jesus",456);//assign variables to array


        //loop to traverse array
        for(int i = 0; i < StudentArray.length; i++){
         
            
            //prints names and ID's stored in the array
            
            
            System.out.println(StudentArray[i]);
 
    }
}   
}

    
