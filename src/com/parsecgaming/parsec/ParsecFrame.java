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
public class ParsecFrame extends Structure {
	/**
	 * @see ParsecLibrary.ParsecColorFormat
	 * < Color format.<br>
	 * C type : ParsecColorFormat
	 */
	public int format;
	/** < Size in bytes of the `image` buffer parameter of ::ParsecFrameCallback. */
	public int size;
	/** < Width in pixels of the visible area of the frame. */
	public int width;
	/** < Height in pixels of the visible area of the frame. */
	public int height;
	/** < Actual width of the frame including padding. */
	public int fullWidth;
	/** < Actual height of the frame including padding. */
	public int fullHeight;
	public ParsecFrame() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("format", "size", "width", "height", "fullWidth", "fullHeight");
	}
	/**
	 * @param format @see ParsecColorFormat<br>
	 * < Color format.<br>
	 * C type : ParsecColorFormat<br>
	 * @param size < Size in bytes of the `image` buffer parameter of ::ParsecFrameCallback.<br>
	 * @param width < Width in pixels of the visible area of the frame.<br>
	 * @param height < Height in pixels of the visible area of the frame.<br>
	 * @param fullWidth < Actual width of the frame including padding.<br>
	 * @param fullHeight < Actual height of the frame including padding.
	 */
	public ParsecFrame(int format, int size, int width, int height, int fullWidth, int fullHeight) {
		super();
		this.format = format;
		this.size = size;
		this.width = width;
		this.height = height;
		this.fullWidth = fullWidth;
		this.fullHeight = fullHeight;
	}
	public ParsecFrame(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ParsecFrame implements Structure.ByReference {
		
	};
	public static class ByValue extends ParsecFrame implements Structure.ByValue {
		
	};
}
