package dev.rromulos;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class HelloLambdaTest extends TestCase
{
    @Test
    public void testReturnHelloMessage()
    {
        HelloLambda lambda = new HelloLambda();
        Assertions.assertEquals("First test using AWS Lambda", lambda.handle());
    }
}
