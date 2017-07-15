package com.gavindonnelly.g2d;

/**
 * Created by gavindonnelly on 15/07/2017.
 */

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;

public class G2DObjectTest {

    @Test
    public void shouldFailOnNullIdentifiers() {
        G2DObject g2dObjectMockEmpty = Mockito.mock(G2DObject.class, Mockito.CALLS_REAL_METHODS);
        assertNull(g2dObjectMockEmpty.getColor());
    }

}