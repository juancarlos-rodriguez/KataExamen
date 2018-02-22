package com.blast99.kataexamen;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcesadorRomanoTests {

    @Test
    public void testConvierte() {
        ProcesadorRomano instance = new ProcesadorRomano();

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


        Assert.assertFalse(instance.cantidadAceptableChar("XXXX"));





    }

}
