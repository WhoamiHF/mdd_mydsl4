/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.mydsl4.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/mydsl4/parser/antlr/internal/InternalMyDsl.tokens");
	}
}
