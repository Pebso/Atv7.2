import org.junit.Test;


public class seguntaAtvTest {
  @Test 
  public void testeSegundaAtv(){
    segundaAtv tSegundaAtv = new segundaAtv();
    double num1 = tSegundaAtv.num1(5.5);
    double num2 = tSegundaAtv.num2(5.5);
    double soma = tSegundaAtv.soma(num1, num2);
    double media = tSegundaAtv.media(soma/2);
    
  }
    
}
