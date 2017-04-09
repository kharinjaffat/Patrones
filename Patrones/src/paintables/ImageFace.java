package paintables;

import common.ImageCache;
import common.PaintableBase;
import common.SmileConstants;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageFace extends PaintableBase {

  private BufferedImage bufferedImage;

  // --------------------------------------------------------------------------------

  public ImageFace(int x1, int y1, int x2, int y2, int state) {
    super(x1, y1, x2, y2);

    switch (state) {
      case SmileConstants.SMILE_DW :
        bufferedImage = ImageCache.getInstance().getImage("smile0.png");
        break;
      case SmileConstants.SMILE_OK :
        bufferedImage = ImageCache.getInstance().getImage("smile1.png");
        break;
      case SmileConstants.SMILE_UP :
        bufferedImage = ImageCache.getInstance().getImage("smile2.png");
        break;
    }
  }

  // --------------------------------------------------------------------------------

  @Override
  public void draw(Graphics2D g2d) {
    g2d.drawImage(bufferedImage, x1, y1, x2 - x1, y2 - y1, null);
  }
}
