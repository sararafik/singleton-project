package SingletonProject.SingletonProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {
		Singleton instanceOne = Singleton.getInstance();
		System.out.println("instanceOne" + instanceOne);
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("instanceTwo" + instanceTwo);
		assertEquals(instanceOne, instanceOne);
	}

}
