/**
 * Copyright (c) 2005, David Benson
 */
package com.mxgraph.layout.hierarchical.model;

import java.util.LinkedHashSet;

/**
 * An abstraction of a rank in the hierarchy layout. Should be ordered, perform
 * remove in constant time and contains in constant time
 */
public class mxGraphHierarchyRank extends LinkedHashSet<mxGraphAbstractHierarchyCell>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2781491210687143878L;
}
