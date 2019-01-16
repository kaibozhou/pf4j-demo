package com.zhoukaibo.sdk;

import org.pf4j.ExtensionPoint;

/**
 * The Greeting interface.
 */
public interface Greeting extends ExtensionPoint {

	String sayHello(String name);
}
