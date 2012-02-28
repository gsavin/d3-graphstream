package org.d3.graphstream.graph;

public interface D3GraphPart {
	public static enum ElementType {
		GRAPH, NODE, EDGE
	}

	boolean isHostingNode(String id);

	boolean isHostingEdge(String id);

	Object getElementAttribute(ElementType type, String eltId, String attrId);

	void setElementAttribute(ElementType type, String eltId, String attrId,
			Object value);

	void removeElementAttribute(ElementType type, String eltId, String attrId);

	void clearElementAttributes(ElementType type, String eltId);
}
