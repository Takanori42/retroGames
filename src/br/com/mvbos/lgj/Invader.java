package br.com.mvbos.lgj;

import br.com.mvbos.lgj.Elemento;
import java.awt.Color;
import java.awt.Graphics2D;

public class Invader extends Elemento {
    public static void main(String[] args) {

    }

    private int contador, contadorEspera, moverInimigos, totalInimigos, destruidos, level;
    boolean colideBordas = false;

    private Invader[][] invasores = new Invader[11][5];
    private Invader.Tipos[] tipoPorLinha = { Tipos.PEQUENO,
            Tipos.MEDIO, Tipos.MEDIO, Tipos.GRANDE, Tipos.GRANDE };

    private void carregarJogo() {

        for (int i = 0; i < invasores.length; i++) {
            for (int j = 0; j < invasores[i].length; j++)
                ;

            e.setAtivo(true);

            e.setPx(i * e.getLargura() + (i + 1) * espacamento);
            e.setPy(j * e.getAltura() + j * espacamento + linhaBase);

            invasores[i][j] = e;
        }
    }

    if(contador>contadorEspera)

    {
        moverInimigos = true;
        contador = 0;
        contadorEspera = totalInimigos - destruidos - level * level;
    }else
    {
        contador++;
    }if(tanque.isAtivo())
    {
        if (controleTecla[2]) {
            tanque.setPx(tanque.getPx() - tanque.getVel());
        } else if (controleTecla[3]) {
            tanque.setPx(tanque.getPx() + tanque.getVel());
        }
    }
    // pressionou espaço, adiciona tiro
    if(controleTecla[4]&&!tiroTanque.isAtivo())
    {
        tiroTanque.setPx(tanque.getPx() + tanque.getLargura() / 2
                - tiroTanque.getLargura() / 2);
        tiroTanque.setPy(tanque.getPy() - tiroTanque.getAltura());
        tiroTanque.setAtivo(true);
    }if(chefe.isAtivo())
    {
        chefe.incPx(tanque.getVel() - 1);

        if (!tiroChefe.isAtivo() && Util.colideX(chefe, tanque)) {
            addTiroInimigo(chefe, tiroChefe);
        }
        if (chefe.getPx() > tela.getWidth()) {
            chefe.setAtivo(false);
        }
    }
}

}
