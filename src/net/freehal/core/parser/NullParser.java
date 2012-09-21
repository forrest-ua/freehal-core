package net.freehal.core.parser;

public class NullParser extends AbstractParser {

	public NullParser(String rawInput) {
		super(rawInput);
	}

	@Override
	protected String cleanInput(String str) {
		return str;
	}

	@Override
	protected String simplifyInput(String str) {
		return str;
	}

	@Override
	protected String extendInput(String str) {
		return str;
	}

}