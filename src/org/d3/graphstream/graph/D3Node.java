package org.d3.graphstream.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

public class D3Node implements Node {

	public <T extends Node> Iterator<T> getBreadthFirstIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> Iterator<T> getBreadthFirstIterator(boolean directed) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getDegree() {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends Node> Iterator<T> getDepthFirstIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> Iterator<T> getDepthFirstIterator(boolean directed) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Iterable<T> getEachEdge() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Iterable<T> getEachEnteringEdge() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Iterable<T> getEachLeavingEdge() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdge(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeBetween(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeBetween(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeBetween(int index)
			throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeFrom(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeFrom(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeFrom(int index)
			throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Iterator<T> getEdgeIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Collection<T> getEdgeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeToward(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeToward(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdgeToward(int index)
			throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEnteringEdge(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Iterator<T> getEnteringEdgeIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Collection<T> getEnteringEdgeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Graph getGraph() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getInDegree() {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends Edge> T getLeavingEdge(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Iterator<T> getLeavingEdgeIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Collection<T> getLeavingEdgeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> Iterator<T> getNeighborNodeIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getOutDegree() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasEdgeBetween(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeBetween(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeBetween(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeFrom(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeFrom(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeFrom(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeToward(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeToward(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasEdgeToward(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

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

	public Iterator<Edge> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
