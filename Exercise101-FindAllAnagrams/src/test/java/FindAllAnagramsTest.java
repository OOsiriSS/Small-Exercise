
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindAllAnagramsTest {

	@Test
	public void testValidAnagramA() {
		List<Integer> expected = Arrays.asList(0, 6);
		assertThat(FindAllAnagrams.findAnagrams("cbaebabacd", "abc"), is(expected));
	}
	
	@Test
	public void testValidAnagramB() {
		List<Integer> expected = Arrays.asList();
		assertThat(FindAllAnagrams.findAnagrams("cbaebabacd", "cbaebabacdabc"), is(expected));
	}
	
	
	@Test
	public void testValidAnagramC() {
		List<Integer> expected = Arrays.asList();
		assertThat(FindAllAnagrams.findAnagrams("", "cbaebabacdabc"), is(expected));
	}
	
	@Test
	public void testValidAnagramD() {
		List<Integer> expected = Arrays.asList(0,1,2,3,4,5);
		assertThat(FindAllAnagrams.findAnagrams("aaaaaa", "a"), is(expected));
	}
}
