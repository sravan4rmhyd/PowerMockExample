package org.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PowerMockDemo.class)
public class PowerMockDemoTest {
	
	private PowerMockDemo powerMockDemoSpy;
	 
    @Before
    public void setUp() {
        powerMockDemoSpy = PowerMockito.spy(new PowerMockDemo());
    }
 
    @Test
    public void testMockPrivateMethod() throws Exception {
    	
    	Person mockPerson = mock(Person.class);
 
        PowerMockito.doReturn(mockPerson).when(powerMockDemoSpy, "privateMethod", anyString(),anyString());
 
        Person actualResponse = powerMockDemoSpy.publicMethod("sravan", "kumar");
        
        assertThat(actualResponse, is(mockPerson));
    }
}
