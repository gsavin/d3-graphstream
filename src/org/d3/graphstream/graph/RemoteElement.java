package org.d3.graphstream.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.graphstream.graph.Element;

public abstract class RemoteElement implements Element {

	public void addAttribute(String attribute, Object... values) {
		// TODO Auto-generated method stub

	}

	public void addAttributes(Map<String, Object> attributes) {
		// TODO Auto-generated method stub

	}

	public void changeAttribute(String attribute, Object... values) {
		// TODO Auto-generated method stub

	}

	public void clearAttributes() {
		// TODO Auto-generated method stub

	}

	public Object[] getArray(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getAttribute(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getAttribute(String key, Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAttributeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Iterator<String> getAttributeKeyIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<String> getAttributeKeySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getFirstAttributeOf(String... keys) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getFirstAttributeOf(Class<T> clazz, String... keys) {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<?, ?> getHash(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public CharSequence getLabel(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getNumber(String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<? extends Number> getVector(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasArray(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasAttribute(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasAttribute(String key, Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasHash(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasLabel(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasNumber(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasVector(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeAttribute(String attribute) {
		// TODO Auto-generated method stub

	}

	public void setAttribute(String attribute, Object... values) {
		// TODO Auto-generated method stub

	}

}
