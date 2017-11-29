package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import model.Pile;

public class TestPile {
	@Test
	public void testPile() throws Exception 
	{
		List<Integer>e1=new ArrayList<Integer>();
		e1.add(1);
		e1.add(4);
		e1.add(8);
		Pile p1 = new Pile(e1);
		p1.pop();
		assertEquals((Object)4,p1.getElements().get(1));
		p1.push(10);
		assertEquals((Object)10,p1.getElements().get(p1.getElements().size()-1));
		p1.clear();
		assertTrue(e1.isEmpty());
	}
}
