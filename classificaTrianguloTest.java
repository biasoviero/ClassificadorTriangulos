import org.junit.Test;
import java.util.ArrayList;
import junit.framework.TestCase;

public class classificaTrianguloTest extends TestCase{
    
    @Test
    public void testEscalenoValido(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(4);
        lados.add(5);
        assertTrue(classificaTriangulo.ehEscaleno(lados));
    }

    @Test
    public void testIsoscelesValido1(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(3);
        lados.add(4);
        assertTrue(classificaTriangulo.ehIsosceles(lados));
    }

    @Test
    public void testIsoscelesValido2(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(4);
        lados.add(3);
        assertTrue(classificaTriangulo.ehIsosceles(lados));
    }

    @Test
    public void testIsoscelesValido3(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(4);
        lados.add(3);
        lados.add(3);
        assertTrue(classificaTriangulo.ehIsosceles(lados));
    }

    @Test
    public void testEquilateroValido(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(6);
        lados.add(6);
        lados.add(6);
        assertTrue(classificaTriangulo.ehEquilatero(lados));
    }

    @Test
    public void testTodosZeros(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(0);
        lados.add(0);
        lados.add(0);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutaZeros1(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(0);
        lados.add(3);
        lados.add(3);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutaZeros2(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(0);
        lados.add(3);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutaZeros3(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(3);
        lados.add(0);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testTodosNegativos(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(-1);
        lados.add(-1);
        lados.add(-1);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutNeg1(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(-3);
        lados.add(4);
        lados.add(5);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutNeg2(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(-4);
        lados.add(5);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutNeg3(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(4);
        lados.add(-5);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutSomaIgual1(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(4);
        lados.add(7);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutSomaIgual2(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(7);
        lados.add(4);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutSomaIgual3(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(4);
        lados.add(3);
        lados.add(7);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutSomaIgual4(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(4);
        lados.add(7);
        lados.add(3);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutSomaIgual5(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(7);
        lados.add(4);
        lados.add(3);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutSomaIgual6(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(7);
        lados.add(3);
        lados.add(4);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutInvalido1(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(7);
        lados.add(3);
        lados.add(3);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }
    @Test
    public void testPermutInvalido2(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(7);
        lados.add(3);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }

    @Test
    public void testPermutInvalido3(){
        ArrayList<Integer> lados = new ArrayList<Integer>();
        lados.add(3);
        lados.add(3);
        lados.add(7);
        assertFalse(classificaTriangulo.ehTriangulo(lados));
    }
}
