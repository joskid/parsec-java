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
public class ParsecGamepadButtonMessage extends Structure {
	/** < Unique client-provided index identifying the gamepad. */
	public int id;
	/** < `true` if the button was pressed, `false` if released. */
	public byte pressed;
	/**
	 * < `ParsecGamepadButton` button.<br>
	 * C type : ParsecGamepadButton
	 */
	public int button;
	public ParsecGamepadButtonMessage() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "pressed", "button");
	}
	/**
	 * @param id < Unique client-provided index identifying the gamepad.<br>
	 * @param pressed < `true` if the button was pressed, `false` if released.<br>
	 * @param button @see ParsecGamepadButton<br>
	 * < `ParsecGamepadButton` button.<br>
	 * C type : ParsecGamepadButton
	 */
	public ParsecGamepadButtonMessage(int id, byte pressed, int button) {
		super();
		this.id = id;
		this.pressed = pressed;
		this.button = button;
	}
	public ParsecGamepadButtonMessage(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ParsecGamepadButtonMessage implements Structure.ByReference {
		
	};
	public static class ByValue extends ParsecGamepadButtonMessage implements Structure.ByValue {
		
	};
}