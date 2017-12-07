package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author François and Julien
 *
 */
public class Pile {
	
	private List<Integer> elements = new ArrayList<>();

	
	/**
	 * Constructor with one argument : initialize Pile with elements
	 * @param e1
	 */
	public Pile(List<Integer> e1) {
		super();
		this.elements = e1;
	}
	
	
	/**
	 * Default constructor : initialize Pile with nothing
	 */
	public Pile() {
		
	}
	/**
	 * Method getElements : 
	 * @return the elements of the pile
	 */
	public List<Integer> getElements() {
		return elements;
	}

	/**
	 * Method setElements : set the elements of the pile
	 * @param elements
	 */
	public void setElements(ArrayList<Integer> elements) {
		
		this.elements = elements;
	}
	
	/**
	 * Method getFirstElement :
	 * @return the first element of the pile
	 */
	public Integer getFirstElement() {
		if(elements.size() > 0)
			return elements.get(elements.size()-1);
		else
			return null;
	}
	
	/**
	 * Method getFirstElement :
	 * @return the first element of the pile
	 */
	public List<String> getFiveLastElements() {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < 5 && i < elements.size(); i++) {
			list.add(elements.get(i).toString());
		}
		return list;
	}
	
	/**
	 * Method pop : remove the element at the bottom of the pile
	 */
	public void pop()
	{
		if(elements.size() != 0)
			elements.remove(elements.size()-1);
	}
	
	/**
	 * Method clear : remove all the elements of the list
	 * 
	 */
	public void clear()
	{
		elements.clear();
	}
	
	/**
	 * Method push : push the value at the bottom of the pile
	 * @param value
	 */
	public void push(Integer value)
	{
		elements.add(value);
	}
	
	/**
	 * Method size :
	 * @return size of the pile
	 */
	public int size()
	{
		return elements.size();
	}


}
