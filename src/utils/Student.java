package utils;


public class Student {
    private int id;

    private double gpa;
    private char gender;
    private String name;



    @Override
    public int hashCode(){
        int hash = 0;
        for(char c : name.toCharArray()){
            hash = c + (31 * hash);
        }
        return hash;
    }
    public Student(char gender,String name){
        this.gender=gender;
        this.name= name;
}


}