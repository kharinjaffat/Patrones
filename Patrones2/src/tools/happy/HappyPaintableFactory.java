package tools.happy;

import common.Paintable;
import common.PaintableFactory;
import paintables.DrawnFace;
import common.SmileConstants;

// Factory
public class HappyPaintableFactory implements PaintableFactory {

   private boolean useImage = false;
   private int happySmile = SmileConstants.SMILE_UP;

  public Paintable create(int x1, int y1, int x2, int y2) {
      if (useImage) {
    return new HappyImageFace(x1, y1, x2, y2);
     } else {
         return new DrawnFace(x1, y1, x2, y2,happySmile);
       }
  }
}
