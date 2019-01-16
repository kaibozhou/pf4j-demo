## Introduction
Demo shows the usage of [PF4J](https://github.com/pf4j/pf4j).

## Componets
### Inteface
```
/**
 * The Greeting interface.
 */
public interface Greeting extends ExtensionPoint {

	String sayHello(String name);
}
```

### Plugins
It includes [`ChinesePlugin`](https://github.com/kaibozhou/pf4j-demo/blob/master/plugin-chinese/src/main/java/com/zhoukaibo/plugin/ChinesePlugin.java) and [`EnglishPlugin`](https://github.com/kaibozhou/pf4j-demo/blob/master/plugin-english/src/main/java/com/zhoukaibo/plugin/EnglishPlugin.java) which implements the `sayHello` interface.

### App
[`PluginTest`](https://github.com/kaibozhou/pf4j-demo/blob/master/plugin-app/src/main/java/com/zhoukaibo/plugin/PluginTest.java) is the entry function that calls the plugin.

## How to use
1. Run `build.sh`
2. Run `PluginTest` in IDEA and the result will ouput as follows:
```
English plugin start.
Chinese plugin start.
Found: 2
Hi, https://zhoukaibo.com
你好, https://zhoukaibo.com
Chinese plugin stop.
English plugin stop.
```

=====================================================================

Chinese document：

## 说明
这是展示 [PF4J](https://github.com/pf4j/pf4j) 的用法的例子。

## 组件
### 接口
```
/**
 * The Greeting interface.
 */
public interface Greeting extends ExtensionPoint {

	String sayHello(String name);
}
```

### 插件
包含 [`ChinesePlugin`](https://github.com/kaibozhou/pf4j-demo/blob/master/plugin-chinese/src/main/java/com/zhoukaibo/plugin/ChinesePlugin.java)和 [`EnglishPlugin`](https://github.com/kaibozhou/pf4j-demo/blob/master/plugin-english/src/main/java/com/zhoukaibo/plugin/EnglishPlugin.java) 两个插件，它们都实现了 `sayHello` 接口.

### 应用入口
[`PluginTest`](https://github.com/kaibozhou/pf4j-demo/blob/master/plugin-app/src/main/java/com/zhoukaibo/plugin/PluginTest.java) 是入口函数，对插件进行调用.

## 如何使用
1. 运行 build.sh
2. 在 IDEA 里面运行 PluginTest 就能看到结果:
```
English plugin start.
Chinese plugin start.
Found: 2
Hi, https://zhoukaibo.com
你好, https://zhoukaibo.com
Chinese plugin stop.
English plugin stop.
```
