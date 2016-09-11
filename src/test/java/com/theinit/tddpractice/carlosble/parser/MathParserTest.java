package com.theinit.tddpractice.carlosble.parser;

import com.theinit.tddpractice.carlosble.parser.MathParser;
import com.theinit.tddpractice.carlosble.parser.MathToken;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junitparams.JUnitParamsRunner.$;


/**
 * Created by INIT SERVICES on 11/9/16.
 */
@RunWith(JUnitParamsRunner.class)
public class MathParserTest {

    @Test
    @Parameters(method = "binaryParameters")
    public void parsesBinaryTokens(String expression, MathToken[] expectedTokens) {

        MathParser parser = new MathParser();

        List<MathToken> tokens = parser.getTokens(expression);

        Assert.assertArrayEquals(expectedTokens , tokens.toArray());
    }

    private Object[] binaryParameters() {
        return new Object[]{
                new Object[]{"2 + 2", arrayOfTokens("2", "+", "2")},
                new Object[]{"3 - 4", arrayOfTokens("3", "-", "4")},
                new Object[]{"31 * 10", arrayOfTokens("31", "*", "10")},
                new Object[]{"27 / 3", arrayOfTokens("27", "/", "3")},
        };
    }

    private MathToken[] arrayOfTokens(String ... args) {
        ArrayList<MathToken> tokens = new ArrayList<>();
        for (String stringToken: args) {
            tokens.add(new MathToken(stringToken));
        }
        return tokens.toArray(new MathToken[0]);
    }


}