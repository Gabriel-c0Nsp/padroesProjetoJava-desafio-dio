package one.digitalinnovation.gof;

// Singleton
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;

// Strategy
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
  public static void main(String[] args) {

    // Testes relacionados ao Design Pattern Singleton:

    // Singleton
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);

    // Strategy
    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoDefensivo();

    Robo robo = new Robo();

    robo.setComportamento(normal);
    robo.mover();

    robo.setComportamento(defensivo);
    robo.mover();

    robo.setComportamento(agressivo);
    robo.mover();

    // Facade
    Facade facade = new Facade();
    facade.migrarCliente("Gabriel", "630.380.15");
  }
}
