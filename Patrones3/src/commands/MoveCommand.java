package commands;

import common.Command;
import plugins.Paintable;

// Command
public class MoveCommand implements Command {

  private Paintable paintable;

  private int dx;
  private int dy;

  // --------------------------------------------------------------------------------

  public MoveCommand(Paintable paintable, int dx, int dy) {
    this.paintable = paintable;

    this.dx = dx;
    this.dy = dy;
  }

  // --------------------------------------------------------------------------------

  @Override
  public void executeCommand() {
    paintable.move(+dx, +dy);
  }

  // --------------------------------------------------------------------------------

  @Override
  public void undoCommand() {
    paintable.move(-dx, -dy);
  }
}
