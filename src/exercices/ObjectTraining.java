public class ObjectTraining {

    // TODO 1. Add the following private attributes :
    // - name (String)
    // - age (int)
    // - wilder (boolean)

	private String name;
	private int age;
	private boolean wilder;

    // TODO 2. Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes

	public ObjectTraining(String name, int age) {
		this.name=name;
		this.age=age;
	}	

    // TODO 3. Add getter method for name attribute
 	public String getName() {
    		return this.name;
	}


    // TODO 4. Add setter method for name attribute
 	 public void setName(String newName) {
    		this.name = newName;
  	}
	

    // TODO 5. Add getter method for age attribute
 	public int getAge() {
    		return this.age;
	}

    // TODO 6. Add setter method for age attribute
	public void setAge(int newAge) {
    		this.age = newAge;
  	}

    // TODO 7. Add getter method for wilder attribute

  // Getter
 	public boolean isWilder() {
    		return this.wilder;
	}
    // TODO 8. Add setter method for wilder attribute

	public void setWilder(boolean newWilder) {
    		this.wilder = newWilder;
  	}
    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values
	public String whoAmI() {
		return "My name is " +this.name +" and I'm " + String.valueOf(this.age) ;
}

    // Do not remove this empty constructor !
    public ObjectTraining() {
    }
}
