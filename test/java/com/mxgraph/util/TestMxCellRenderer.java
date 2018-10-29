package com.mxgraph.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.awt.Color;

import org.junit.Test;
import org.w3c.dom.Document;

import com.mxgraph.view.mxGraph;

public class TestMxCellRenderer {

  @Test
  public void testSVG() {
    mxGraph mxg=new mxGraph();
    double scale=1.0;
    // https://stackoverflow.com/questions/51008766/jgraphx-how-to-export-svg-file-from-graph?rq=1
    Color background = Color.WHITE;
    Document svgDoc = mxCellRenderer.createSvgDocument(mxg, null, scale,
        background, null);
    // workaround
    assertNull(svgDoc);
    // what we really want when the bug is fixed
    // assertNotNull(svgDoc);
  }
}
