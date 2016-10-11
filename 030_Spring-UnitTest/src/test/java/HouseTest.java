import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.mustafazorbaz.*; 

 
public class HouseTest {


	@Test
	public void polisGorevTestEt() {
		
		Emniyet mockGorevNesnesi  = mock(Emniyet.class);
		
		Polis polis = new Polis(mockGorevNesnesi);
		polis.calis();
		
		verify(mockGorevNesnesi,times(1)).gorevVer();;
		
	}
	

}
