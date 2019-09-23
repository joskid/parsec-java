package com.parsecgaming.parsec;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ParsecClientUserDataEvent extends Structure {
	/** < User-defined message ID set by the host. */
	public int id;
	/** < Buffer lookup key passed to ::ParsecGetBuffer to retrieve the message. */
	public int key;
	public ParsecClientUserDataEvent() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "key");
	}
	/**
	 * @param id < User-defined message ID set by the host.<br>
	 * @param key < Buffer lookup key passed to ::ParsecGetBuffer to retrieve the message.
	 */
	public ParsecClientUserDataEvent(int id, int key) {
		super();
		this.id = id;
		this.key = key;
	}
	public ParsecClientUserDataEvent(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ParsecClientUserDataEvent implements Structure.ByReference {
		
	};
	public static class ByValue extends ParsecClientUserDataEvent implements Structure.ByValue {
		
	};
}
