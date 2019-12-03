package Ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Ex1.Monom;
import Ex1.Range;
import Ex1.function;
import Ex1.functions;

public class Functions_GUI implements functions {
	
	ArrayList<function> functions_gui;
	
	@Override
	public int size() {
		return functions_gui.size();
	}

	@Override
	public boolean isEmpty() {
	if	(functions_gui.size() == 0) return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return functions_gui.contains(o);
	}

	@Override
	public Iterator<function> iterator() {
		return functions_gui.iterator();
	}

	@Override
	public Object[] toArray() {
		return functions_gui.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.functions_gui.toArray(a);
	}

	@Override
	public boolean add(function e) {
		return functions_gui.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return functions_gui.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return functions_gui.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends function> c) {
		return functions_gui.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return functions_gui.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return functions_gui.retainAll(c);
	}

	@Override
	public void clear() {
		functions_gui.clear();
	}

	@Override
	public void initFromFile(String file) throws IOException {
		functions_gui = new ArrayList<function>(); 
		FileReader file_Strings = new FileReader(file);
		BufferedReader reader = new BufferedReader(file_Strings);
		String line_String = reader.readLine();
		
		while (line_String != null ) {
			int loc = line_String.indexOf("f(x)=");
			line_String = line_String.substring(loc+5); // cut substring of "f(x)="
			line_String = line_String.strip(); // cut the spaces
			ComplexFunction cf_new = new ComplexFunction();
			cf_new.initFromString(line_String); 
			functions_gui.add(cf_new); // add the function to the array
			line_String = reader.readLine(); //skip to the next line
		}
		reader.close(); //close the reading
	}

	//shani
	@Override
	public void saveToFile(String file) throws IOException {
		BufferedWriter writer= new BufferedWriter(new FileWriter(file));
		writer.write(file);
		writer.close();		
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
