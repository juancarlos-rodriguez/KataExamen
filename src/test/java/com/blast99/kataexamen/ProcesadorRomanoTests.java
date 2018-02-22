package com.blast99.kataexamen;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcesadorRomanoTests {

    private ProcesadorRomano instance = new ProcesadorRomano();

    @Test
    public void testConvierte() throws Exception {

        Assert.assertEquals(0, instance.convierte(""));
        Assert.assertEquals(1, instance.convierte("I"));
        Assert.assertEquals(2, instance.convierte("II"));
        Assert.assertEquals(3, instance.convierte("III"));
        Assert.assertEquals(5, instance.convierte("V"));
        Assert.assertEquals(10, instance.convierte("X"));
        Assert.assertEquals(50, instance.convierte("L"));
        Assert.assertEquals(100, instance.convierte("C"));
        Assert.assertEquals(500, instance.convierte("D"));
        Assert.assertEquals(1000, instance.convierte("M"));
        Assert.assertEquals(0, instance.convierte("T"));

        Assert.assertEquals(60, instance.convierte("LX"));
        Assert.assertEquals(16, instance.convierte("XVI"));
        Assert.assertEquals(8, instance.convierte("VIII"));
        Assert.assertEquals(21, instance.convierte("XXI"));
        Assert.assertEquals(101, instance.convierte("CI"));
        Assert.assertEquals(161, instance.convierte("CLXI"));

    }

    @Test
    public void testCantidadAceptableChar() {

        Assert.assertTrue(instance.cantidadAceptableChar("III"));
        Assert.assertFalse(instance.cantidadAceptableChar("IIII"));
        Assert.assertTrue(instance.cantidadAceptableChar("L"));
        Assert.assertFalse(instance.cantidadAceptableChar("LL"));
        Assert.assertTrue(instance.cantidadAceptableChar("D"));
        Assert.assertFalse(instance.cantidadAceptableChar("DD"));
        Assert.assertTrue(instance.cantidadAceptableChar("XXX"));
        Assert.assertFalse(instance.cantidadAceptableChar("XXXX"));
        Assert.assertTrue(instance.cantidadAceptableChar("CCC"));
        Assert.assertFalse(instance.cantidadAceptableChar("CCCC"));

    }

    @Test
    public void testOrdenDescendiente() {

        Assert.assertFalse(instance.ordenDescendiente("XXL"));
        Assert.assertTrue(instance.ordenDescendiente("LXX"));
        Assert.assertTrue(instance.ordenDescendiente("X"));
        Assert.assertTrue(instance.ordenDescendiente(""));
        Assert.assertTrue(instance.ordenDescendiente("LX"));
        Assert.assertTrue(instance.ordenDescendiente("XVI"));
        Assert.assertTrue(instance.ordenDescendiente("VIII"));
        Assert.assertTrue(instance.ordenDescendiente("XXI"));
        Assert.assertTrue(instance.ordenDescendiente("CI"));
        Assert.assertTrue(instance.ordenDescendiente("CLXI"));
    }

    @Test
    public void testRetornaValorUnidad() {

        Assert.assertEquals(1, instance.retornaValorUnidad('I'));
        Assert.assertEquals(5, instance.retornaValorUnidad('V'));
        Assert.assertEquals(10, instance.retornaValorUnidad('X'));
        Assert.assertEquals(50, instance.retornaValorUnidad('L'));
        Assert.assertEquals(100, instance.retornaValorUnidad('C'));
        Assert.assertEquals(500, instance.retornaValorUnidad('D'));
        Assert.assertEquals(1000, instance.retornaValorUnidad('M'));
        Assert.assertEquals(0, instance.retornaValorUnidad('J'));

    }

    @Test(expected = Exception.class)
    public void testCantidadAceptableCharException() throws Exception {
        instance.convierte("CCCC");
    }

    @Test(expected = Exception.class)
    public void testOrdenDescendienteException() throws Exception {
        instance.convierte("XXL");
    }


}
