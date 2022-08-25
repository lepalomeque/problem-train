/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trains.main;

/**
 *
 * @author Leiver Palomeque leiverpalomeque@gmail.com
 */
public class Edge {
    public Town origin;
	public Town destination;
	public int weight;
	public Edge next;

  public Edge (Town origin, Town destination){
    this(origin, destination, Integer.MAX_VALUE);
  }

	public Edge(Town origin, Town destination, int weight) {
		this.origin 		= origin;
		this.destination	= destination;
		this.weight 		= weight;
		this.next 		= null;
	}

	public Edge next(Edge edge) {
		this.next = edge;
		return this;
	}

  public double getWeight() {
    return weight;
  }

  public String toString() {
    return origin + "to" + destination;
  }
}
