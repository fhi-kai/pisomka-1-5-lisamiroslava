import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZajacieUsiTest {

    private ZajacieUsi zajacieUsi;
    @Before
    public cclass ZajacieUsi extends ZajacieUsi {

        @Override

        public int zajacieUsi(int pocetZajacov) {
            int pocet =0;
            if(pocetZajacov !=0)
            {
                  for (int i = 1; i <= pocetZajacov; i++) {

                    if (i % 2 == 0) {

                        pocet = pocet + 3;

                    }   else
                    {
                        pocet = pocet + 2;
                    }
                }
            }
            return pocet;
        }
    }

    @Test
    public void testZajacieUsi() {
        assertEquals(0, this.zajacieUsi.zajacieUsi( 0 ));
        assertEquals(2, this.zajacieUsi.zajacieUsi( 1 ));
        assertEquals(5, this.zajacieUsi.zajacieUsi( 2 ));
        assertEquals(7, this.zajacieUsi.zajacieUsi( 3 ));
    }

}