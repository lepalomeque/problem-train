/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trains.main;

/**
 *
 * @author Leiver Palomeque leiverpalomeque@gmail.com
 */
public class Town {
    protected String name;
	protected boolean visited;

	public Town(String name) {
		this.name = name;
		this.visited = false;
	}

  public String getName(){
    return this.name;
  }

  public boolean getVisited(){
    return this.visited;
  }


	@Override
	public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

		if (obj.getClass() != getClass() || obj == null ) {
	        return false;
	    }

		Town rhsTown = (Town)obj;
    return this.name.equals(rhsTown.name);
	}

	@Override
	public int hashCode() {
		if(this.name == null) return 0;
		return this.name.hashCode();
	}

  @Override
  public String toString() {
    return this.name.toString();
  }
}
