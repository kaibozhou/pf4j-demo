package com.zhoukaibo.plugin;

import com.zhoukaibo.sdk.Greeting;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;

/**
 * English plugin to say hello with english.
 */
public class EnglishPlugin extends Plugin {

	public EnglishPlugin(PluginWrapper wrapper) {
		super(wrapper);
	}

	@Override
	public void start() throws PluginException {
		System.out.println("English plugin start.");
		super.start();
	}

	@Override
	public void stop() throws PluginException {
		System.out.println("English plugin stop.");
		super.stop();
	}

	@Extension
	public static class EnglishGreeting implements Greeting {

		@Override
		public String sayHello(String name) {
			return "Hi, " + name;
		}
	}
}
