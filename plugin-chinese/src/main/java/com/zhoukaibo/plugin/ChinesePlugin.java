package com.zhoukaibo.plugin;

import com.zhoukaibo.sdk.Greeting;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;

/**
 * Chinese plugin to say hello with chinese.
 */
public class ChinesePlugin extends Plugin {

	public ChinesePlugin(PluginWrapper wrapper) {
		super(wrapper);
	}

	@Override
	public void start() throws PluginException {
		System.out.println("Chinese plugin start.");
		super.start();
	}

	@Override
	public void stop() throws PluginException {
		System.out.println("Chinese plugin stop.");
		super.stop();
	}

	@Extension
	public static class ChineseGreeting implements Greeting {

		@Override
		public String sayHello(String name) {
			return "你好, " + name;
		}
	}
}