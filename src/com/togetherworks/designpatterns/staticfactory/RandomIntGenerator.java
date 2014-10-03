package com.togetherworks.designpatterns.staticfactory;

/**
 * 
 * @author Cheng Zhang We already mentioned the first advantage of static
 *         factory methods: unlike constructors they have names. This has two
 *         direct consequences,
 * 
 *         We can provide a meaningful name for our constructors. We can provide
 *         several constructors with the same number and type of parameters,
 *         something that as we saw earlier we can¡¯t do with class constructors.
 *         ref:
 *         http://jlordiales.wordpress.com/2012/12/26/static-factory-methods
 *         -vs-traditional-constructors/
 */
public class RandomIntGenerator {
	private final int min;
	private final int max;

	// private constructor
	private RandomIntGenerator(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public static RandomIntGenerator between(int min, int max) {
		return new RandomIntGenerator(min, max);
	}

	public static RandomIntGenerator greatThan(int min) {
		return new RandomIntGenerator(min, Integer.MAX_VALUE);
	}

	public static RandomIntGenerator lessThan(int max) {
		return new RandomIntGenerator(Integer.MIN_VALUE, max);
	}

	public int next() {
		// ...
		return 0;
	}
}
