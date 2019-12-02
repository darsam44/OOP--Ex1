import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Ex1.Monom;
import Ex1.Range;
import Ex1.function;
import Ex1.functions;

public class Functions_GUI implements functions {
	
	ArrayList<function> functions_gui;
	
	//dar change
	@Override
	public int size() {
		return functions_gui.size();
	}

	@Override
	public boolean isEmpty() {
	if	(functions_gui.size() == 0) return true;
		return false;
	}

	//dar change
	@Override
	public boolean contains(Object o) {
		if (functions_gui.contains(o)) {
			return true;
		}
		return false;
	}
	// dar change
	@Override
	public Iterator<function> iterator() {
		return functions_gui.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(function e) {
		// TODO Auto-generated method stub
		return false;
	}

	//dar change
	@Override
	public boolean remove(Object o) {
		for( int i =0 ; i < functions_gui.size() ; i++) {
			if ( functions_gui.get(i) == o) {
				//need to delete
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends function> c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	//dar change
	@Override
	public void clear() {
		functions_gui.clear();
	}

	@Override
	public void initFromFile(String file) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveToFile(String file) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFunctions(int width, int height, Range rx, Range ry, int resolution) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFunctions(String json_file) {
		// TODO Auto-generated method stub
		
	}

}
