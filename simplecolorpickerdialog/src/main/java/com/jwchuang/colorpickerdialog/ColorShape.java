
package com.jwchuang.colorpickerdialog;

import android.support.annotation.IntDef;

/**
 * The shape of the color preview
 */
@IntDef({ColorShape.SQUARE, ColorShape.CIRCLE})
public @interface ColorShape {

    int SQUARE = 0;

    int CIRCLE = 1;

}
