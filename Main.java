import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		ArrayList<Boolean> list = new ArrayList<>();
    list.add(true);
    list.add(false);
    list.add(true);
   
    duplicate(list);

   System.out.println(list); // [true,false,true,true,false,true]

	}
	

  public static void duplicate(ArrayList<Boolean> bools) {
    for (int i = 0; i < bools.size(); i++) {
      bools.set(i, bools.get(i));
    }
    
    }

  }
	
}