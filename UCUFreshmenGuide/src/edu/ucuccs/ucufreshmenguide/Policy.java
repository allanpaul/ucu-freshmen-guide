package edu.ucuccs.ucufreshmenguide;

public class Policy {

	// private variables
	int id;
	String name;
	String description;
	
	// Empty constructor
    public Policy(){
         
    }

 // constructor
    public Policy(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
     
    // constructor
    public Policy(String name, String description){
        this.name = name;
        this.description = description;
    }
    // getting ID
    public int getID(){
        return this.id;
    }
     
    // setting id
    public void setID(int id){
        this.id = id;
    }
     
    // getting name
    public String getName(){
        return this.name;
    }
     
    // setting name
    public void setName(String name){
        this.name = name;
    }
     
    // getting phone number
    public String getDescription(){
        return this.description;
    }
     
    // setting phone number
    public void setDescription(String description){
        this.description = description;
    }
}
