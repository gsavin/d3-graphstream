package org.d3.graphstream.graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.d3.actor.Entity;
import org.d3.entity.EReference;

import org.graphstream.graph.Edge;
import org.graphstream.graph.EdgeFactory;
import org.graphstream.graph.EdgeRejectedException;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.Graph;
import org.graphstream.graph.IdAlreadyInUseException;
import org.graphstream.graph.Node;
import org.graphstream.graph.NodeFactory;
import org.graphstream.stream.AttributeSink;
import org.graphstream.stream.ElementSink;
import org.graphstream.stream.GraphParseException;
import org.graphstream.stream.Sink;
import org.graphstream.stream.file.FileSink;
import org.graphstream.stream.file.FileSource;
import org.graphstream.ui.swingViewer.Viewer;

public class D3Graph extends Entity implements Graph {
	private static final long serialVersionUID = -8798999308377082909L;

	LinkedList<EReference> graphParts;
	
	public D3Graph(String id) {
		super(id);
	}
	
	public <T extends Edge> T addEdge(String id, String node1, String node2)
			throws IdAlreadyInUseException, ElementNotFoundException,
			EdgeRejectedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T addEdge(String id, String from, String to,
			boolean directed) throws IdAlreadyInUseException,
			ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T addEdge(String id, int index1, int index2)
			throws IndexOutOfBoundsException, IdAlreadyInUseException,
			EdgeRejectedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T addEdge(String id, int fromIndex, int toIndex,
			boolean directed) throws IndexOutOfBoundsException,
			IdAlreadyInUseException, EdgeRejectedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T addEdge(String id, Node node1, Node node2)
			throws IdAlreadyInUseException, EdgeRejectedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T addEdge(String id, Node from, Node to,
			boolean directed) throws IdAlreadyInUseException,
			EdgeRejectedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> T addNode(String id) throws IdAlreadyInUseException {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<AttributeSink> attributeSinks() {
		// TODO Auto-generated method stub
		return null;
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

	public Viewer display() {
		// TODO Auto-generated method stub
		return null;
	}

	public Viewer display(boolean autoLayout) {
		// TODO Auto-generated method stub
		return null;
	}

	public EdgeFactory<? extends Edge> edgeFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<ElementSink> elementSinks() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Iterable<? extends T> getEachEdge() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> Iterable<? extends T> getEachNode() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdge(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T getEdge(int index)
			throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getEdgeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends Edge> Iterator<T> getEdgeIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> Collection<T> getEdgeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> T getNode(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> T getNode(int index)
			throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNodeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T extends Node> Iterator<T> getNodeIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> Collection<T> getNodeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getStep() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isAutoCreationEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStrict() {
		// TODO Auto-generated method stub
		return false;
	}

	public NodeFactory<? extends Node> nodeFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean nullAttributesAreErrors() {
		// TODO Auto-generated method stub
		return false;
	}

	public void read(String filename) throws IOException, GraphParseException,
			ElementNotFoundException {
		// TODO Auto-generated method stub

	}

	public void read(FileSource input, String filename) throws IOException,
			GraphParseException {
		// TODO Auto-generated method stub

	}

	public <T extends Edge> T removeEdge(String from, String to)
			throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T removeEdge(String id)
			throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T removeEdge(int index)
			throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T removeEdge(int fromIndex, int toIndex)
			throws IndexOutOfBoundsException, ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T removeEdge(Node node1, Node node2)
			throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Edge> T removeEdge(Edge edge) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> T removeNode(String id)
			throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> T removeNode(int index)
			throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Node> T removeNode(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAutoCreate(boolean on) {
		// TODO Auto-generated method stub

	}

	public void setEdgeFactory(EdgeFactory<? extends Edge> ef) {
		// TODO Auto-generated method stub

	}

	public void setNodeFactory(NodeFactory<? extends Node> nf) {
		// TODO Auto-generated method stub

	}

	public void setNullAttributesAreErrors(boolean on) {
		// TODO Auto-generated method stub

	}

	public void setStrict(boolean on) {
		// TODO Auto-generated method stub

	}

	public void stepBegins(double time) {
		// TODO Auto-generated method stub

	}

	public void write(String filename) throws IOException {
		// TODO Auto-generated method stub

	}

	public void write(FileSink output, String filename) throws IOException {
		// TODO Auto-generated method stub

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

	public void addAttributeSink(AttributeSink sink) {
		// TODO Auto-generated method stub

	}

	public void addElementSink(ElementSink sink) {
		// TODO Auto-generated method stub

	}

	public void addSink(Sink sink) {
		// TODO Auto-generated method stub

	}

	public void clearAttributeSinks() {
		// TODO Auto-generated method stub

	}

	public void clearElementSinks() {
		// TODO Auto-generated method stub

	}

	public void clearSinks() {
		// TODO Auto-generated method stub

	}

	public void removeAttributeSink(AttributeSink sink) {
		// TODO Auto-generated method stub

	}

	public void removeElementSink(ElementSink sink) {
		// TODO Auto-generated method stub

	}

	public void removeSink(Sink sink) {
		// TODO Auto-generated method stub

	}

	public void edgeAttributeAdded(String sourceId, long timeId, String edgeId,
			String attribute, Object value) {
		// TODO Auto-generated method stub

	}

	public void edgeAttributeChanged(String sourceId, long timeId,
			String edgeId, String attribute, Object oldValue, Object newValue) {
		// TODO Auto-generated method stub

	}

	public void edgeAttributeRemoved(String sourceId, long timeId,
			String edgeId, String attribute) {
		// TODO Auto-generated method stub

	}

	public void graphAttributeAdded(String sourceId, long timeId,
			String attribute, Object value) {
		// TODO Auto-generated method stub

	}

	public void graphAttributeChanged(String sourceId, long timeId,
			String attribute, Object oldValue, Object newValue) {
		// TODO Auto-generated method stub

	}

	public void graphAttributeRemoved(String sourceId, long timeId,
			String attribute) {
		// TODO Auto-generated method stub

	}

	public void nodeAttributeAdded(String sourceId, long timeId, String nodeId,
			String attribute, Object value) {
		// TODO Auto-generated method stub

	}

	public void nodeAttributeChanged(String sourceId, long timeId,
			String nodeId, String attribute, Object oldValue, Object newValue) {
		// TODO Auto-generated method stub

	}

	public void nodeAttributeRemoved(String sourceId, long timeId,
			String nodeId, String attribute) {
		// TODO Auto-generated method stub

	}

	public void edgeAdded(String sourceId, long timeId, String edgeId,
			String fromNodeId, String toNodeId, boolean directed) {
		// TODO Auto-generated method stub

	}

	public void edgeRemoved(String sourceId, long timeId, String edgeId) {
		// TODO Auto-generated method stub

	}

	public void graphCleared(String sourceId, long timeId) {
		// TODO Auto-generated method stub

	}

	public void nodeAdded(String sourceId, long timeId, String nodeId) {
		// TODO Auto-generated method stub

	}

	public void nodeRemoved(String sourceId, long timeId, String nodeId) {
		// TODO Auto-generated method stub

	}

	public void stepBegins(String sourceId, long timeId, double step) {
		// TODO Auto-generated method stub

	}

	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
