package org.d3.graphstream.graph.cache;

import org.d3.tools.Cache;
import org.d3.tools.CacheCreationException;
import org.graphstream.graph.Node;

public class NodeCache extends Cache<String, Node> {

	public static final int DEFAULT_NODE_CACHE = 1000;
	
	public NodeCache() {
		this(DEFAULT_NODE_CACHE);
	}
	
	public NodeCache(int capacity) {
		super(capacity);
	}

	protected Node createObject(String key) throws CacheCreationException {
		// TODO Auto-generated method stub
		return null;
	}

}
