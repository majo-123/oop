public class Dog {
    
        String name;
        boolean isMale;
        int numPuppies;
        Dog puppies[] = new Dog[3];
        
    public void setName (String dogName){
        name = dogName;
    }
    public String showName(){
        return name;
    }
    public String bark(){
        return "Woof! Woof!";
    }
    public void setNumber(int numOfPuppies){
        numPuppies = numOfPuppies;
    }
    public int showNumber(){
        return numPuppies;
    }
    public void setPuppies(Dog puppiesSet[]){
        puppies = puppiesSet;
    }
    public Dog[] showPuppies(){
        return puppies;
    }
     
    
    }

