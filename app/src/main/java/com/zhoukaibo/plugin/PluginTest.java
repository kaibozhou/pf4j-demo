package com.zhoukaibo.plugin;

import com.zhoukaibo.sdk.Greeting;
import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginManager;

import java.nio.file.Paths;
import java.util.List;

/**
 * Demo shows usage of [PF4J](https://github.com/pf4j/pf4j).
 *
 * PF4J example.
 *
 * Author: [Kaibo](https://zhoukaibo.com)
 *
 */
public class PluginTest {
	public static void main(String[] args) {
		String projectDir = System.getProperty("user.dir");
		String pluginDir = projectDir + "/app/src/main/plugins";

		PluginManager pluginManager = new DefaultPluginManager(Paths.get(pluginDir));
		pluginManager.loadPlugins();
		pluginManager.startPlugins();

		List<Greeting> greetings = pluginManager.getExtensions(Greeting.class);
		System.out.println("Found: " + greetings.size());
		for (Greeting greeting : greetings) {
			System.out.println(greeting.sayHello("https://zhoukaibo.com"));
		}

		pluginManager.stopPlugins();
	}
}
