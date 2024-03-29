package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m1.model;

public class A {
	private Object key1 = new Object();
	private Object key2 = new Object();

	public void a() {
		synchronized (key1) {
			System.out.println("[" + Thread.currentThread().getName() + "] I am in a()");
			b();
		}
	}

	public void b() {
		synchronized (key2) {
			System.out.println("[" + Thread.currentThread().getName() + "] I am in b()");
			c();
		}
	}

	public void c() {
		synchronized (key1) {
			System.out.println("[" + Thread.currentThread().getName() + "] I am in c()");
		}
	}
}
