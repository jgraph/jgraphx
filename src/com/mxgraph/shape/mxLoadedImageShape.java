package com.mxgraph.shape;

import java.awt.Color;
import java.awt.Rectangle;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;

/**
 * A rectangular shape that contains a single image
 */
public class mxLoadedImageShape extends mxRectangleShape
{

    /**
     *
     */
    public void paintShape(mxGraphics2DCanvas canvas, mxCellState state)
    {
        super.paintShape(canvas, state);

        boolean flipH = mxUtils.isTrue( state.getStyle(),
                mxConstants.STYLE_IMAGE_FLIPH, false );
        boolean flipV = mxUtils.isTrue(state.getStyle(),
                mxConstants.STYLE_IMAGE_FLIPV, false);

        canvas.drawImage(getImageBounds(canvas, state),
                getLoadedImageForStyle(canvas, state),
                mxGraphics2DCanvas.PRESERVE_IMAGE_ASPECT, flipH, flipV);
    }

    /**
     *
     */
    public Rectangle getImageBounds(mxGraphics2DCanvas canvas, mxCellState state)
    {
        return state.getRectangle();
    }

    /**
     *
     */
    public boolean hasGradient(mxGraphics2DCanvas canvas, mxCellState state)
    {
        return false;
    }

    /**
     *
     */
    public java.awt.Image getLoadedImageForStyle(mxGraphics2DCanvas canvas, mxCellState state)
    {
        return canvas.getLoadedImageForStyle(state.getStyle());
    }

    /**
     *
     */
    public Color getFillColor(mxGraphics2DCanvas canvas, mxCellState state)
    {
        return mxUtils.getColor(state.getStyle(),
                mxConstants.STYLE_IMAGE_BACKGROUND);
    }

    /**
     *
     */
    public Color getStrokeColor(mxGraphics2DCanvas canvas, mxCellState state)
    {
        return mxUtils.getColor(state.getStyle(),
                mxConstants.STYLE_IMAGE_BORDER);
    }

}
