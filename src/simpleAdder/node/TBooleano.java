/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TBooleano extends Token
{
    public TBooleano()
    {
        super.setText("booleano");
    }

    public TBooleano(int line, int pos)
    {
        super.setText("booleano");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBooleano(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBooleano(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBooleano text.");
    }
}
