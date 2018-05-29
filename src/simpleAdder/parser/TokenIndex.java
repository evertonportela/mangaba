/* This file was generated by SableCC (http://www.sablecc.org/). */

package simpleAdder.parser;

import simpleAdder.node.*;
import simpleAdder.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTPrograma(@SuppressWarnings("unused") TPrograma node)
    {
        this.index = 0;
    }

    @Override
    public void caseTInteiro(@SuppressWarnings("unused") TInteiro node)
    {
        this.index = 1;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 2;
    }

    @Override
    public void caseTCaractere(@SuppressWarnings("unused") TCaractere node)
    {
        this.index = 3;
    }

    @Override
    public void caseTBooleano(@SuppressWarnings("unused") TBooleano node)
    {
        this.index = 4;
    }

    @Override
    public void caseTInicio(@SuppressWarnings("unused") TInicio node)
    {
        this.index = 5;
    }

    @Override
    public void caseTFim(@SuppressWarnings("unused") TFim node)
    {
        this.index = 6;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 7;
    }

    @Override
    public void caseTSenao(@SuppressWarnings("unused") TSenao node)
    {
        this.index = 8;
    }

    @Override
    public void caseTEnquanto(@SuppressWarnings("unused") TEnquanto node)
    {
        this.index = 9;
    }

    @Override
    public void caseTPara(@SuppressWarnings("unused") TPara node)
    {
        this.index = 10;
    }

    @Override
    public void caseTAvalie(@SuppressWarnings("unused") TAvalie node)
    {
        this.index = 11;
    }

    @Override
    public void caseTCaso(@SuppressWarnings("unused") TCaso node)
    {
        this.index = 12;
    }

    @Override
    public void caseTTinteiro(@SuppressWarnings("unused") TTinteiro node)
    {
        this.index = 13;
    }

    @Override
    public void caseTTreal(@SuppressWarnings("unused") TTreal node)
    {
        this.index = 14;
    }

    @Override
    public void caseTTcaractere(@SuppressWarnings("unused") TTcaractere node)
    {
        this.index = 15;
    }

    @Override
    public void caseTTbooleano(@SuppressWarnings("unused") TTbooleano node)
    {
        this.index = 16;
    }

    @Override
    public void caseTAtribuicao(@SuppressWarnings("unused") TAtribuicao node)
    {
        this.index = 17;
    }

    @Override
    public void caseTPontovirgula(@SuppressWarnings("unused") TPontovirgula node)
    {
        this.index = 18;
    }

    @Override
    public void caseTIdentificador(@SuppressWarnings("unused") TIdentificador node)
    {
        this.index = 19;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 20;
    }

    @Override
    public void caseTAparentese(@SuppressWarnings("unused") TAparentese node)
    {
        this.index = 21;
    }

    @Override
    public void caseTFparentese(@SuppressWarnings("unused") TFparentese node)
    {
        this.index = 22;
    }

    @Override
    public void caseTAcolchete(@SuppressWarnings("unused") TAcolchete node)
    {
        this.index = 23;
    }

    @Override
    public void caseTFcolchete(@SuppressWarnings("unused") TFcolchete node)
    {
        this.index = 24;
    }

    @Override
    public void caseTDoispontos(@SuppressWarnings("unused") TDoispontos node)
    {
        this.index = 25;
    }

    @Override
    public void caseTVirgula(@SuppressWarnings("unused") TVirgula node)
    {
        this.index = 26;
    }

    @Override
    public void caseTComentariolinha(@SuppressWarnings("unused") TComentariolinha node)
    {
        this.index = 27;
    }

    @Override
    public void caseTComentario(@SuppressWarnings("unused") TComentario node)
    {
        this.index = 28;
    }

    @Override
    public void caseTCommentEnd(@SuppressWarnings("unused") TCommentEnd node)
    {
        this.index = 29;
    }

    @Override
    public void caseTCommentBody(@SuppressWarnings("unused") TCommentBody node)
    {
        this.index = 30;
    }

    @Override
    public void caseTOpsoma(@SuppressWarnings("unused") TOpsoma node)
    {
        this.index = 31;
    }

    @Override
    public void caseTOpsub(@SuppressWarnings("unused") TOpsub node)
    {
        this.index = 32;
    }

    @Override
    public void caseTOpmul(@SuppressWarnings("unused") TOpmul node)
    {
        this.index = 33;
    }

    @Override
    public void caseTOpdiv(@SuppressWarnings("unused") TOpdiv node)
    {
        this.index = 34;
    }

    @Override
    public void caseTMaiorq(@SuppressWarnings("unused") TMaiorq node)
    {
        this.index = 35;
    }

    @Override
    public void caseTMenorq(@SuppressWarnings("unused") TMenorq node)
    {
        this.index = 36;
    }

    @Override
    public void caseTMaigualq(@SuppressWarnings("unused") TMaigualq node)
    {
        this.index = 37;
    }

    @Override
    public void caseTMeigualq(@SuppressWarnings("unused") TMeigualq node)
    {
        this.index = 38;
    }

    @Override
    public void caseTIgual(@SuppressWarnings("unused") TIgual node)
    {
        this.index = 39;
    }

    @Override
    public void caseTEbooleano(@SuppressWarnings("unused") TEbooleano node)
    {
        this.index = 40;
    }

    @Override
    public void caseTOubooleano(@SuppressWarnings("unused") TOubooleano node)
    {
        this.index = 41;
    }

    @Override
    public void caseTNaobooleano(@SuppressWarnings("unused") TNaobooleano node)
    {
        this.index = 42;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 43;
    }
}
