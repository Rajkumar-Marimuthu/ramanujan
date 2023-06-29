import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;


public class ListTest {

	@Test
	public void testMockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}

	@Test
	public void testMockListSizeMethodReturnMulipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void testMockListGetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("myname");
		assertEquals("myname", listMock.get(0));
		assertEquals("myname", listMock.get(1));
		
		when(listMock.get(anyInt())).thenReturn(new RuntimeException("Something went wrong"));
		listMock.get(0);
	}
	
	@Test(expected = RuntimeException.class)
	public void testMockListGetMethodException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
		listMock.get(0);
	}
}
