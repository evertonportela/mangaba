/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.node;

import simpleAdder.analysis.*;

@SuppressWarnings("nls")
public final class TNaobooleano extends Token
{
    public TNaobooleano()
    {
        super.setText("nao");
    }

    public TNaobooleano(int line, int pos)
    {
        super.setText("nao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNaobooleano(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNaobooleano(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNaobooleano text.");
    }
}
