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
public class ParsecMouseMotionMessage extends Structure {
	/** < The absolute horizontal screen coordinate of the cursor  if `relative` is `false`, or the delta (can be negative) if `relative` is `true`. */
	public int x;
	/** < The absolute vertical screen coordinate of the cursor if `relative` is `false`, or the delta (can be negative) if `relative` is `true`. */
	public int y;
	/** < `true` for relative mode, `false` for absolute mode. See details. */
	public byte relative;
	/** C type : uint8_t[3] */
	public byte[] __pad = new byte[3];
	public ParsecMouseMotionMessage() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("x", "y", "relative", "__pad");
	}
	/**
	 * @param x < The absolute horizontal screen coordinate of the cursor  if `relative` is `false`, or the delta (can be negative) if `relative` is `true`.<br>
	 * @param y < The absolute vertical screen coordinate of the cursor if `relative` is `false`, or the delta (can be negative) if `relative` is `true`.<br>
	 * @param relative < `true` for relative mode, `false` for absolute mode. See details.<br>
	 * @param __pad C type : uint8_t[3]
	 */
	public ParsecMouseMotionMessage(int x, int y, byte relative, byte __pad[]) {
		super();
		this.x = x;
		this.y = y;
		this.relative = relative;
		if ((__pad.length != this.__pad.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.__pad = __pad;
	}
	public ParsecMouseMotionMessage(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ParsecMouseMotionMessage implements Structure.ByReference {
		
	};
	public static class ByValue extends ParsecMouseMotionMessage implements Structure.ByValue {
		
	};
}
