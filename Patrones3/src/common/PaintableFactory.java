package common;

// Factory
import plugins.Paintable;
public interface PaintableFactory {

  public Paintable create(int x1, int y1, int x2, int y2);
}
